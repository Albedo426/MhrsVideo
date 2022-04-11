package com.amazonaws.services.chime.sdkdemo.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DebugSettingsViewModel : ViewModel() {
    val endpointUrl = MutableLiveData<String>("https://4dkoz2qpo1.execute-api.us-east-1.amazonaws.com/Prod/")

    fun sendEndpointUrl(data: String) {
        endpointUrl.value = data
    }
}
