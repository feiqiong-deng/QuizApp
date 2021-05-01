package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val userName = intent.getStringExtra(Constant.USER_NAME)
        tv_name.text = userName
        val totalQuizQuestions = intent.getIntExtra(Constant.TOTAL_QUESTION, 0)
        val score = intent.getIntExtra(Constant.CORRECT_ANSWERS, 0)

        tv_score.text = "Your score is $score out of $totalQuizQuestions."

        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}