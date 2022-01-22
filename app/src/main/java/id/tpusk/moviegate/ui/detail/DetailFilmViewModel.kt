package id.tpusk.moviegate.ui.detail

import androidx.lifecycle.ViewModel
import id.tpusk.moviegate.data.source.local.entity.MovieEntity
import id.tpusk.moviegate.data.source.local.entity.TvShowEntity
import id.tpusk.moviegate.util.DataDummy

class DetailFilmViewModel : ViewModel() {

    private lateinit var movieId: String
    private lateinit var tvShowId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): MovieEntity {
        lateinit var movie: MovieEntity
        val movieEntities = DataDummy.generateDummyMovie()
        for (movieEntity in movieEntities) {
            if (movieEntity in movieEntities) {
                if (movieEntity.movieId == movieId) {
                    movie = movieEntity
                }
            }
        }
        return movie
    }

    fun setSelectedTvShow(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    fun getTvShow(): TvShowEntity {
        lateinit var tvShow: TvShowEntity
        val tvShowEntities = DataDummy.generateDummyTvShow()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity in tvShowEntities) {
                if (tvShowEntity.tvShowId == tvShowId) {
                    tvShow = tvShowEntity
                }
            }
        }
        return tvShow
    }
}