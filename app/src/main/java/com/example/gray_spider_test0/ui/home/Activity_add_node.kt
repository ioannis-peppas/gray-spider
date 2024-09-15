package com.example.gray_spider_test0.ui.home

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gray_spider_test0.MainActivity
import com.example.gray_spider_test0.MyDatabaseHelper
import com.example.gray_spider_test0.R

class Activity_add_node : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_node)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    companion object {
        var numeralInt: Int = 0
        var gCheckInt: Int = 0
        var understandingInt: Int = 0
        var timeInt: Int = 0
        var moneyInt: Int = 0
        var workInt: Int = 0
        var networkingInt: Int = 0
        var voltageInt: Int = 0
    }

    @RequiresApi(Build.VERSION_CODES.P)
    fun SubmitNode(view: View) {


        val numeralText: EditText = findViewById<EditText>(R.id.numeral)
        if ( numeralText.getText().isNotBlank()) {
             numeralInt = numeralText.getText().toString().toInt()


            val myDB = MyDatabaseHelper(this@Activity_add_node)


            myDB.addNode(
                numeralInt, gCheckInt, understandingInt,
                timeInt, moneyInt, workInt, networkingInt,
                voltageInt)

            finish()

        }

    }



    fun subtractGCheck(view: View) {
        val gCheckText: EditText = findViewById<EditText>(R.id.investment_val)
        gCheckInt -= 1
        gCheckText.setText(gCheckInt.toString())

    }
    fun AddGCheck(view: View) {
        val gCheckText: EditText = findViewById<EditText>(R.id.investment_val)
        gCheckInt += 1
        gCheckText.setText(gCheckInt.toString())
    }
    fun SubtractUnderstanding(view: View) {
        val understandingText: EditText = findViewById(R.id.understanding_val)
        understandingInt -= 1
        understandingText.setText(understandingInt.toString())
    }
    fun AddUnderstanding(view: View) {
        val understandingText: EditText = findViewById(R.id.understanding_val)
        understandingInt+= 1
        understandingText.setText(understandingInt.toString())
    }
    fun SubtractTime(view: View) {
        val timeText: EditText = findViewById(R.id.time_val)
        timeInt -= 1
        timeText.setText(timeInt.toString())
    }
    fun AddTime(view: View) {
        val timeText: EditText = findViewById(R.id.time_val)
        timeInt += 1
        timeText.setText(timeInt.toString())
    }
    fun SubtractMoney(view: View) {
        val moneyText: EditText = findViewById(R.id.money_val)
        moneyInt -= 1
        moneyText.setText(moneyInt.toString())
    }
    fun AddMoney(view: View) {
        val moneyText: EditText = findViewById(R.id.money_val)
        moneyInt += 1
        moneyText.setText(moneyInt.toString())

    }
    fun SubtractWork(view: View) {
        val workText: EditText = findViewById(R.id.work_val)
        workInt -= 1
        workText.setText(workInt.toString())

    }
    fun AddWork(view: View) {
        val workText: EditText = findViewById(R.id.work_val)
        workInt += 1
        workText.setText(workInt.toString())

    }
    fun SubtractNetworking(view: View) {
        val networkingText: EditText = findViewById(R.id.networking_val)
        networkingInt -= 1
        networkingText.setText(networkingInt.toString())
    }
    fun AddNetworking(view: View) {
        val networkingText: EditText = findViewById(R.id.networking_val)
        networkingInt += 1
        networkingText.setText(networkingInt.toString())

    }
    fun SubtractVoltage(view: View) {
        val voltageText: EditText = findViewById(R.id.voltage_val)
        voltageInt -= 1
        voltageText.setText(voltageInt.toString())

    }
    fun AddVoltage(view: View) {
        val voltageText: EditText = findViewById(R.id.voltage_val)
        voltageInt += 1
        voltageText.setText(voltageInt.toString())

    }

}