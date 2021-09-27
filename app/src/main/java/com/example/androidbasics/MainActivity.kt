    package com.example.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.Data
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

    class MainActivity : AppCompatActivity() {

    private val workManager = WorkManager.getInstance(application)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWorkerRequest = OneTimeWorkRequestBuilder<MyWorker>()
            .setInputData(getWorkerInputData())
            .build()

        workManager.enqueue(myWorkerRequest)

    }

        private fun getWorkerInputData() : Data {
            return Data.Builder()
                .putString("DATA", "fooWorkerData")
                .build()
        }
}