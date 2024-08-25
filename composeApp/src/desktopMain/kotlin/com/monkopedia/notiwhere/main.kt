package com.monkopedia.notiwhere

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.monkopedia.notiwhere.model.Datastore

fun main() {
    Datastore.init()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Notiwhere"
        ) {
            App()
        }
    }
}
