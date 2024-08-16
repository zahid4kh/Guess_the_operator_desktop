//import kotlin.concurrent.timer
//
//
//fun main(){
//    val tries = 1
//    println("Enter the difficulty:" +
//            "\nbeginner(0.0)" +
//            "\nintermediate(0.5)" +
//            "\nexperienced(1.0)" +
//            "\ndemon(2.0)")
//    val ask = readln().toDouble()
//
//    while (tries > 0){
//        when (ask){
//            0.0 -> beginnerMode()
//            0.5 -> intermediateMode()
//            1.0 -> experiencedMode()
//            2.0 -> demonMode()
//        }
//
//        println("Would you like to stop?")
//        val reply = readln()
//        when (reply){
//            "yes" -> break
//            "no" -> continue
//        }
//    }
//}
//
//fun beginnerMode() {
//    val a = (1..10).random().toDouble()
//    val b = (1..10).random().toDouble()
//
//    val add = listOf((a + b), "+")
//    val sub = listOf((a - b), "-")
//    val mul = listOf((a * b), "*")
//    val div = listOf((a / b), "/")
//
//    val result = listOf(add, sub, mul, div).random()
//
//    println("Num 1 = $a, Num 2 = $b")
//    println("Result is ${result[0]}")
//    println("Guess the operator >> ")
//    val inp = readln()
//
//    when (inp) {
//        result[1] -> println("Correct!!, the operation was ${result[1]}\n")
//        else -> {println("Wrong...try again\n")}
//    }
//}
//
//fun intermediateMode() {
//    val a = (10..20).random().toDouble()
//    val b = (10..20).random().toDouble()
//
//    val add = listOf((a + b), "+")
//    val sub = listOf((a - b), "-")
//    val mul = listOf((a * b), "*")
//    val div = listOf((a / b), "/")
//
//    val result = listOf(add, sub, mul, div).random()
//
//    println("Num 1 = $a, Num 2 = $b")
//    println("Result is ${result[0]}")
//    println("Guess the operator >> ")
//    val inp = readln()
//
//    when (inp) {
//        result[1] -> println("Correct!!, the operation was ${result[1]}\n")
//        else -> {println("Wrong...try again\n")}
//    }
//}
//
//fun experiencedMode() {
//    val a = (30..70).random().toDouble()
//    val b = (30..70).random().toDouble()
//    val c = (30..70).random().toDouble()
//
//    val add = listOf((a + b - c), "+,-")
//    val sub = listOf((a - b + c), "-,+")
//    val mul = listOf(((a * b) / c), "*,/")
//    val div = listOf(((a / b) * c), "/,*")
//
//    val result = listOf(add, sub, mul, div).random()
//
//    println("Num 1 = $a, Num 2 = $b")
//    println("Result is ${result[0]}")
//    println("Guess the operator. Use commas to separate operations >> ")
//    val inp = readln()
//
//    when (inp) {
//        result[1] -> println("Correct!!, the operation was ${result[1]}\n")
//        else -> {println("Wrong...try again\n")}
//    }
//}
//
//fun demonMode() {
//    val a = (50..70).random().toDouble()
//    val b = (50..70).random().toDouble()
//    val c = (50..70).random().toDouble()
//
//    val add_0 = listOf((a + b + c), "+,+")
//    val add_1 = listOf((a + b - c), "+,-")
//
//    val sub_0 = listOf((a - b + c), "-,+")
//    val sub_1 = listOf((a - b - c), "-,-")
//    val sub_2 = listOf(((a - b) * c), "-,*")
//
//    val mul_0 = listOf(((a * b) + c), "*,+")
//    val mul_1 = listOf(((a * b) - c), "*,-")
//    val mul_2 = listOf(((a * b) / c), "*,/")
//
//    val div_0 = listOf(((a / b) * c), "/,*")
//    val div_2 = listOf(((a / b) + c), "/,+")
//
//
//    val result = listOf(add_0, add_1, sub_0, sub_1, sub_2, mul_0, mul_1, mul_2, div_0, div_2).random()
//
//    println("Num 1 = $a" +
//            "\nNum 2 = $b" +
//            "\nNum 3 = $c")
//    println("Result is ${result[0]}")
//    println("Guess the operator. Use commas to separate operations >> ")
//    val inp = readln()
//
//    when (inp) {
//        result[1] -> println("What a demon!!, the operation was indeed ${result[1]}\n")
//        else -> {println("Wrong...next task >>\n")}
//    }
//}
//
//
//
