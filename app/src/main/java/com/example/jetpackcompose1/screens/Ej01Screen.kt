package com.example.jetpackcompose1.screens.teoria

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Screen1() {

    when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {
            Box(Modifier.fillMaxSize(), Alignment.Center) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text = "First item", Modifier.padding(15.dp)  .align(Alignment.Start))
                    Text(text = "Second item",Modifier.padding(15.dp)  .align(Alignment.Start))
                    Text(text = "Third item", Modifier.padding(15.dp)  .align(Alignment.Start))
                }

            }
        }

        Configuration.ORIENTATION_LANDSCAPE -> {
            Box(Modifier.fillMaxSize(), Alignment.Center) {
                Column() {
                    Text(text = "First item", Modifier.padding(15.dp)  .align(Alignment.Start))
                    Text(text = "Second item",Modifier.padding(15.dp)  .align(Alignment.Start))
                    Text(text = "Third item", Modifier.padding(15.dp)  .align(Alignment.Start))
                }
            }
        }
        else -> throw RuntimeException()


    }



    /*fun TextoItem(
        texto: String,
        modifier: Modifier,
    ){ Text(text = texto,
        Modifier
            .padding(15.dp)
            .align(Alignment.Start)
    )*/

}
