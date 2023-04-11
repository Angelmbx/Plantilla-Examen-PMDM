package com.example.jetpackcompose1.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Part1(it: PaddingValues) {
    Column(
        modifier = Modifier.padding(it),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var text by rememberSaveable { mutableStateOf("") }

        TextField(value = "", onValueChange = { text = it })
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Mostrar")
        }

    }
}