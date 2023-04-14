package com.example.jetpackcompose1.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Part2(numCounters: Int,
          modifier: Modifier = Modifier) {
  
  Column(modifier) {

      repeat(numCounters){
          Counter()

      }
  }
}

@Composable
fun Counter(modifier: Modifier = Modifier) {

    var count by rememberSaveable { mutableStateOf(0) }

    Row(verticalAlignment = Alignment.CenterVertically,
    modifier = modifier) {
        Button(onClick = { count--}) {
            Text(text ="Decrementar")
        }
        Text(text = "$count", modifier= Modifier.padding(20.dp))
        Button(onClick = { count++}) {
            Text(text ="Incrementar") //c
        }
    }
}
