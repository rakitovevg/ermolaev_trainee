import adapter.Barista
import builder.Coffee
import factory_method.factory.CoffeeCreator
import factory_method.factory.TeaCreator
import factory_method.types.CoffeeTypes
import factory_method.types.TeaTypes
import strategy.coffee_types.Cappuccino
import strategy.coffee_types.CoffeeMachine

fun main(args: Array<String>) {
    runCatching { factoryMethod() }
        .onFailure { println("Выберите корректный напиток") }

    println()
    strategy()
    println()
    builder()
    println()
    adapter()
}

//****************************************************************
//******************Implementation********************************
//****************************************************************

private fun factoryMethod() {
    val teaCreator = TeaCreator
    print(teaCreator.displayMessage())
    teaCreator.pourDrink(TeaTypes.GREEN_TEA)

    val coffeeCreator = CoffeeCreator
    print(coffeeCreator.displayMessage())
    coffeeCreator.pourDrink(CoffeeTypes.LATE)

    val coffeeCreatorExp = CoffeeCreator
    print(coffeeCreatorExp.displayMessage())
    coffeeCreator.pourDrink(TeaTypes.GREEN_TEA)
}

private fun strategy() {
    val coffeeTypes = Cappuccino
    val machine = CoffeeMachine(coffeeTypes)
    machine.selectCoffee()
}

private fun builder() {
    val coffee = Coffee.CoffeeBuilder()
        .buildType("cappuccino")
        .buildMilk(true)
        .buildSugar(false)
        .buildPrice(10)
        .build()
    println(coffee)
}

private fun adapter() {
    val machine: adapter.CoffeeMachine = Barista()

    machine.makeCoffee()
}