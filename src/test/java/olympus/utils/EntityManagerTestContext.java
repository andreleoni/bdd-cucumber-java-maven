package olympus.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntityManagerTestContext {

    private EntityManagerFactory factory = null;
    private EntityManager manager = null;
    private static final String PERSISTENCE_INTEGRATION_TEST = "persistence-integration-test";

    @Bean
    public EntityManager createEntityManager() {
        this.factory = Persistence.createEntityManagerFactory(PERSISTENCE_INTEGRATION_TEST);
        this.manager = this.factory.createEntityManager();
        this.manager.getTransaction().begin();
        return this.manager;
    }

    public void end() {
        try {
            this.manager.getTransaction().commit();
            this.manager.close();
            this.factory.close();
        } catch (final Exception e) {
            System.out.println("Error on close entity manager.");
            e.printStackTrace();
        }
    }

    public EntityManager getEntityManager() {
        return this.manager;
    }

    public void commitAndOpenTransaction() {
        this.manager.getTransaction().commit();
        this.manager.getTransaction().begin();
    }
}
