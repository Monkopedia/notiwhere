package com.monkopedia.notiwhere.injection

import com.monkopedia.notiwhere.interfaces.AppContext
import com.monkopedia.notiwhere.interfaces.MqttController
import com.monkopedia.notiwhere.model.DatastoreModule

actual class MqttModule actual constructor(
    appContext: AppContext,
    datastoreModule: DatastoreModule
) {
    actual val mqttController: MqttController
        get() = TODO("Not yet implemented")
}
