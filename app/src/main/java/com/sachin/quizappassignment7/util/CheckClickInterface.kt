package com.sachin.quizappassignment7.util

import com.sachin.quizappassignment7.data.AnswerModel


interface CheckClickInterface {
    fun onCheckBoxChecked(answerModel: AnswerModel)
    fun onCheckBoxUnChecked(answerModel: AnswerModel)
}