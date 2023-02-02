package factory_method.factory

import factory_method.drinks.Drink
import factory_method.drinks.coffee.Cappuccino
import factory_method.drinks.coffee.Espresso
import factory_method.drinks.coffee.Late
import factory_method.exceptoins.DrinkException
import factory_method.types.CoffeeTypes
import factory_method.types.DrinkTypes

object CoffeeCreator : DrinkCreator() {
    override fun pourDrink(types: DrinkTypes): Drink {
        return when (types) {
            CoffeeTypes.CAPPUCCINO -> Cappuccino()
            CoffeeTypes.LATE -> Late()
            CoffeeTypes.ESPRESSO -> Espresso()
            else -> throw DrinkException()
        }
    }
}