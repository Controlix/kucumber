package be.mbict.kucumber;


import io.cucumber.java.BeforeAll;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = RANDOM_PORT)
@ActiveProfiles("test")
public class KucumberJavaBootstrap {

    static MySQLContainer mySql;

    @BeforeAll
    public static void startContainer() {
        mySql = new MySQLContainer(DockerImageName.parse("mysql").withTag("8.0.32"))
                .withDatabaseName("basket-db")
                .withUsername("obiwan")
                .withPassword("s3cr3t");
        mySql.start();
        System.out.println(mySql.getJdbcUrl());
        System.setProperty("spring.datasource.url", mySql.getJdbcUrl());
    }
}
