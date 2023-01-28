package be.mbict.kucumber.basket

import org.springframework.data.jpa.repository.JpaRepository

interface Basket: JpaRepository<Item, Long> {
}