package com.cetis108.semana08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libro)

        val libro = intent.getSerializableExtra("libro") as Libro
        val tv_libro_id = findViewById<TextView>(R.id.tvLibroId)
        val tv_libro_titulo = findViewById<TextView>(R.id.tvLibroTitulo)
        val tv_libro_edicion = findViewById<TextView>(R.id.tvLibroEdicion)
        val tv_libro_precio = findViewById<TextView>(R.id.tvLibroPrecio)
        val tv_libro_editorial = findViewById<TextView>(R.id.tvLibroEditorial)
        val tv_libro_autores = findViewById<TextView>(R.id.tvLibroAutores)

        tv_libro_id.text = libro.Id.toString()
        tv_libro_titulo.text = libro.Titulo
        tv_libro_edicion.text = libro.Edicion.toString()
        tv_libro_precio.text = libro.Precio.toString()
        tv_libro_editorial.text = libro.Editorial

        var autores: ArrayList<String> = ArrayList<String>()
        libro.Autores.forEach {
            autores.add(it.nombreCompleto())
        }
        tv_libro_autores.text = autores.joinToString()

    }
}