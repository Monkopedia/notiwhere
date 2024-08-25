package com.monkopedia.notiwhere.model

import kotlinx.serialization.Serializable

@Serializable
data class MqttConfig(
    val host: String? = null,
    val port: Int? = null,
    val username: String? = null,
    val password: String? = null,
)
