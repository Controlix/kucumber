package be.mbict.kucumber

import be.mbict.kucumber.basket.Basket
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class MyKotlinTest {

    private val bootstrap = KucumberKotlinBootstrap

    @Autowired
    private lateinit var basket: Basket

    @Test
    fun testSomething() {
        assertThat(basket.count()).isZero()
        println(
            "\n\n\n" +
                    "=============================================================================================\n" +
                    "=============================================================================================\n" +
                    "=============================================================================================\n" +
                    " Test something \n" +
                    "=============================================================================================\n" +
                    "=============================================================================================\n" +
                    "=============================================================================================\n" +
                    ""
        )
    }
}