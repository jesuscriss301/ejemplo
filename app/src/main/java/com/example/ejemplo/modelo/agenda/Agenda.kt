package com.example.ejemplo.modelo.agenda

import com.example.ejemplo.modelo.agenda.Contacto
class Agenda {

    private var listaContactos : MutableList<Contacto>

    constructor(listaContacto: MutableList<Contacto>) {
        this.listaContactos = listaContacto
    }
    constructor(new:Contacto){
        listaContactos= arrayListOf(new)
    }

    fun AñadirContacto(new:Contacto){
        this.listaContactos.add(new)
    }

    fun buscarContacto(nombre: String):List<Contacto>{
        var a =this.listaContactos.filter {it.getNombre()==nombre}
        return a
    }
    fun editarContacto(nombreConactoOld:String,newContacto:Contacto):Contacto{
        var c=this.buscarContacto(nombreConactoOld).first()
        var index= this.listaContactos.indexOf(c)
        this.listaContactos.removeAt(index)
        this.listaContactos.add(index,newContacto)
        return c
    }
         //Debuelbe una lista inmutable
    fun cerrarAgenda():List<Contacto>{
             var lista:List<Contacto> = listaContactos.toList()
        return lista
    }

    fun getListaContactos(){this.listaContactos.sortedByDescending { it.getNombre() }}
    fun setListaContactos(new:MutableList<Contacto>){
        listaContactos.clear()
        listaContactos.addAll(new)
    }

    override fun toString(): String {
        return "Agenda(listaContactos=$listaContactos)"
    }

}