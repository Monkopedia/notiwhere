package com.monkopedia.notiwhere.interfaces

import kotlinx.coroutines.flow.StateFlow

interface MqttController {
    enum class MqttState {
        UNCONFIGURED,
        CONNECTING,
        FAILED_CONNECTION,
        UNAUTHORIZED_CONNECTION,
        CONNECTED
    }

    val state: StateFlow<MqttState>
}
