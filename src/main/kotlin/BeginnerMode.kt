class BeginnerMode {

    var num1 = (1..10).random().toDouble()
    var num2 = (1..10).random().toDouble()
    val add = listOf((num1 + num2), "+")
    val sub = listOf((num1 - num2), "-")
    val mul = listOf((num1 * num2), "*")
    val div = listOf((num1 / num2), "/")
    var result = listOf(add, sub, mul, div).random()

//        when (input) {
//        result1[1] -> println("Correct!!, the operation was ${result1[1]}\n")
//        else -> {println("Wrong...try again\n")}
//    }

}
