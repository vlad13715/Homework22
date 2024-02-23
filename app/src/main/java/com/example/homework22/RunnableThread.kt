package com.example.homework22

import android.util.Log

class RunnableThread:Runnable {
    override fun run() {
        Log.e("TESTMYTHREAD","Start runnable")
    }
}