package be.mbict.kucumber.basket

import io.cucumber.java.en.Given

class BasketSteps(val basket: Basket) {

    @Given("I put {int} apples in my basket")
    fun `I put some apples in my basket`(amount: Int) {
        (0..amount).forEach {
            basket.save(Item(type = "apple"))
        }
    }
}