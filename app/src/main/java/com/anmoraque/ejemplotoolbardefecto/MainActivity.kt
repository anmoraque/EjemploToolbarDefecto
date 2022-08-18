package com.anmoraque.ejemplotoolbardefecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
/*
En esta actividad hemos hablado de:
Añadirle un menu y escuchar sus items para hacer una accion con ellos
Configurar boton hacia atras
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Inicializamos el boton
        var bIr = findViewById<Button>(R.id.boton)
        //Listener al boton con un intent a la otra pantalla
        bIr.setOnClickListener {
            val intent = Intent (this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
    //Asociamos el menu a nuestro codigo para poder inflarlo
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    //Asociamos los eventos a cada item seleccionado del menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.bFav -> {
                Toast.makeText(this, "Elemento añadido como favorito", Toast.LENGTH_LONG).show()
                return true
            }else -> {
            return super.onOptionsItemSelected(item)
        }
        }
    }
}