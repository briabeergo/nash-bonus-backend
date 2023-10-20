package ru.actedev

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.jetbrains.exposed.sql.Database
import ru.actedev.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "localhost", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    Database.connect("jdbc:postgresql://localhost:5432", driver = "org.postgresql.Driver", user = "postgres", password = "unreal")
    configureSockets()
    configureRouting()
}