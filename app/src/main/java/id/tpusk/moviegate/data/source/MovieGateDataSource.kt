package id.tpusk.moviegate.data.source

import androidx.lifecycle.LiveData
import id.tpusk.moviegate.data.source.local.entity.MovieEntity
import id.tpusk.moviegate.data.source.local.entity.TvShowEntity

interface MovieGateDataSource {

    fun getAllMovies(): LiveData<List<MovieEntity>>

    fun getAllTvShow(): LiveData<List<TvShowEntity>>
}