package ro.crxapps.stackoverflowfeed.networking

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ro.crxapps.stackoverflowfeed.Constants

interface StackoverflowApi {
    @GET("/questions?key=${Constants.STACKOVERFLOW_API_KEY}&order=desc&sort=activity&site=stackoverflow")
    suspend fun lastActiveQuestions(@Query("pagesize") pageSize: Int?): Response<QuestionListResponseSchema>

    @GET("/questions/{guestionId}?key=${Constants.STACKOVERFLOW_API_KEY}&site=stackoverflow&filter=withbody")
    suspend fun questionDetails(@Path("questionId") questionId: String?): Response<SingleQuestionResponseSchema>
}