package id.tpusk.moviegate.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.tpusk.moviegate.data.source.MovieGateRepository
import id.tpusk.moviegate.di.Injection
import id.tpusk.moviegate.ui.movie.MovieViewModel
import id.tpusk.moviegate.ui.tvshow.TvShowViewModel

class ViewModelFactory private constructor(private val mMovieGateRepository: MovieGateRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                MovieViewModel(mMovieGateRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                TvShowViewModel(mMovieGateRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(): ViewModelFactory =
                instance ?: synchronized(this) {
                    instance ?: ViewModelFactory(Injection.provideRepository()).apply { instance = this }
                }
    }
}