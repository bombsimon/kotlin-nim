class Board(objs: Int) {
    var objects: Int = objs
    private var isOver: Boolean = false

    fun running(): Boolean {
        return !this.isOver
    }

    fun remove(n: Int): Boolean {
        when  {
            n > this.objects/2 -> {
                println("Invalid move")
                return false
            }
            n < 1 -> {
                println("Invalid move")
                return false
            }
        }

        this.objects -= n

        println("There are ${this.objects} left")

        if (this.objects == 1) {
            this.isOver = true
        }

        return true
    }
}