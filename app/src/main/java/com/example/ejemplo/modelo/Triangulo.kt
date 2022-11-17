package com.example.ejemplo.modelo

class Triangulo {
    private var cateto1:Float
    private var cateto2:Float
    private var cateto3:Float

    constructor(cateto1: Float, cateto2: Float, cateto3: Float) {
        this.cateto1 = cateto1
        this.cateto2 = cateto2
        this.cateto3 = cateto3
    }

    constructor(cateto1: Float, cateto2: Float) {
        this.cateto1 = cateto1
        this.cateto2 = cateto2
        this.cateto3 = cateto1
    }

    constructor(cateto1: Float) {
        this.cateto1 = cateto1
        this.cateto2 = cateto1
        this.cateto3 = cateto1
    }

    fun clasificacionLados():String{

        if(cateto1==cateto2){
            if(cateto2==cateto3)return "Equilátero"
        }else if(cateto2!=cateto3&&cateto1!=cateto3)return "Escaleno"

           return "Isóceles"

    }

    //GETTERS AND SETTERS
    fun getCateto1(){this.cateto1}
    fun getCateto2(){this.cateto2}
    fun getCateto3(){this.cateto3}
    fun setCateto1(new:Float){this.cateto1=new}
    fun setCateto2(new:Float){this.cateto2=new}
    fun setCateto3(new:Float){this.cateto3=new}


    override fun toString(): String {
        return "Triangulo(cateto1=$cateto1, cateto2=$cateto2, cateto3=$cateto3)"
    }


}