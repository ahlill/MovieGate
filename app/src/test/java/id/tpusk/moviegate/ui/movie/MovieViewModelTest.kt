package id.tpusk.moviegate.ui.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import id.tpusk.moviegate.data.source.MovieGateRepository
import id.tpusk.moviegate.data.source.local.entity.MovieEntity
import id.tpusk.moviegate.util.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {

    private lateinit var movieViewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieGateRepository: MovieGateRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun setUp() {
        movieViewModel = MovieViewModel(movieGateRepository)
    }


    @Test
    fun getMovie() {
        val dummyMovies = DataDummy.generateDummyMovie()
        val movies = MutableLiveData<List<MovieEntity>>()
        movies.value = dummyMovies

        `when`(movieGateRepository.getAllMovies()).thenReturn(movies)
        val movieEntities = movieViewModel.getMovie().value
        verify(movieGateRepository).getAllMovies()
        assertNotNull(movieEntities)
        assertEquals(12, movieEntities?.size)


        movieViewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(dummyMovies)
    }
}