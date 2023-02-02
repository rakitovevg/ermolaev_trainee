package factory_method.factory

import factory_method.drinks.Drink
import factory_method.drinks.tea.BlackTea
import factory_method.drinks.tea.GreenTea
import factory_method.exceptoins.DrinkException
import factory_method.types.DrinkTypes
import factory_method.types.TeaTypes

object TeaCreator : DrinkCreator() {
    override fun pourDrink(types: DrinkTypes): Drink {
        return when (types) {
            TeaTypes.BLACK_TEA -> BlackTea()
            TeaTypes.GREEN_TEA -> GreenTea()
            else -> throw DrinkException()
        }
    }
}