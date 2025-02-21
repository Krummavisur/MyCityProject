package com.example.mycity.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycity.R
import com.example.mycity.ui.theme.MyCityTheme

@Composable
fun CategoriesScreenLayout(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = Modifier
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            modifier = modifier
                .height(66.dp)
                .clip(RoundedCornerShape(24.dp))
                .width(250.dp)
        ) {
       Text(
           text = stringResource (R.string.landmarks_category),
           fontSize = 28.sp,
           fontWeight = FontWeight.Bold,
           color = Color.White
            )
        }
        Spacer(modifier = Modifier
            .height(20.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            modifier = modifier
                .height(66.dp)
                .clip(RoundedCornerShape(24.dp))
                .width(250.dp)
        ) {
            Text(
                text = stringResource (R.string.coffee_category),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier
            .height(20.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            modifier = modifier
                .height(66.dp)
                .clip(RoundedCornerShape(34.dp))
                .width(250.dp)
        ) {
            Text(
                text = stringResource (R.string.clubs_category),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun CategoriesLayoutPreview() {
    MyCityTheme {
        CategoriesScreenLayout(
            onClick = {},
            modifier = Modifier
        )
    }
}
