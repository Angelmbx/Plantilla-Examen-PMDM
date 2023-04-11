package com.example.jetpackcompose1.screens.teoria


import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose1.screens.Part1
import com.example.jetpackcompose1.screens.Part2


enum class Part {P1, P2}
@Preview
@Composable
fun Screen1() {

    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Contadores") },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Refresh, contentDescription = "botón de refrescar")
                    }
                }) }
    ) {

        var part by rememberSaveable { mutableStateOf(Part.P1)} //variable de estado para determinar si esta en una o en otra
        var numCounters by rememberSaveable { mutableStateOf(0)}


        if (part == Part.P1) {
            Part1(it)
        }
        else {
         Part2(numCounters= numCounters, modifier = Modifier.padding(it))
        }
    }
}

