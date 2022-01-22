package id.tpusk.moviegate.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.verify
import id.tpusk.moviegate.data.source.remote.RemoteDataSource
import id.tpusk.moviegate.util.DataDummy
import id.tpusk.moviegate.util.LiveDataTestUtil
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito

class MovieGateRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val movieGateRepository = FakeMovieGateRepository(remote)

    private val movieResponse = DataDummy.generateRemoteDummyMovie()

    private val tvShowResponse = DataDummy.generateRemoteDummyTvShow()

    @Test
    fun getAllMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback).onAllMoviesReceived(
                movieResponse
            )
            null
        }.`when`(remote).getAllMovies(any())
        val movieEntities = LiveDataTestUtil.getValue(movieGateRepository.getAllMovies())
        verify(remote).getAllMovies(any())
        assertNotNull(movieEntities)
        assertEquals(movieResponse[0].title, movieEntities[0].title)
        assertEquals(movieResponse[0].genre, movieEntities[0].genre)
        assertEquals(movieResponse[0].movieId, movieEntities[0].movieId)
        assertEquals(movieResponse[0].rating, movieEntities[0].rating)
        assertEquals(movieResponse[0].budget, movieEntities[0].budget)
        assertEquals(movieResponse[0].overview, movieEntities[0].overview)
        assertEquals(movieResponse[0].posterPath, movieEntities[0].posterPath)
        assertEquals(movieResponse[0].release, movieEntities[0].release)
        assertEquals(movieResponse[0].revenue, movieEntities[0].revenue)
        assertEquals(movieResponse.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getAllTvShow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback).onAllTvShowReceived(
                tvShowResponse
            )
            null
        }.`when`(remote).getAllTvShow(any())
        val tvShowEntities = LiveDataTestUtil.getValue(movieGateRepository.getAllTvShow())
        verify(remote).getAllTvShow(any())
        assertNotNull(tvShowEntities)
        assertEquals(tvShowResponse[0].title, tvShowEntities[0].title)
        assertEquals(tvShowResponse[0].genre, tvShowEntities[0].genre)
        assertEquals(tvShowResponse[0].networkLabelPath, tvShowEntities[0].networkLabelPath)
        assertEquals(tvShowResponse[0].overview, tvShowEntities[0].overview)
        assertEquals(tvShowResponse[0].posterPath, tvShowEntities[0].posterPath)
        assertEquals(tvShowResponse[0].rating, tvShowEntities[0].rating)
        assertEquals(tvShowResponse[0].status, tvShowEntities[0].status)
        assertEquals(tvShowResponse[0].tvShowId, tvShowEntities[0].tvShowId)
        assertEquals(tvShowResponse.size.toLong(), tvShowEntities.size.toLong())
    }
}













