
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.Text as Text1


val spacedByDefault = 10.dp
const val boardSize = 3


@Preview
@Composable
fun Screen2() {
    //when (LocalConfiguration.current.orientation) {
      //  Configuration.ORIENTATION_PORTRAIT -> {

    Text1(text = "Tres en raya")
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text1(text = "Tres en raya") })},

    ){
        Text1(text = "",
            modifier = Modifier.padding(it) //
        )
    }



    Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    Modifier
                        .padding(30.dp)
                        .weight(2.2f),
                    verticalArrangement = Arrangement.spacedBy(
                        space = spacedByDefault,
                        alignment = Alignment.CenterVertically
                    ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    repeat(boardSize) {
                        Row(horizontalArrangement = Arrangement.spacedBy(spacedByDefault)) {
                            repeat(boardSize) {
                                Button(
                                    onClick = { /*TODO*/ },
                                    Modifier
                                        .weight(1f)
                                        .aspectRatio(1f)
                                ) {
                                }
                            }
                        }
                    }
                }
                Column(
                    Modifier
                        .weight(1f)
                        .padding(25.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                    ) {
                        Column(
                            Modifier.padding(15.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text1(fontSize = 25.sp, color = Color.Black, text = "X")
                            Text1(fontSize = 15.sp, color = Color.Black, text = "Ganador")

                        }
                    }

                }

            }
        }
        //Configuration.ORIENTATION_LANDSCAPE -> {}
    //}
//}


