package factory_method.drinks.coffee

import factory_method.drinks.Coffee

class Espresso : Coffee() {
    init {
        println("Espresso")
    }
}