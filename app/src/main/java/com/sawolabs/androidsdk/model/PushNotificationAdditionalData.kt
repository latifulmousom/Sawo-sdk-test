package com.sawolabs.androidsdk.model

data class PushNotificationAdditionalData (
    val trusted_id: String,
    val secondary_id: String,
    val secondary_device_brand: String,
    val secondary_device_model: String
)