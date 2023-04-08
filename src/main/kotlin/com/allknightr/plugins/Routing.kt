package com.allknightr.plugins

import com.allknightr.room.RoomController
import com.allknightr.routes.chatSocket
import com.allknightr.routes.getAllMessages
import io.ktor.server.routing.*
import io.ktor.server.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
