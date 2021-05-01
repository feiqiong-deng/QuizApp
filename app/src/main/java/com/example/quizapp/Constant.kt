package com.example.quizapp

object Constant{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What is this?",
            R.drawable.apple,
            "Apple", "Banana",
            "Lemon", "Grape", 1
        )
        questionsList.add(que1)

        val que2 = Question(
                2, "What is this?",
                R.drawable.banana,
                "Apple", "Banana",
                "Lemon", "Grape", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
                3, "What is this?",
                R.drawable.sun,
                "Moon", "Star",
                "Cloud", "Sun", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
                4, "What is this?",
                R.drawable.star,
                "Moon", "Star",
                "Cloud", "Sun", 2
        )

        questionsList.add(que4)

        return questionsList
    }

}