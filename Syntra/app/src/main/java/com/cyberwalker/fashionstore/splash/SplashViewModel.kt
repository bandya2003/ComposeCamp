
package com.cyberwalker.fashionstore.splash

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {

    var uiState by mutableStateOf(SplashUiState())
        private set
}

data class SplashUiState(
    val loadComplete: Boolean = false
)