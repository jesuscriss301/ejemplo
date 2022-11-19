package com.example.ejemplo.modelo.agenda

class Contacto {

    private var nombre: String
    private var numeroCelular: Long
    private var email: String

    constructor(nombre: String, numeroCelular: Long, email: String) {
        this.nombre = nombre
        this.numeroCelular = numeroCelular
        this.email = email
    }

    constructor(nombre: String, numeroCelular: Long) {
        this.nombre = nombre
        this.numeroCelular = numeroCelular
        this.email = "Sin correo registrado"
    }

    constructor(nombre: String, email: String) {
        this.nombre = nombre
        this.email = email
        this.numeroCelular = 0
    }

    //GEETER AND SETTERS
    fun getNombre():String{return this.nombre}
    fun getNumeroCelular():Long{return this.numeroCelular}
    fun getEmail():String{return this.email}
    fun setNombre(new:String){this.nombre=new}
    fun setNumeroCelular(new:Long){this.numeroCelular=new}
    fun setEmail(new:String){this.email=new}

    override fun toString(): String {
        return "Contacto(nombre='$nombre', numeroCelular=$numeroCelular, email='$email')"
    }

}