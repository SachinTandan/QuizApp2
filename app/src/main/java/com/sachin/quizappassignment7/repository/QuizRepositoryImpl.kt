package com.sachin.quizappassignment7.repository
import com.sachin.quizappassignment7.data.Quiz
import com.sachin.quizappassignment7.data.QuizDAO
import com.sachin.quizappassignment7.database.QuizDatabase
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor(
    private val db: QuizDatabase
) : QuizRepository {

    private var quizDao: QuizDAO = db.quizDAO

    override suspend fun insertQuizQuestions(quizList: MutableList<Quiz>) {
        quizDao.insertQuizQuestions(quizList)
    }

    override suspend fun insertQuiz(quiz: Quiz) {
        quizDao.insertQuiz(quiz)
    }

    override suspend fun getQuizList(): MutableList<Quiz> {
        return quizDao.getQuizList()
    }

    override suspend fun resetQuestionSet() {
        db.clearAllTables()
    }

}