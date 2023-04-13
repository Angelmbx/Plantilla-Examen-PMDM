package com.example.jetpackcompose1.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Part1(onNumCounterChange: (Int) -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var text by rememberSaveable { mutableStateOf("") }

        TextField(value = text, onValueChange = { text = it })
        Button(onClick = { onNumCounterChange(text.toInt()) }) {
            Text(text = "Mostrar")
        }

    }
}