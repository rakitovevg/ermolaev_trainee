package factory_method.factory

import factory_method.drinks.Drink
import factory_method.types.DrinkTypes

abstract class DrinkCreator {
    abstract fun pourDrink(types: DrinkTypes): Drink

    fun displayMessage() = "Take me "
}
