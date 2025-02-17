package com.banap.banap.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import com.banap.banap.ui.theme.BRANCO
import com.banap.banap.ui.theme.ShapeProperty
import com.banap.banap.ui.theme.Typography
import com.banap.banap.ui.theme.VERDE_CLARO

@Composable
fun Button(
    texto: String
) {
    Card (
        shape = ShapeProperty.small,
        colors = CardDefaults.cardColors(
            containerColor = VERDE_CLARO
        )
    ) {
        Row (
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Outlined.Add,
                contentDescription = "Icone de adicionar nova propriedade",
                modifier = Modifier
                    .scale(scale = 1.2F)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = texto,
                style = Typography.bodyMedium,
                color = BRANCO
            )
        }
    }
}