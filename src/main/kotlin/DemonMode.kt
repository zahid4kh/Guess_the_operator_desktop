class DemonMode {

    var num1 = (50..70).random().toDouble()
    var num2 = (50..70).random().toDouble()
    var num3 = (50..70).random().toDouble()

    val add_0 = listOf((num1 + num2 + num3), "+ , +")
    val add_1 = listOf((num1 + num2 - num3), "+ ,  -")

    val sub_0 = listOf((num1 - num2 + num3), "- , +")
    val sub_1 = listOf((num2 - num2 - num3), "- , -")

    val mul_0 = listOf((num1 * num2 + num3), "* , +")
    val mul_1 = listOf((num1 * num2 - num3), "* , -")
    val mul_2 = listOf(((num1 * num2) / num3), "* , /")
    val mul_3 = listOf(((num1 - num2) * num3), "- , *")

    val div_0 = listOf(((num1 / num2) * num3), "/ , *")
    val div_2 = listOf(((num1 / num2) + num3), "/ , +")
    val result4 = listOf(add_0, add_1, sub_0, sub_1, mul_0, mul_1, mul_2, mul_3, div_0, div_2).random()

}