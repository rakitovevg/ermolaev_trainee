package factory_method.drinks.coffee

import factory_method.drinks.Coffee

class Late : Coffee() {
    init {
        println("Late")
    }
}