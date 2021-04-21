package com.cetis108.semana08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autor = Autor()
        autor.Id = 1
        autor.Nombre = "Bidkar"
        autor.Apellido = "Aragón C."
        autor.Nacionalidad = "Mexicana"

        val autor2 = Autor().apply {
            Id = 2
            Nombre = "Erick"
            Apellido = "Castro"
            Nacionalidad = "Mexicana"
        }

        val libro = Libro().apply {
            Id = 1
            Titulo = "Kotlin para Android"
            Edicion = 2021
            Autores.add(autor)
            Autores.add(autor2)
            Precio = 899.99
            Editorial = "DGETI"
        }

        val btn_mostrar_libro = findViewById<Button>(R.id.btnMainLibro)
        btn_mostrar_libro.setOnClickListener {
            val intent = Intent(this, LibroActivity::class.java)
            intent.putExtra("libro", libro)
            startActivity(intent)
        }
    }
}