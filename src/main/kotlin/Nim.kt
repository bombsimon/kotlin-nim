fun main(args: Array<String>) {
    val objects: Int? = try {
        args[0].toInt()
    } catch (e: NumberFormatException) {
        0
    } catch (e: ArrayIndexOutOfBoundsException) {
        0
    }

    val b = Board(objects!!)
    val p1 = Human("Simon")
    val p2 = Computer("HAL 9000")


    while (b.running()) {
        b.remove(p1.makeMove(b.objects))

        if (!b.running()) {
            break
        }

        b.remove(p2.makeMove(b.objects))
    }
}