package com.example.vms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.text.isDigitsOnly


class MainActivity : AppCompatActivity() {

    //Declare variables i.e the properties of the app interface
    private lateinit var teamAScore:TextView
    private lateinit var teamBScore:TextView
    private lateinit var enterTeamAScore:EditText
    private lateinit var enterTeamBScore:EditText
    private lateinit var addButton:Button

    private var aScore = "0" //Assuming the user dint type in anything
    private var bScore = "0" //Assuming the user dint type in anything

//    private var aScore = 0  //Assuming the initial value is zero
//    private var bScore = 0  //Assuming the initial value is zero



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initializing the variables first

        addButton = findViewById(R.id.addButton)
        enterTeamAScore = findViewById(R.id.enterTeamAScore)
        enterTeamBScore = findViewById(R.id.enterTeamBScore)
        teamAScore = findViewById(R.id.teamAScore)
        teamBScore = findViewById(R.id.teamBScore)



        addButton.setOnClickListener {


            aScore = enterTeamAScore.text.toString()//.toInt() //will be here after the .toString if the initial value of ascore be zero
            bScore = enterTeamBScore.text.toString()//.toInt() //will be here after the .toString if the initial value of bscore be zero



            if (aScore.isNullOrEmpty()) {
                //null check i.e if the user doesn't type in a value at all
                Toast.makeText(this, "Enter a valid number", Toast.LENGTH_SHORT).show()

            } else if (bScore.isNullOrEmpty()) {

                //null check i.e if the user doesn't type in a value at all
                Toast.makeText(this, "Enter a valid number", Toast.LENGTH_SHORT).show()
            } else {

                Toast.makeText(
                    this,
                    "Team A Score is ${aScore} \nTeam B Score is ${bScore}", Toast.LENGTH_LONG
                ).show()

                updateTeam()
                showWinnerPopUp()
              }
            }
        }






   private fun showWinnerPopUp() {
        var msg = if (aScore.toInt() > bScore.toInt()) {

            "Team A is the Winner"
        } else {
            "Team B is the Winner"
        }

        var alertDialog = AlertDialog.Builder(this)
        alertDialog.setMessage(msg)
            .setTitle("Who is the Getter")
            .setPositiveButton("OK", null)
            .show()
    }

    private fun updateTeam() {
        teamAScore.text = "Team A:$aScore"  // this displays the updated value of Team A and Team B
        teamBScore.text = "Team B:$bScore"

        //                Toast.makeText(this,
        //                    "The sum of Team A Score and Team B Score is ${aScore + bScore}", Toast.LENGTH_LONG).show()


    }
}
