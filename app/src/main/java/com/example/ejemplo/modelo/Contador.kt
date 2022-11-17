package com.example.ejemplo.modelo

import kotlinx.coroutines.awaitCancellation

class Contador {

    private var indice: Int

    constructor(c:Contador){
        this.indice=c.getIndice()
    }
    constructor(){
        this.indice=0
    }

    constructor(indice: Int) {
        this.indice = indice
    }


    fun incrementar(cantidad: Int):Int{

        setIndice(this.indice+cantidad)
        return getIndice()
    }

    fun decrementar(cantidad: Int):Int{
        if (cantidad>this.indice) {
            setIndice(this.indice-cantidad)
        }
        return getIndice()
    }

    //GETTER AND SETTER
    fun getIndice(): Int {return this.indice}
    fun setIndice(new: Int){this.indice=new}

    override fun toString(): String {
        return "Contador(indice=$indice)"
    }

}