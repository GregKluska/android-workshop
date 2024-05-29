package com.gregkluska.feature.animation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimationViewModel
@Inject
constructor() : ViewModel() {
    val test = "a"
}
