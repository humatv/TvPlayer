package com.tv.core.util

interface AdvertisePlayerHandler {
    fun playBackStateChange(playbackState : Int)
    fun onPlayerError(error: Exception)
    fun onSkipTimeChange(currentTime : Int, skippTime : Int)
}