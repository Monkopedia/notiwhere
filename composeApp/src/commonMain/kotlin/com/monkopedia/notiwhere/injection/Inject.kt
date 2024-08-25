package com.monkopedia.notiwhere.injection

import com.monkopedia.notiwhere.interfaces.AppContext
import com.monkopedia.notiwhere.model.DatastoreModule

class Inject(platformContext: AppContext) {
    val datastore = DatastoreModule(platformContext)

    companion object : () -> Inject {
        private lateinit var inject: Inject

        fun init(platformContext: AppContext) {
            inject = Inject(platformContext)
        }

        override fun invoke(): Inject = inject
    }
}
