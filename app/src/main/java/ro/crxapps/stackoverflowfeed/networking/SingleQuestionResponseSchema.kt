package ro.crxapps.stackoverflowfeed.networking

import com.google.gson.annotations.SerializedName
import ro.crxapps.stackoverflowfeed.questions.QuestionWithBody

data class SingleQuestionResponseSchema(@SerializedName("items") val questions: List<QuestionWithBody>) {
    val question: QuestionWithBody get() = questions[0]
}