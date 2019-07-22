import kotlin.random.Random

abstract class Player(val name: String) {
    abstract fun makeMove(left: Int): Int
}

class Human(name: String): Player(name) {
    override fun makeMove(left: Int): Int {
        println("$name is making a move")

        val x = readLine()!!.toInt()
        return x
    }
}

class Computer(name: String): Player(name) {
    override fun makeMove(left: Int): Int {
        println("$name is making a move")

        return Random.nextInt(1, left/2)
    }
}
