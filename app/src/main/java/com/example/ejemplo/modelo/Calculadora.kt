package com.example.ejemplo.modelo

 class Calculadora{

    private var nuemro1:Int
    private var nuemro2: Int



    constructor() {

        this.nuemro1= readln().toInt()
        this.nuemro2= readln().toInt()
    }
    constructor(nuemro1: Int, nuemro2: Int) {
        this.nuemro1 = nuemro1
        this.nuemro2 = nuemro2
   }

    fun operacion(n:Int):Float?{

        //var n= readln().toInt()
        var rta: Float?=  when (n) {
            1 -> {
                suma()
            }
            2 -> {
                resta()
            }
            3 -> {
                multiplicacion()
            }
            4 -> {
                division()
            }
            else -> {null}
        }
        return rta
    }
     fun operacion():Float?{

         var n= readln().toInt()
         var rta: Float?=  when (n) {
             1 -> {
                 suma()
             }
             2 -> {
                 resta()
             }
             3 -> {
                 multiplicacion()
             }
             4 -> {
                 division()
             }
             else -> {null}
         }
         return rta
     }

    private fun suma():Float{
        return this.nuemro1+nuemro2.toFloat()
    }
    private fun resta():Float{
        return this.nuemro1-nuemro2.toFloat()
    }

    private fun multiplicacion():Float{
        return this.nuemro1*nuemro2.toFloat()
    }

    private fun division():Float{
        return this.nuemro1/nuemro2.toFloat()
    }

    //GETTERS AND SETTERS
    fun getNumero1(){this.nuemro1}
    fun getNumero2(){this.nuemro2}
    fun setNumero1(new:Int){this.nuemro1= new}
    fun setNumero2(new:Int){this.nuemro2= new}

    override fun toString(): String {
        return "Calculadora(nuemro1=$nuemro1, nuemro2=$nuemro2)"
    }

}