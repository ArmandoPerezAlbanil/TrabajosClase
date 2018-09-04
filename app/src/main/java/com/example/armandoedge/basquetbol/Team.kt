package com.example.armandoedge.basquetbol

class Team {
    var TotalPuntos: Int =0
    fun tresPuntos(){
        TotalPuntos += 3
    }
    fun dosPuntos(){
        TotalPuntos += 2
    }
    fun unPuntos(){
        TotalPuntos += 1
    }
    fun  Reset(){
        TotalPuntos = 0
    }
}