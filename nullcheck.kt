fun parseInt(str: String): Int? {
    return str.toIntOrNull();
}

/* 
fun printProduct(args1: String, args2: String) {
    val x = parseInt(args1)
    val y = parseInt(args2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("'$args1' or '$args2' is not a number")
    }
}
*/

fun printProduct(args1: String, args2: String) {
    val x = parseInt(args1)
    val y = parseInt(args2)

    if (x == null) {
        println("Wrong number format in arg1: '$args1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg1: '$args2'")
        return
    }

    println(x * y)
}

fun main(args: Array<String>) {
    printProduct("10", "20")
    printProduct("10", "a")
    printProduct("a", "10")
}