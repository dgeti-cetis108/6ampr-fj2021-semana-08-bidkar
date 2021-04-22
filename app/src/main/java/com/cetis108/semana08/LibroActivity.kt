package com.cetis108.semana08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.cetis108.semana08.databinding.ActivityLibroBinding

class LibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libro)

        val libro = intent.getSerializableExtra("libro") as Libro
        // utilizando el View Binding
        val binding = ActivityLibroBinding.inflate(layoutInflater)
        val tv_libro_id = binding.tvLibroId
        val tv_libro_titulo = binding.tvLibroTitulo
        val tv_libro_edicion = binding.tvLibroEdicion
        val tv_libro_precio = binding.tvLibroPrecio
        val tv_libro_editorial = binding.tvLibroEditorial
        val tv_libro_autores = binding.tvLibroAutores

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