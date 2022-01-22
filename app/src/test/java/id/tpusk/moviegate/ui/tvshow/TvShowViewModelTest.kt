package id.tpusk.moviegate.ui.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import id.tpusk.moviegate.data.source.MovieGateRepository
import id.tpusk.moviegate.data.source.local.entity.TvShowEntity
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
class TvShowViewModelTest {

    private lateinit var tvShowViewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieGateRepository: MovieGateRepository

    @Mock
    private lateinit var observer: Observer<List<TvShowEntity>>

    @Before
    fun setUp() {
        tvShowViewModel = TvShowViewModel(movieGateRepository)
    }

    @Test
    fun getTvShow() {
        val dummyTvShow = DataDummy.generateDummyTvShow()
        val tvShow = MutableLiveData<List<TvShowEntity>>()
        tvShow.value = dummyTvShow

        `when`(movieGateRepository.getAllTvShow()).thenReturn(tvShow)
        val tvShowEntities = tvShowViewModel.getTvShow().value
        verify(movieGateRepository).getAllTvShow()
        assertNotNull(tvShowEntities)
        assertEquals(12, tvShowEntities?.size)

        tvShowViewModel.getTvShow().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}

