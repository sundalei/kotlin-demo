/*
fun maxOf(a: Int, b: Int):Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
 */

 fun maxOf(a: Int, b: Int) = if (a > b) a else b

 fun main(args: Array<String>) {
     println(maxOf(12, 20))
 }