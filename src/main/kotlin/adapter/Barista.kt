package adapter

class Barista : CoffeeMachine, Tea() {

    override fun makeCoffee() {
        makeTea()
    }
}