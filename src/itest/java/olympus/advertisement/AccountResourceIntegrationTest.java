package olympus.advertisement;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import olympus.application.main.Startup;
import olympus.domain.advertisement.Advertisement;
import olympus.domain.advertisement.repository.AdvertisementRequirementRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Startup.class)
@WebAppConfiguration
@ComponentScan("personalfinance")
@EnableJpaRepositories("personalfinance")
@EntityScan("personalfinance")
public class AccountResourceIntegrationTest {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    private HttpMessageConverter mappingJackson2HttpMessageConverter;
    
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    
    private AdvertisementRequirementRepository advertisementRequirementRepository;

    @Autowired
    void setConverters(HttpMessageConverter<?>[] converters) {

        this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream()
            .filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter)
            .findAny()
            .orElse(null);

        assertNotNull("the JSON message converter must not be null", this.mappingJackson2HttpMessageConverter);
    }

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();

        this.advertisementRequirementRepository.saveAndFlush(new Advertisement());
    }
    
	@Test
	public void balanceNotFound() throws Exception {
		mockMvc.perform(get("/account/2")
                .contentType(contentType))
                .andExpect(status().isNotFound());
	}

	@Test
	public void balanceFound() throws Exception {
		mockMvc.perform(get("/account/1")
				.contentType(contentType))
		.andExpect(status().isOk())
		.andExpect(content().contentType(contentType))
		.andExpect(jsonPath("$.account.number", is(1)));
	}
	
	@Test
    public void createAccount() throws Exception {
        String json = json(new Advertisement());

        this.mockMvc.perform(post("/account/create")
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }

	protected String json(Object o) throws IOException {
        MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
        this.mappingJackson2HttpMessageConverter.write(
                o, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
        return mockHttpOutputMessage.getBodyAsString();
    }
}
