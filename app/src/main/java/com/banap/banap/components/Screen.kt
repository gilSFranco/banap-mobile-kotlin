package com.banap.banap.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Screen() {
    Scaffold (
        modifier = Modifier
            .fillMaxSize(),
    ) { innerPadding ->
        Text(
            text = "Hello World",
            modifier = Modifier.padding(innerPadding)
        )
    }
}