package id.tpusk.moviegate.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.tpusk.moviegate.data.source.MovieGateRepository
import id.tpusk.moviegate.data.source.local.entity.TvShowEntity

class TvShowViewModel (private val movieGateRepository: MovieGateRepository) : ViewModel() {
    fun getTvShow(): LiveData<List<TvShowEntity>> = movieGateRepository.getAllTvShow()
}