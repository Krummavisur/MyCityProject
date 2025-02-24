package com.example.mycity.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycity.ui.categories.CategoriesViewModel
import com.example.mycity.ui.theme.MyCityTheme

@Composable
fun CategoriesScreenLayout(
    viewModel: CategoriesViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
        uiState.categoryList.forEach { category ->
            CustomButton(
                onClick = {},
                buttonTitle = stringResource(id = category.title)
                )
            }
        }
    }
}

@Composable
private fun CustomButton(
    onClick: () -> Unit,
    buttonTitle: String
) {
    Button(
        modifier = Modifier
            .height(66.dp)
            .clip(RoundedCornerShape(34.dp))
            .width(250.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
    ) {
        Text(
            text = buttonTitle,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Preview
@Composable
fun CategoriesLayoutPreview() {
    MyCityTheme {
        CategoriesScreenLayout()
    }
}
