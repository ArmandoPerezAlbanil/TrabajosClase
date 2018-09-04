package com.example.armandoedge.basquetbol

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val TeamA :Team=Team()
    val TeamB :Team=Team()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pointsA3 = findViewById(R.id.pointsA3) as Button;
        val pointsA2 = findViewById(R.id.pointsA2)as Button;

    }

    public fun btnReset(v: View){

        TeamA.Reset()
        TeamB.Reset()
        txtTeamA.setText(TeamA.TotalPuntos.toString())
        txtTeamB.setText(TeamB.TotalPuntos.toString())
    }
    public fun pointsFreeB(v:View){
        TeamB.unPuntos()
        txtTeamB.setText(TeamB.TotalPuntos.toString())


    }
    public fun pointsFreeA(v:View){
        TeamA.unPuntos()
        txtTeamA.setText(TeamA.TotalPuntos.toString())
    }
    public fun pointsA3(v:View){

        TeamA.tresPuntos()
        txtTeamA.setText(TeamA.TotalPuntos.toString())
    }
    public fun pointsB3(v:View){
        TeamB.tresPuntos()
        txtTeamB.setText(TeamB.TotalPuntos.toString())

    }
    public fun pointsA2(v:View){

        TeamA.dosPuntos()
        txtTeamA.setText(TeamA.TotalPuntos.toString())
    }
    public fun pointsB2(v:View){

        TeamB.dosPuntos()
        txtTeamB.setText(TeamB.TotalPuntos.toString())
    }



}
