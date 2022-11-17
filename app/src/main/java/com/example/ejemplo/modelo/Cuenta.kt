package com.example.ejemplo.modelo

open class Cuenta {

    private var titular: String
    private var cuenta: Double

    constructor(titular: String){

        this.titular=titular
        this.cuenta=0.0
    }

    constructor(titular: String, cuenta: Double) {
        this.titular = titular
        this.cuenta = cuenta
    }
    fun getTitular():String{return this.titular}
    fun getCuenta():Double {return this.cuenta}
    fun setTitular(new:String){this.titular=new}
    fun setCuenta(new:Double){this.cuenta=new}

    override fun toString(): String {
        return "Cuenta(titular='$titular', cuenta=$cuenta)"
    }

    fun ingrezar(cantidad: Double):Double{

        if (cantidad>=0) this.cuenta+=cantidad
        return getCuenta()
    }

    fun retirar(cantidad: Double):Double{
        if (cantidad>=this.cuenta) return 0.0
        setCuenta(this.cuenta-cantidad)
        return getCuenta()
    }
    fun transferencia(cantidad: Double,cuenta: Cuenta,recibe:Boolean=false):String{
        var rta=""
        if (recibe){
            ingrezar(cantidad)
        }
        else{
            if (this.getCuenta()>cantidad) {
                retirar(cantidad)
                cuenta.transferencia(cantidad,this, true)
                rta="enviando!"
            } else {rta= "transferencia fallida, no hay suficientes fondos."
            }
        }
        return rta
    }

}