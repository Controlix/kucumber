package be.mbict.kucumber.basket

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Item(
    val type: String,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)