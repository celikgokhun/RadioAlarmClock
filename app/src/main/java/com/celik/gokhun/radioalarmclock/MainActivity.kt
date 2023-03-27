package com.celik.gokhun.radioalarmclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.celik.gokhun.radioalarmclock.databinding.ActivityMainBinding
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var alarmItem: AlarmItem



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val scheduler = AndroidAlarmScheduler(this)

        println("ahmetcan calacağı saaat:   " + LocalDateTime.now().plusSeconds("10".toLong()))

        alarmItem = AlarmItem(
            time = LocalDateTime.now().plusSeconds("10".toLong()),
            message = "ahmetcan"
        )
        alarmItem.let(scheduler::schedule)


        setUpView()


    }

    private fun testRadio() {
        with(binding) {

        }
    }

    private fun setUpView() {

        val picker =
            MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_12H)
                .setHour(12)
                .setMinute(10)
                .setTitleText("Select Appointment time")
                .build()

        picker.show(supportFragmentManager, "tag")

        picker.addOnPositiveButtonClickListener {

        }
        picker.addOnNegativeButtonClickListener {
            // call back code
        }
        picker.addOnCancelListener {
            // call back code
        }
        picker.addOnDismissListener {
            // call back code
        }
    }
}