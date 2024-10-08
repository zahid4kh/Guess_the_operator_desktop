import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.jetbrains.skia.Color
import kotlin.math.round

@Composable
@Preview
fun App() {
    MaterialTheme {

        val beginner = BeginnerMode()
        val intermediate = IntermediateMode()
        val experienced = ExperiencedMode()
        val demon = DemonMode()


        var beginnerClicked by remember {mutableStateOf(false)}
        var intermediateClicked by remember {mutableStateOf(false)}
        var experiencedClicked by remember {mutableStateOf(false)}
        var demonClicked by remember {mutableStateOf(false)}


        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.background)){

            Row(horizontalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.padding(bottom = 20.dp)){
                Button(onClick = {beginnerClicked = !beginnerClicked}){
                    Text(text = "Beginner")
                }
                Button(onClick = {intermediateClicked = !intermediateClicked}){
                    Text(text = "Intermediate")

                }
                Button(onClick = {experiencedClicked = !experiencedClicked}){
                    Text(text = "Experienced")

                }
                Button(onClick = {demonClicked = !demonClicked}){
                    Text(text = "Demon")

                }
            }

            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly){
                Column{
                    OutlinedTextField(
                        value = if (beginnerClicked){
                            beginner.num1.toString()
                        }else if (intermediateClicked){
                            intermediate.num1.toString()
                        }else if (experiencedClicked){
                            experienced.num1.toString()
                        }else if (demonClicked){
                            demon.num1.toString()
                        }else {
                            0.toString()
                        },
                        onValueChange = {if (beginnerClicked){beginner.num1 = it.toDouble()}else if (intermediateClicked){intermediate.num1 = it.toDouble()}else if (experiencedClicked){experienced.num1 = it.toDouble()} else if (demonClicked){demon.num1 = it.toDouble()}},
                        readOnly = true,
                        label = {Text("Number 1") },
                        enabled = beginnerClicked || intermediateClicked || experiencedClicked || demonClicked)

// SECOND NUMBER
                    OutlinedTextField(
                        value = if (beginnerClicked){
                            beginner.num2.toString()
                        }else if (intermediateClicked){
                            intermediate.num2.toString()
                        }else if (experiencedClicked){
                            experienced.num2.toString()
                        }else if (demonClicked){
                            demon.num2.toString()
                        }else {
                            0.toString()
                        },
                        onValueChange = {if (beginnerClicked){beginner.num2 = it.toDouble()}else if (intermediateClicked){intermediate.num2 = it.toDouble()}else if (experiencedClicked){experienced.num2 = it.toDouble()} else if (demonClicked){demon.num2 = it.toDouble()} },
                        readOnly = true,
                        label = {Text("Number 2")},
                        enabled = beginnerClicked || intermediateClicked || experiencedClicked || demonClicked)

// THIRD NUMBER
                    OutlinedTextField(
                        value = if (experiencedClicked){
                            experienced.num3.toString()
                        }else if (demonClicked){
                            demon.num3.toString()
                        }else {
                            0.toString()
                        },
                        onValueChange = { if (experiencedClicked){experienced.num3 = it.toDouble()} else if (demonClicked){demon.num3 = it.toDouble()} },
                        readOnly = true,
                        label = {Text("Number 3")},
                        enabled = if (experiencedClicked || demonClicked){true} else if (beginnerClicked || intermediateClicked){false} else false)
                }
                Column{
                    OutlinedTextField(modifier = Modifier.padding(start = 10.dp),
                        value = if (beginnerClicked){beginner.result[0].toString()} else if (intermediateClicked){intermediate.result[0].toString()} else if (experiencedClicked){ experienced.result[0].toString()} else if (demonClicked){demon.result4[0].toString()} else "",
                        onValueChange = {}, label = {Text("Result")})
                }
            }
        }
    }
}

//        when (input) {
//        result1[1] -> println("Correct!!, the operation was ${result1[1]}\n")
//        else -> {println("Wrong...try again\n")}
//    }

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
