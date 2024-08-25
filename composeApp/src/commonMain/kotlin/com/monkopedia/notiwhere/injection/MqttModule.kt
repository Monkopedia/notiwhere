package com.monkopedia.notiwhere.injection

import com.monkopedia.notiwhere.model.DatastoreModule
import com.monkopedia.notiwhere.interfaces.AppContext
import com.monkopedia.notiwhere.interfaces.MqttController

expect class MqttModule(appContext: AppContext, datastoreModule: DatastoreModule) {
    val mqttController: MqttController
}
