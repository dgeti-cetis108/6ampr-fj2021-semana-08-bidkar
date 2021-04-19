package com.cetis108.semana08

import java.io.Serializable

class Libro: Serializable {
    var Id: Int? = null
    var Titulo: String? = null
    var Edicion: Int? = null
    var Autores: ArrayList<Autor> = ArrayList<Autor>()
    var Precio: Double? = null
    var Editorial: String? = null
}