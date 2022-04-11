package com.mobilist.mhrs.util

import android.Manifest

class MyPermisson {
    companion object {
        val PERMISSION_REQUEST_CODE = 1

        val PERMISSIONS_CAMERA_RECORD_AUDIO = arrayOf(
            Manifest.permission.MODIFY_AUDIO_SETTINGS,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.VIBRATE,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.CAMERA
        )
    }
}