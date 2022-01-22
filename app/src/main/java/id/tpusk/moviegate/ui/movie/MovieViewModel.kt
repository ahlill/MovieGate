package id.tpusk.moviegate.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.tpusk.moviegate.data.source.MovieGateRepository
import id.tpusk.moviegate.data.source.local.entity.MovieEntity

class MovieViewModel (private val movieGateRepository: MovieGateRepository): ViewModel() {
    fun getMovie(): LiveData<List<MovieEntity>> = movieGateRepository.getAllMovies()
}