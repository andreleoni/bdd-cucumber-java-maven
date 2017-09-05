package olympus.application.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "personalfinance")
@EnableJpaRepositories("personalfinance")
@EntityScan("personalfinance")
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

	private static final String PERSISTENCE_INTEGRATION_TEST = "persistence-integration-test";

	@Bean
	public EntityManager createEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_INTEGRATION_TEST);
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
}
