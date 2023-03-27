package com.celik.gokhun.radioalarmclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.celik.gokhun.radioalarmclock.databinding.ActivityMainBinding
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val alarmItem: AlarmItem?

        val scheduler = AndroidAlarmScheduler(this)


        println("ahmetcan")

        alarmItem = AlarmItem(
            time = LocalDateTime.now().plusSeconds("100".toLong()),
            message = "ahmetcan"
        )
        alarmItem.let(scheduler::schedule)


    }

    private fun openRadio() {
        with(binding) {
        }
    }

    private fun showOpeningTimePicker() {
        val calendar = Calendar.getInstance()
        val openingHour = calendar.get(Calendar.HOUR_OF_DAY)
        val openingMinute = calendar.get(Calendar.MINUTE)

        /*
        openingTimePicker = TimePickerDialog(
            this,
            { _, hourOfDay, minute ->
                openingTime = Pair(9, 0)
                showClosingTimePicker(18, 0)
            },
            9,
            0,
            true
        )


        openingTimePicker.show()

         */
    }
}