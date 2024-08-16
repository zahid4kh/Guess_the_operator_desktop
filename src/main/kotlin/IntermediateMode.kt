class IntermediateMode {
    var num1 = (10..20).random().toDouble()
    var num2 = (10..20).random().toDouble()
    val add = listOf((num1 + num2), "+")
    val sub = listOf((num1 - num2), "-")
    val mul = listOf((num1 * num2), "*")
    val div = listOf((num1 / num2), "/")
    val result = listOf(add, sub, mul, div).random()
}