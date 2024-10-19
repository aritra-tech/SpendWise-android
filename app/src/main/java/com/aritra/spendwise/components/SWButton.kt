package com.aritra.spendwise.components

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aritra.spendwise.ui.theme.PrimaryLight

@Composable
fun SWButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier
            .defaultMinSize(
                minWidth = ButtonDefaults.MinWidth,
                minHeight = 50.dp
            )
            .clip(RoundedCornerShape(100.dp))
            .then(modifier),
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = PrimaryLight
        ),
    ) {

        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp
        )

    }
}