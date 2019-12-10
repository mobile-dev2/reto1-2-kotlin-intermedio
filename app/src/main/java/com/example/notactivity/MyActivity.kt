package com.example.notactivity

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MyActivity : AppCompatActivity() {


    private lateinit var timer: CountDownTimer
    val TAG = "TIMER";

    private fun setTimer(){

        timer = object: CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val seconds = millisUntilFinished/1000;
                Log.d(TAG,"Tiempo restante: $seconds")
            }

            override fun onFinish() {
                Log.d(TAG,"Contador finalizado")
            }
        }
        timer.start()
    }

    private fun stopTimer(){
        timer.cancel()
        Log.d(TAG,"timer cancelado")
    }






    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
        setTimer()
    }



    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
        stopTimer()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")

        stopTimer()
    }


    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_activity)
        setTimer()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
        stopTimer()
    }

}