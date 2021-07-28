package ro.crxapps.stackoverflowfeed.questions

import ro.crxapps.stackoverflowfeed.networking.StackoverflowApi
import javax.inject.Inject

class FetchQuestionDetailsUseCase @Inject constructor(private val stackoverflowApi: StackoverflowApi) {

    sealed class Result {
        data class Success(val question: QuestionWithBody)
    }
}