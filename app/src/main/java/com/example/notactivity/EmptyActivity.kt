package com.example.notactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_empty.*

class EmptyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)


        val fragmentManager = supportFragmentManager //creando el Fragment Manager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = MyFragment() //Creando una instancia de mi Fragmento
        fragmentTransaction.add(android.R.id.content, fragment) //Agrego mi fragmento al Activity a través de mi Transaction
        fragmentTransaction.commit() //ejecuto los cambios

        btn_change_fragment.setOnClickListener {

            val fragmentManager = supportFragmentManager //creando el Fragment Manager
            val fragmentTransaction = fragmentManager.beginTransaction()

            val fragment = MyFragment2() //Creando una instancia de mi Fragmento
            fragmentTransaction.replace(android.R.id.content, fragment) //Agrego mi fragmento al Activity a través de mi Transaction
            fragmentTransaction.commit() //ejecuto los cambios

        }
    }
}
