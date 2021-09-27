package com.example.androidbasics

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf

class MyWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {

    private val workingTime = 5000L

    override fun doWork(): Result {
        val currentTime = System.currentTimeMillis()
        println("???? time in millis $currentTime")
        val inputData = inputData.getString("DATA")

        while (currentTime + workingTime > System.currentTimeMillis()) {
            println("???? doWork stuff... Data->$inputData")
        }

        println("???? we are done here")

        val outputData = workDataOf("DATA" to "result foo data")


        return Result.success(outputData)
    }
}