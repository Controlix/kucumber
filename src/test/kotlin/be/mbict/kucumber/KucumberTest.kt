package be.mbict.kucumber

import be.mbict.kucumber.basket.Basket
import io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME
import io.cucumber.spring.CucumberContextConfiguration
import org.junit.jupiter.api.BeforeEach
import org.junit.platform.suite.api.ConfigurationParameter
import org.junit.platform.suite.api.IncludeEngines
import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("cucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
class KucumberTest {

    @Autowired private lateinit var basket: Basket

    @BeforeEach
    fun cleanUp() = basket.deleteAll()
}

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = RANDOM_PORT)
class KucumberBootstrap