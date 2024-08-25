package com.monkopedia.notiwhere.model

import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import com.monkopedia.notiwhere.interfaces.AppContext
import java.io.File

actual class DatastoreModule actual constructor(appContext: AppContext) {
    actual val mqttDatastore: DataStore<MqttConfig> = DataStoreFactory.create(MqttSerializer) {
        File(
            File(System.getenv("HOME"), ".notiwhere").also { it.mkdirs() },
            "mqtt.config.json"
        )
    }
}

private object MqttSerializer : KotlinXSerializer<MqttConfig>(MqttConfig(), MqttConfig.serializer())
