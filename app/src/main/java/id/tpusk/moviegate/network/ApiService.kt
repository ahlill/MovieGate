package id.tpusk.moviegate.network

import id.tpusk.moviegate.data.source.remote.response.MovieResponse
import id.tpusk.moviegate.data.source.remote.response.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("discover/movie")
    fun getMovies(
        @Query("api_key") apiKey: String
    ): Call<MovieResponse>

    @GET("movie/{id}")
    fun getDetailMovie(
        @Query("api_key") apiKey: String,
        @Path("id") id: String
    )

    @GET("discover/tv")
    fun getTvShow(
        @Query("api_key") apiKey: String
    ): Call<TvShowResponse>

    @GET("tv/{id}")
    fun getDetailTvShow(
        @Query("api_key") apiKey: String,
        @Path("tv/{id}") id: String
    )
}