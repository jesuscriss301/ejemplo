package com.example.ejemplo.modelo

class Alumno {

    private var nombre:String
    //la nota debe estar entre 0 y 5
    private var nota:Float

    constructor(nombre: String, nota: Float) {
        this.nombre = nombre
        if(nota>=0||nota<5){this.nota = nota}
        else if (nota>5)this.nota=5f
        else this.nota=0f
    }

    constructor(nombre: String) {
        this.nombre = nombre
        this.nota=0f
    }

    fun esAprobado():Boolean{
           return this.nota>=3
    }

    //GETTER AND SETTER
    fun getNombre():String{return this.nombre}
    fun getNota():Float{return this.nota}
    fun setNombre(new:String){this.nombre=new}
    fun setNota(new:Float){this.nota=new}

    override fun toString(): String {
        return "Alumno(nombre='$nombre', nota=$nota)"
    }


}