package com.vickram.jetmoviedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vickram.jetmoviedemo.ui.theme.JetMovieDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetMovieDemoTheme {
            }
        }
    }
}