package com.example.imadassignmentone

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //allows edit text variable to be found and used in the code
        val txtInfo = findViewById<TextView>(R.id.textInfo)

        //allows edit text variable to be found and used in the code
        val editTxtTime = findViewById<EditText>(R.id.editTxtTime)

        //allows button to be found and used in the code
        val btnGenMeal = findViewById<Button>(R.id.btnGenMeal)

        //allows button to be found and used in the code
        val btnReset = findViewById<Button>(R.id.btnReset)

        //changes the text in the textbox when the app is first run; This code was adapted from Geeks for Geeks (2025): https://www.geeksforgeeks.org/textview-in-kotlin/
        txtInfo.text = """
            Welcome to the meal generator.
            Insert a time of day from the options 
            below to receive a meal option:
             - Morning
             - Mid-morning 
             - Afternoon
             - Mid-afternoon 
             - Evening
             - Late-night 
        """.trimIndent()

        //gives the button a function
        btnGenMeal.setOnClickListener {
            val userInput: String =
                editTxtTime.text.toString() //converts editText to String; This code was adapted from a Stack Overflow post by "Mehran" (2017): https://stackoverflow.com/questions/44267572/edittext-get-text-kotlin

            //displays the text given if correct inputs are detected; This code was adapted from W3 Schools (2025): https://www.w3schools.com/kotlin/kotlin_conditions.php
            if (userInput == "Morning" || userInput == "morning")  {
                txtInfo.text = """
                    This meal is breakfast.
                    Try having:
                    oatmeal with nuts and fruit.
                    """.trimIndent()

            } else if (userInput == "Mid-morning" || userInput == "mid-morning") {
                txtInfo.text = """
                    This meal is a snack.
                    Try having:
                    rice cakes with penut butter.
                """.trimIndent()

            } else if (userInput == "Afternoon" || userInput == "afternoon") {
                txtInfo.text = """
                    This meal is lunch.
                    Try having:
                    a chicken salad.
                """.trimIndent()

            } else if (userInput == "Mid-afternoon"|| userInput == "mid-afternoon") {
                txtInfo.text = """
                    This meal is a snack.
                    Try having:
                    carrot and celery sticks.
                """.trimIndent()

            } else if (userInput == "Evening" || userInput == "evening") {
                txtInfo.text = """
                    This meal is dinner.
                    Try having:
                    spaghetti bolognese.
                """.trimIndent()

            } else if (userInput == "Late-night" || userInput == "late-night") {
                txtInfo.text = """
                    This meal is dessert.
                    Try having:
                    ice cream in a waffle cone.
                """.trimIndent()

            // error handling - outputs the following text if any value other than the ones stated are inputted
            } else txtInfo.text = """
                That isn't a valid time.
                Please try again.
            """.trimIndent()
        }

        // Gives the button a function
        btnReset.setOnClickListener {
            txtInfo.text = """
            Welcome to the meal generator.
            Insert a time of day from the options 
            below to receive a meal option:
             - Morning
             - Mid-morning 
             - Afternoon
             - Mid-afternoon 
             - Evening
             - Late-night 
        """.trimIndent()
            editTxtTime.setText(null) //clears an editText box; This code was adapted from a Stack Overflow post by "Adil Soomro" (2013): https://stackoverflow.com/questions/7241808/how-to-reset-edittext-after-an-action-has-been-completed/7241832
        }




    }
}

// Title: TextView in Kotlin
// Author: Geeks for Geeks
// Date: 24 February 2025
// Version: 1.0
// Available: https://www.geeksforgeeks.org/textview-in-kotlin/

// Title: editText get text Kotlin.
// Author: "Mehran" on Stack Overflow
// Date: 3 October 2018
// Version: 1.0
// Available: https://stackoverflow.com/questions/44267572/edittext-get-text-kotlin

//Title: Kotlin If ... Else
// Author: W3 Schools
// Date: 27 March 2025
// Version: 1.0
// Available: https://www.w3schools.com/kotlin/kotlin_conditions.php

// Title: How to reset EditText after an action has been completed?
// Author: "Adil Soomro" on Stack Overflow
// Date: 12 November 2013
// Version: 1.0
// Available: https://stackoverflow.com/questions/7241808/how-to-reset-edittext-after-an-action-has-been-completed/7241832