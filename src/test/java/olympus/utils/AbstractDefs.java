package olympus.utils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import olympus.application.main.Startup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Startup.class)
@WebAppConfiguration
public abstract class AbstractDefs {

	protected RestTemplate restTemplate = null;

	protected void executeGet(String url) throws IOException {
		final Map<String, String> headers = new HashMap<>();
		headers.put("Accept", "application/json");
		if (restTemplate == null) {
			restTemplate = new RestTemplate();
		}
	}

}
