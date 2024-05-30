package com.dk.videocalling

import android.app.Application
import io.getstream.video.android.core.StreamVideo
import io.getstream.video.android.core.StreamVideoBuilder
import io.getstream.video.android.model.User
import io.getstream.video.android.model.UserType

class VideoCallingApp: Application() {
    private var currentName: String? = null
    var client: StreamVideo? = null

    fun initVideoClient(username: String){
        if(client == null || username != currentName){
            StreamVideo.removeClient()
            currentName = username
            client = StreamVideoBuilder(
                context = this,
                apiKey = "4kykfa8f25fc",
                user = User(
                    id = username,
                    name = username,
                    type = UserType.Guest
                )
            ).build()
        }
    }
}