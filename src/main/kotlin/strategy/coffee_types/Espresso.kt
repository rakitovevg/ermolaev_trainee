package strategy.coffee_types

object Espresso : CoffeeTypes {
    override fun makeCoffee() {
        println("Make espresso!")
    }
}