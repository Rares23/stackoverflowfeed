package ro.crxapps.stackoverflowfeed.networking

import com.google.gson.annotations.SerializedName
import ro.crxapps.stackoverflowfeed.questions.Question

data class QuestionListResponseSchema(@SerializedName("items") val questions: List<Question>)