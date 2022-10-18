
package com.cyberwalker.fashionstore.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cyberwalker.fashionstore.R

val poppinsFamily = FontFamily(Font(R.font.poppins, FontWeight.Normal))

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)

val Typography.large: TextStyle
    get() = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W500,
        fontSize = 24.sp,
    )

val Typography.medium_14: TextStyle
    get() = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
    )

val Typography.medium_18: TextStyle
    get() = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W500,
        fontSize = 18.sp,
    )

val Typography.medium_18_bold: TextStyle
    get() = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 18.sp,
    )

val Typography.small_caption: TextStyle
    get() = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W400,
        fontSize = 12.sp,
        color = gray
    )

val Typography.small_caption2: TextStyle
    get() = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp,
    )
