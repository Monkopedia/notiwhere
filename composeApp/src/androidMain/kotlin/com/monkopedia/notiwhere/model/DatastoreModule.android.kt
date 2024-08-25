package com.monkopedia.notiwhere.model

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import com.monkopedia.notiwhere.interfaces.AppContext

actual class DatastoreModule actual constructor(appContext: AppContext) {
    actual val mqttDatastore: DataStore<MqttConfig> = appContext.context.mqttDataStore
}

private object MqttSerializer : KotlinXSerializer<MqttConfig>(MqttConfig(), MqttConfig.serializer())

private val Context.mqttDataStore: DataStore<MqttConfig> by dataStore(
    "mqttDataStore",
    MqttSerializer
)
