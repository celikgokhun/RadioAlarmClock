package com.celik.gokhun.radioalarmclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer

class AlarmReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val message = intent?.getStringExtra("EXTRA_MESSAGE") ?: return
        println("Alarm triggered: $message")

        val mediaPlayer = MediaPlayer()

        val radioPlayService = RadioPlayService(
            mediaPlayer = mediaPlayer
        )

        radioPlayService.playRadio(
            "https://icecast-rian.cdnvideo.ru/voicestm"
        )
    }
}