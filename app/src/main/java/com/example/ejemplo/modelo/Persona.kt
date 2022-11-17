package com.example.ejemplo.modelo

class Persona {

    private var nombre:String
    private var edad: Int

    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        if (edad>=0) this.edad = edad
        else this.edad=0
    }

    //si es mayor de edad en colombia la cual es de 18 años
    fun esmaoyorEdad():Boolean{

        return this.edad>=18
    }

    //GETTER AND SETTERS
    fun getNombre() {this.nombre}
    fun getEdad() {this.edad}
    fun setNombre(new:String){this.nombre=new}
    fun setEdad(new:Int){this.edad=new}

    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad)"
    }


}