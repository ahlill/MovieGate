package id.tpusk.moviegate.ui

import id.tpusk.moviegate.data.source.remote.response.MovieResponse
import id.tpusk.moviegate.data.source.remote.response.TvShowResponse
import id.tpusk.moviegate.util.DataDummy

class JsonHelper {

    fun loadMovies(): List<MovieResponse> = DataDummy.generateRemoteDummyMovie()
    fun loadTvShow(): List<TvShowResponse> = DataDummy.generateRemoteDummyTvShow()

}