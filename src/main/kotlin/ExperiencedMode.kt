class ExperiencedMode {

    var num1 = (30..70).random().toDouble()
    var num2 = (30..70).random().toDouble()
    var num3 = (30..70).random().toDouble()
    val add = listOf((num1 + num2 - num3), "+,-")
    val sub = listOf((num1 - num2 + num3), "-,+")
    val mul = listOf(((num1 * num2) / num3), "*,/")
    val div = listOf(((num1 / num2) * num3), "/,*")
    val result = listOf(add, sub, mul, div).random()

}