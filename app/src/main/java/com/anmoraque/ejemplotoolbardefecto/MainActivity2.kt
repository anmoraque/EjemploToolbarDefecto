package com.anmoraque.ejemplotoolbardefecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //Boton de ir atras
        //Creo una nueva variable
        var actionbar = supportActionBar

        actionbar?.setDisplayHomeAsUpEnabled(true)
    }
    //Asociamos el menu a nuestro codigo para poder inflarlo
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_dos, menu)
        return super.onCreateOptionsMenu(menu)
    }
}