package builder

class Coffee private constructor(
    private val type: String,
    private val sugar: Boolean,
    private val milk: Boolean,
    private val price: Int
) {
    override fun toString(): String {
        return "Coffee $type, " +
                "sugar - $sugar, " +
                "milk - $milk, " +
                "price - $price."
    }

    data class CoffeeBuilder(
        private var type: String = "standart",
        private var sugar: Boolean = false,
        private var milk: Boolean = false,
        private var price: Int = 0
    ) {

        fun buildType(type: String) = apply { this.type = type }
        fun buildSugar(sugar: Boolean) = apply { this.sugar = sugar }
        fun buildMilk(milk: Boolean) = apply { this.milk = milk }
        fun buildPrice(price: Int) = apply { this.price = price }

        fun build() = Coffee(type, sugar, milk, price)
    }
}