package com.celik.gokhun.radioalarmclock

import android.media.AudioAttributes
import android.media.MediaPlayer

class RadioPlayService (private var mediaPlayer: MediaPlayer) {

    fun playRadio(radioUrl :String){
    //val url= "https://chantefrance.ice.infomaniak.ch/chantefrance-128.mp3"

    mediaPlayer = MediaPlayer()

    mediaPlayer.setAudioAttributes(
        AudioAttributes
            .Builder()
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()
    )

    mediaPlayer.setDataSource(radioUrl)
    mediaPlayer.prepare()
    mediaPlayer.start()

}

fun pauseRadio() {
    if (mediaPlayer.isPlaying){
        mediaPlayer.stop()
        mediaPlayer.reset()
        mediaPlayer.release()

    }
}
}