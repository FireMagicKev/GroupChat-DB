package com.allknightr.room

import io.ktor.websocket.*

data class Member (
    val username: String,
    val sessonId: String,
    val socket: WebSocketSession
)
