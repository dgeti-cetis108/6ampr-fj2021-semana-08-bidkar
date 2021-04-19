package com.cetis108.semana08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libro)

        val libro = intent.getSerializableExtra("libro")
        // TODO: mostrar los valores obtenidos, usando la plantilla activity_libro
    }
}