package com.monkopedia.notiwhere.model

import androidx.datastore.core.DataStore
import com.monkopedia.notiwhere.interfaces.AppContext

expect class DatastoreModule(appContext: AppContext) {
    val mqttDatastore: DataStore<MqttConfig>
}
