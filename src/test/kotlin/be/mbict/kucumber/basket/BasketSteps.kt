package be.mbict.kucumber.basket

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat

class BasketSteps(val basket: Basket) {

    private var result: Long? = null

    @Given("I put {long} apples in my basket")
    fun `I put some apples in my basket`(amount: Long) {
        (1..amount).forEach {
            basket.save(Item(type = "apple"))
        }
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