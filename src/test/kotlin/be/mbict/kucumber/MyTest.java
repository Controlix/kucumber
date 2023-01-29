package be.mbict.kucumber;

import be.mbict.kucumber.basket.Basket;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
public class MyTest {

    private KucumberKotlinBootstrap bootstrap = KucumberKotlinBootstrap.INSTANCE;

    @Autowired
    private Basket basket;

    @Test
    void testSomething() {
        assertThat(basket.count()).isZero();

        System.out.println("\n\n\n" +
                "=============================================================================================\n" +
                "=============================================================================================\n" +
                "=============================================================================================\n" +
                " Test something \n" +
                "=============================================================================================\n" +
                "=============================================================================================\n" +
                "=============================================================================================\n" +
                "");
    }
}
