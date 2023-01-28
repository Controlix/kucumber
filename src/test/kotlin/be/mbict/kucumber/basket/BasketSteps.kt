package be.mbict.kucumber.basket

import io.cucumber.java.Before
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.assertj.core.api.Assertions.assertThat

class BasketSteps(val basket: Basket) {

    private var result: Long? = null

    @Before
    fun cleanUp() = basket.deleteAll()

    @Given("I put {long} apples in my basket")
    fun `I put some apples in my basket`(amount: Long) {
        (1..amount).forEach {
            basket.save(Item(type = "apple"))
        }
    }

    @Given("I put no apples in my basket")
    fun `I put no apples in my basket`() {
    }

    @When("I count how many apples there are in the basket")
    fun `I count how many apples there are in the basket`() {
        result = basket.count()
    }

    @Then("I have {long} apples")
    fun `I have apples`(amount: Long) {
        assertThat(result).isEqualTo(amount)
    }
}