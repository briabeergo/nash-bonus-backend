package ru.actedev.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/hi") {
            call.respondText("Hello!")
        }
        get("/") {

        }
    }
}
