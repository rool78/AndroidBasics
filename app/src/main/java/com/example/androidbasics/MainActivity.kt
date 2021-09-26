    package com.example.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager

    class MainActivity : AppCompatActivity() {

    private val workManager = WorkManager.getInstance(application)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        workManager.enqueue(OneTimeWorkRequest.from(MyWorker::class.java))


    }
}