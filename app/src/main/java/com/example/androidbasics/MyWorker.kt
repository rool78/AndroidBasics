package com.example.androidbasics

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {

    private val workingTime = 5000L

    override fun doWork(): Result {
        val currentTime = System.currentTimeMillis()
        println("???? time in millis $currentTime")
        while (currentTime + workingTime > System.currentTimeMillis()) {
            println("???? doWork stuff...")
        }

        println("???? we are done here")
        return Result.success()
    }
}