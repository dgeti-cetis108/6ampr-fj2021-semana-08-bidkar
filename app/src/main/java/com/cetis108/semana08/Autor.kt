package com.cetis108.semana08

import java.io.Serializable

class Autor: Serializable {
    var Id: Int? = null
    var Nombre: String? = null
    var Apellido: String? = null
    var Nacionalidad: String? = null

    fun nombreCompleto(): String {
        // string template
        return "$Nombre $Apellido"
    }
}