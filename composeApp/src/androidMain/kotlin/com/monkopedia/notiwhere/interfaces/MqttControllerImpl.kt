package com.monkopedia.notiwhere.interfaces

import android.content.Context
import androidx.datastore.core.DataStore
import com.monkopedia.notiwhere.interfaces.MqttController.MqttState
import com.monkopedia.notiwhere.model.MqttConfig
import kotlinx.coroutines.flow.StateFlow

class MqttControllerImpl(val context: Context, val mqttDatastore: DataStore<MqttConfig>) :
    MqttController {
    override val state: StateFlow<MqttState>

}
