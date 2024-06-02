package com.dk.videocalling.video

sealed interface VideoCallAction {
    data object OnDisconnectClick : VideoCallAction
    data object JoinCallClick : VideoCallAction
}