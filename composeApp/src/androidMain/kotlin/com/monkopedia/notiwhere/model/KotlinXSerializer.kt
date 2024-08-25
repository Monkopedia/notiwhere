package com.monkopedia.notiwhere.model

import androidx.datastore.core.Serializer
import java.io.InputStream
import java.io.OutputStream
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.KSerializer
import kotlinx.serialization.StringFormat
import kotlinx.serialization.json.Json

open class KotlinXSerializer<T>(
    override val defaultValue: T,
    private val serializer: KSerializer<T>,
    private val json: StringFormat = Json
) : Serializer<T> {

    override suspend fun readFrom(input: InputStream): T = withContext(Dispatchers.IO) {
        json.decodeFromString(serializer, input.reader().readText())
    }

    override suspend fun writeTo(t: T, output: OutputStream) {
        withContext(Dispatchers.IO) {
            output.bufferedWriter().write(json.encodeToString(serializer, t))
        }
    }
}
