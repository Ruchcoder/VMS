package com.example.vms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var teamAScore:TextView
    private lateinit var teamBScore:TextView
    private lateinit var enterTeamAScore:EditText
    private lateinit var enterTeamBScore:EditText
    private lateinit var addButton:Button

    private var aScore = " "
    private var bScore = " "



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initializing the variables first

        addButton = findViewById(R.id.addButton)
        enterTeamAScore= findViewById(R.id.enterTeamAScore)
        enterTeamBScore = findViewById(R.id.enterTeamBScore)
        teamAScore = findViewById(R.id.teamAScore)
        teamBScore = findViewById(R.id.teamBScore)



        addButton.setOnClickListener{

            Toast.makeText(this, "Add Score was clicked", Toast.LENGTH_LONG).show()
            aScore = enterTeamAScore.text.toString()
            bScore = enterTeamBScore.text.toString()

//            if(aScore==null){
//                teamAScore
//            }
//            else{teamBScore}
            Toast
                .makeText(this, "Team A Score is $aScore\nTeam B Score is $bScore", Toast.LENGTH_LONG)
                .show()


            teamAScore.text = "Team A:$aScore"
            teamBScore.text = "Team B:$bScore"
            aScore = "20"



        }

    }



}