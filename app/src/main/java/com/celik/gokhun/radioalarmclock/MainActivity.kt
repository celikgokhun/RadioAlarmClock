package com.celik.gokhun.radioalarmclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.celik.gokhun.radioalarmclock.databinding.ActivityMainBinding
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        var alarmItem: AlarmItem? = null

        val scheduler = AndroidAlarmScheduler(this)


        alarmItem = AlarmItem(
            time = LocalDateTime.now()
                .plusSeconds("10".toLong()),
            message = "ahmetcan"
        )
        alarmItem?.let(scheduler::schedule)

        setContentView(binding.root)
        setView()
    }

    private fun setView() {
        with(binding) {

        }
    }
}