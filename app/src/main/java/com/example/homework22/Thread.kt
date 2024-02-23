package com.example.homework22

import android.util.Log
import java.lang.Thread

class Thread:Thread() {
    override fun run() {
        Log.e("TESTMYTHREAD","Start Thread")
    }
}