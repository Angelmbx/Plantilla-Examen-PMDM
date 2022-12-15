
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Flag
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


val spacedByDefault = 5.dp
const val boardSize = 8


@Preview
@Composable
fun Screen2() {
    Column(
        Modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.spacedBy( // (1)
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
                            .aspectRatio(1f)  // (2)
                    ) {
                        Icon(
                            Icons.Default.Flag,
                            contentDescription = null,
                        )
                    }
                }
            }
        }
    }
}

}
