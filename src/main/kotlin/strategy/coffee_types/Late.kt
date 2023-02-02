package strategy.coffee_types

object Late : CoffeeTypes {
    override fun makeCoffee() {
        println("Make late")
    }
}