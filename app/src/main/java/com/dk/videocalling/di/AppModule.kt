package com.dk.videocalling.di

import com.dk.videocalling.VideoCallingApp
import com.dk.videocalling.connect.ConnectViewModel
import com.dk.videocalling.video.VideoCallViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module{

    factory {
        val app = androidContext().applicationContext as VideoCallingApp
        app.client
    }
    viewModelOf(::ConnectViewModel)
    viewModelOf(::VideoCallViewModel)
}