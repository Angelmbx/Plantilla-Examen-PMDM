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


@Preview
@Composable
fun Screen1() {

    var numCounters by rememberSaveable { mutableStateOf(0)}

    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Contadores") },
                actions = {
                    IconButton(onClick = { numCounters = 0 }) {
                        Icon(imageVector = Icons.Filled.Refresh, contentDescription = "botón de refrescar")
                    }
                }) }
    ) {

        if (numCounters==0){
            Part1 (onNumCounterChange = { numCounters = it }, modifier = Modifier.padding(it))
        }
        else {
            Part2(numCounters= numCounters, modifier = Modifier.padding(it))
        }
    }
}

