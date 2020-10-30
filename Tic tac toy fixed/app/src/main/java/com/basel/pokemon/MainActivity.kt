package com.basel.pokemon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val player1 = ArrayList<Int>()
    val playerPC = ArrayList<Int>()
    var Activeplayer = 1
    var test = true
    fun AllButton(view: View) {
        var button_choice = view as Button
        var Cellid = 0
        if (button_choice.id == R.id.bu1) {
            Cellid = 1
        } else if (button_choice.id == R.id.bu2) {
            Cellid = 2
        } else if (button_choice.id == R.id.bu3) {
            Cellid = 3
        } else if (button_choice.id == R.id.bu4) {
            Cellid = 4
        } else if (button_choice.id == R.id.bu5) {
            Cellid = 5
        } else if (button_choice.id == R.id.bu6) {
            Cellid = 6
        } else if (button_choice.id == R.id.bu7) {
            Cellid = 7
        } else if (button_choice.id == R.id.bu8) {
            Cellid = 8
        } else if (button_choice.id == R.id.bu9) {
            Cellid = 9
        }
        playgame(Cellid, button_choice)

    }

    fun playgame(CellID: Int, button_choice: Button) {
        if (Activeplayer == 1) {
            button_choice.text = "X"
            button_choice.setBackgroundResource(R.color.PlayerGreen)
            Activeplayer = 2
            player1.add(CellID)
            Player_PC()

        } else {
            button_choice.text = "O"
            button_choice.setBackgroundResource(R.color.PcRed)
            Activeplayer = 1
            playerPC.add(CellID)
        }
        button_choice.isEnabled = false

    }

    fun Player_PC() {

        var button_choice: Button
        var id: Int = 0
        val r = Random
        val randIndex = r.nextInt(1,9)
        button_choice=bu1
            for (empty_choice in player1) {
                if (player1.size == 1) {
                    when (randIndex) {
                        1 -> button_choice = bu1
                        2 -> button_choice = bu2
                        3 -> button_choice = bu3
                        4 -> button_choice = bu4
                        5 -> button_choice = bu5
                        6 -> button_choice = bu6
                        7 -> button_choice = bu7
                        8 -> button_choice = bu8
                        9 -> button_choice = bu9
                        else -> {
                            button_choice = bu1
                        }
                    }
                }
            }
                for(num in 1..9){
                    if (bu1.isEnabled== true && bu2.isEnabled==true&& bu3.isEnabled==true&& bu4.isEnabled==true&& bu5.isEnabled==true&& bu6.isEnabled==true&& bu7.isEnabled==true&& bu8.isEnabled==true && bu9.isEnabled==true) {
                            break
                    }
                }

                if (player1.contains(1) && player1.contains(3) && !(playerPC.contains(2)) && !(player1.contains(2)))
                {
                    id = 2
                    button_choice = bu2
                    playerPC.add(id)
                  //  button_choice.isEnabled = false
                }
                if (player1.contains(1) && player1.contains(2) && !(playerPC.contains(3))&& !(player1.contains(3))) {
                    id = 3
                    button_choice = bu3
                    playerPC.add(id)
                  //  button_choice.isEnabled = false
                }
                if (player1.contains(2) && player1.contains(3) && !(playerPC.contains(1))&& !(player1.contains(1))) {
                    id = 1
                    button_choice = bu1
                    playerPC.add(id)
                  //  button_choice.isEnabled = false
                }
                if (player1.contains(4) && player1.contains(5) && !(playerPC.contains(6))&& !(player1.contains(6))) {
                    id = 6
                    button_choice = bu6
                    playerPC.add(id)
                   // button_choice.isEnabled = false
                }
                if (player1.contains(6) && player1.contains(5) && !(playerPC.contains(4))&& !(player1.contains(4))) {
                    id = 4
                    button_choice = bu4
                    playerPC.add(id)
                   // button_choice.isEnabled = false
                }
                if (player1.contains(4) && player1.contains(6) && !(playerPC.contains(5))&&!(player1.contains(5))) {
                    id = 5
                    button_choice = bu5
                    playerPC.add(id)
                  //  button_choice.isEnabled = false
                }
                if (player1.contains(7) && player1.contains(8) && !(playerPC.contains(9))&&!(player1.contains(9))) {
                    id = 9
                    button_choice = bu9
                    playerPC.add(id)
                   // button_choice.isEnabled = false
                }
                if (player1.contains(8) && player1.contains(9) && !(playerPC.contains(7))&&!(player1.contains(7))) {
                    id = 7
                    button_choice = bu7
                    playerPC.add(id)
                   // button_choice.isEnabled = false
                }
                if (player1.contains(7) && player1.contains(9) && !(playerPC.contains(8))&&!(player1.contains(8))) {
                    id = 8
                    button_choice = bu8
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(1) && player1.contains(4) && !(playerPC.contains(7))&&!(player1.contains(7))) {
                    id = 7
                    button_choice = bu7
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(4) && player1.contains(7) && !(playerPC.contains(1))&&!(player1.contains(1))) {
                    id = 1
                    button_choice = bu1
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(1) && player1.contains(7) && !(playerPC.contains(4))&&!(player1.contains(4))) {
                    id = 4
                    button_choice = bu4
                    playerPC.add(id)
                   // button_choice.isEnabled = false
                }
                if (player1.contains(2) && player1.contains(5) && !(playerPC.contains(8))&&!(player1.contains(8))) {
                    id = 8
                    button_choice = bu8
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(5) && player1.contains(8) && !(playerPC.contains(2))&&!(player1.contains(2))) {
                    id = 2
                    button_choice = bu2
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(2) && player1.contains(8) && !(playerPC.contains(5))&&!(player1.contains(5))) {
                    id = 5
                    button_choice = bu5
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(3) && player1.contains(6) && !(playerPC.contains(9))&&!(player1.contains(9))) {
                    id = 9
                    button_choice = bu9
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(6) && player1.contains(9) && !(playerPC.contains(3))&&!(player1.contains(3))) {
                    id = 3
                    button_choice = bu3
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(3) && player1.contains(9) && !(playerPC.contains(6))&&!(player1.contains(6))) {
                    id = 6
                    button_choice = bu6
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(3) && player1.contains(5) && !(playerPC.contains(7))&&!(player1.contains(7))) {
                    id = 7
                    button_choice = bu7
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(5) && player1.contains(7) && !(playerPC.contains(3))&&!(player1.contains(3))) {
                    id = 3
                    button_choice = bu3
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(3) && player1.contains(7) && !(playerPC.contains(5))&&!(player1.contains(5))) {
                    id = 5
                    button_choice = bu5
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(9) && player1.contains(5) && !(playerPC.contains(1))&&!(player1.contains(1))) {
                    id = 1
                    button_choice = bu1
                    playerPC.add(id)
                    //button_choice.isEnabled = false
                }
                if (player1.contains(5) && player1.contains(1) && !(playerPC.contains(9))&&!(player1.contains(9))) {
                    id = 9
                    button_choice = bu9
                    playerPC.add(id)
                    //button_choice.isEnabled = false

                }
                if (player1.contains(9) && player1.contains(1) && !(playerPC.contains(5))&& !player1.contains(5)) {
                    id = 5
                    button_choice = bu5
                    playerPC.add(id)
                }
           
        playgame(id, button_choice)


    }
    fun CheckWinner(){
        //rows
        var winner = 0
        if(player1.contains(1) && player1.contains(2) && player1.contains(3) || player1.contains(4)&&player1.contains(5)&& player1.contains(6) || player1.contains(7)&&player1.contains(8)&&player1.contains((9))){
            winner=1

        }
        if(playerPC.contains(1) && playerPC.contains(2) && playerPC.contains(3) || playerPC.contains(4)&&playerPC.contains(5)&& playerPC.contains(6) || playerPC.contains(7)&&playerPC.contains(8)&&playerPC.contains((9))){
            winner=2
        }
        //  3mod
        if(player1.contains(1) && player1.contains(4) && player1.contains(7) || player1.contains(2)&&player1.contains(5)&& player1.contains(8) || player1.contains(3)&&player1.contains(6)&&player1.contains((9))){
            winner=1
        }
        if(playerPC.contains(1) && playerPC.contains(4) && playerPC.contains(7) || playerPC.contains(2)&&playerPC.contains(5)&& playerPC.contains(8) || playerPC.contains(3)&&playerPC.contains(6)&&playerPC.contains((9))){
            winner=2
        }
        if (player1.contains(1)&& player1.contains(5)&&player1.contains(9) || player1.contains(3)&& player1.contains(5)&&player1.contains(7)){
            winner=1
        }
        if (playerPC.contains(1)&& playerPC.contains(5)&&playerPC.contains(9) || playerPC.contains(3)&& playerPC.contains(5)&&playerPC.contains(7)){
            winner=2
        }
        if (winner !=0){
            if (winner==1){
                Toast.makeText(this,"player 1 win the game", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"PC Win", Toast.LENGTH_LONG).show()
            }
        }
        for(num in 1..9){
            if (bu1.isEnabled== true && bu2.isEnabled==true&& bu3.isEnabled==true&& bu4.isEnabled==true&& bu5.isEnabled==true&& bu6.isEnabled==true&& bu7.isEnabled==true&& bu8.isEnabled==true && bu9.isEnabled==true){
                Toast.makeText(this,"PC Win", Toast.LENGTH_LONG).show()
            }
        }
    }


}