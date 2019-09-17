package jooqexample.springapp;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//import static jooqexample.jooqmodel.Tables.SAMPLETABLE;

@SpringBootApplication
@EnableJpaRepositories({"jooqexample.jpamodel"})
@EntityScan({"jooqexample.jpamodel"})
@EnableTransactionManagement
@EnableConfigurationProperties
public class JpaSpringApplication {

    @Autowired
    DataSource ds;

    @Autowired
    DSLContext jq;

    public static void main(String[] args) {
        SpringApplication.run(JpaSpringApplication.class, args);
    }

    @EventListener(ApplicationStartedEvent.class)
    public void test() {
        //jq.insertInto(SAMPLETABLE).set(SAMPLETABLE.ID, "TEST").execute();
    }
}
