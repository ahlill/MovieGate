package id.tpusk.moviegate.ui.detail

import id.tpusk.moviegate.util.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailFilmViewModelTest {

    private lateinit var detailFilmViewModel: DetailFilmViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val movieId = dummyMovie.movieId

    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val tvShowId = dummyTvShow.tvShowId

    @Before
    fun setUp() {
        detailFilmViewModel = DetailFilmViewModel()
        detailFilmViewModel.setSelectedMovie(movieId)
        detailFilmViewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun getMovie() {
        detailFilmViewModel.setSelectedMovie(dummyMovie.movieId)
        val movieEntity = detailFilmViewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.movieId, movieEntity.movieId)
        assertEquals(dummyMovie.posterPath, movieEntity.posterPath)
        assertEquals(dummyMovie.budget, movieEntity.budget)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.rating, movieEntity.rating)
        assertEquals(dummyMovie.release, movieEntity.release)
        assertEquals(dummyMovie.revenue, movieEntity.revenue)
        assertEquals(dummyMovie.title, movieEntity.title)
    }

    @Test
    fun getTvShow() {
        detailFilmViewModel.setSelectedTvShow(dummyTvShow.tvShowId)
        val tvShowEntity = detailFilmViewModel.getTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.networkLabelPath, tvShowEntity.networkLabelPath)
        assertEquals(dummyTvShow.posterPath, tvShowEntity.posterPath)
        assertEquals(dummyTvShow.genre, tvShowEntity.genre)
        assertEquals(dummyTvShow.overview, tvShowEntity.overview)
        assertEquals(dummyTvShow.rating, tvShowEntity.rating)
        assertEquals(dummyTvShow.status, tvShowEntity.status)
        assertEquals(dummyTvShow.title, tvShowEntity.title)
        assertEquals(dummyTvShow.tvShowId, tvShowEntity.tvShowId)

    }
}