package be.mbict.kucumber

import io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME
import io.cucumber.java.BeforeAll
import io.cucumber.spring.CucumberContextConfiguration
import org.junit.platform.suite.api.ConfigurationParameter
import org.junit.platform.suite.api.IncludeEngines
import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.test.context.ActiveProfiles
import org.testcontainers.containers.MySQLContainer
import org.testcontainers.utility.DockerImageName

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("cucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
class KucumberTest

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
object KucumberKotlinBootstrap {

    init {
        startContainer()
    }

    @BeforeAll
    @JvmStatic
    fun startContainer() {
        val mySQLContainer = MySQLContainer(DockerImageName.parse("mysql").withTag("8.0.32"))
            .withDatabaseName("basket-db")
            .withUsername("obiwan")
            .withPassword("s3cr3t")
            .apply { start() }

        println(mySQLContainer.jdbcUrl)
        System.setProperty("spring.datasource.url", mySQLContainer.jdbcUrl)

        println("""
            =========================================================================================================
            =========================================================================================================
            =========================================================================================================
            =========================================================================================================
            
            
            
            
            Hi, I just started the containers!!!
            
            
            
            
            
            =========================================================================================================
            =========================================================================================================
            =========================================================================================================
            =========================================================================================================
        """.trimIndent())
    }
}