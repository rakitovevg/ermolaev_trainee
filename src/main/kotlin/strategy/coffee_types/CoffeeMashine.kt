package strategy.coffee_types

class CoffeeMachine(
    private val coffeeTypes: CoffeeTypes
) {
    fun selectCoffee() {
        coffeeTypes.makeCoffee()
    }
}