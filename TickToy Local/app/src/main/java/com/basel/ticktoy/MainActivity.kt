package com.basel.ticktoy

import android.app.usage.NetworkStats
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.CellIdentity
import android.util.Log
import android.view.View
import android.widget.Button
import android.util.Log.d
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ButtonSelect(view:View){
        val BuChoice=view as Button
        var CellId=0
        when(BuChoice.id){
            R.id.bu1-> CellId=1
            R.id.bu2 ->CellId=2
            R.id.bu3 ->CellId=3
            R.id.bu4 ->CellId=4
            R.id.bu5 ->CellId=5
            R.id.bu6 ->CellId=6
            R.id.bu7 ->CellId=7
            R.id.bu8 ->CellId=8
            R.id.bu9 ->CellId=9

        }
        //Log.d("Cellid : ",CellId.toString())
        playgame(CellId,BuChoice)

    }
    var player1 =ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activeplayer = 1
    fun playgame(CellID:Int,BuChoice:Button){
        if (activeplayer==1){
            BuChoice.text="X"
            BuChoice.setBackgroundResource(R.color.red)
            player1.add(CellID)
            activeplayer=2
            autoplay()
        }else{
            BuChoice.text="O"
            BuChoice.setBackgroundResource(R.color.green)
            player2.add(CellID)
            activeplayer=1
        }
        BuChoice.isEnabled = false
        CheckWinner()
    }
    fun CheckWinner(){
        //rows
        var winner = 0
        if(player1.contains(1) && player1.contains(2) && player1.contains(3) || player1.contains(4)&&player1.contains(5)&& player1.contains(6) || player1.contains(7)&&player1.contains(8)&&player1.contains((9))){
            winner=1

        }
        if(player2.contains(1) && player2.contains(2) && player2.contains(3) || player2.contains(4)&&player2.contains(5)&& player2.contains(6) || player2.contains(7)&&player2.contains(8)&&player2.contains((9))){
            winner=2
        }
        //  3mod
        if(player1.contains(1) && player1.contains(4) && player1.contains(7) || player1.contains(2)&&player1.contains(5)&& player1.contains(8) || player1.contains(3)&&player1.contains(6)&&player1.contains((9))){
            winner=1
        }
        if(player2.contains(1) && player2.contains(4) && player2.contains(7) || player2.contains(2)&&player2.contains(5)&& player2.contains(8) || player2.contains(3)&&player2.contains(6)&&player2.contains((9))){
            winner=2
        }
        if (player1.contains(1)&& player1.contains(5)&&player1.contains(9) || player1.contains(3)&& player1.contains(5)&&player1.contains(7)){
            winner=1
        }
        if (player2.contains(1)&& player2.contains(5)&&player2.contains(9) || player2.contains(3)&& player2.contains(5)&&player2.contains(7)){
            winner=2
        }
        if (winner !=0){
            if (winner==1){
                Toast.makeText(this,"player 1 win the game",Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"player 2 win the game",Toast.LENGTH_LONG).show()
            }
        }
    }
    fun autoplay(){
        var emptycell =ArrayList<Int>()
        for(CellID in 1..9){
            if (!(player1.contains(CellID))){
                emptycell.add(CellID)
            }

        }
        val r = Random
        val randIndex = r.nextInt(emptycell.size-1)
        val ID =emptycell[randIndex]
        val buSelect:Button
        when(ID){
            1->buSelect=bu1
            2->buSelect=bu2
            3->buSelect=bu3
            4->buSelect=bu4
            5->buSelect=bu5
            6->buSelect=bu6
            7->buSelect=bu7
            8->buSelect=bu8
            9->buSelect=bu9
            else->{
                buSelect=bu1
            }
        }
        playgame(ID,buSelect)
    }
}