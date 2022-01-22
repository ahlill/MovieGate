package id.tpusk.moviegate.data.source

import androidx.lifecycle.*
import id.tpusk.moviegate.data.source.local.entity.MovieEntity
import id.tpusk.moviegate.data.source.local.entity.TvShowEntity
import id.tpusk.moviegate.data.source.remote.RemoteDataSource
import id.tpusk.moviegate.data.source.remote.response.MovieResponse
import id.tpusk.moviegate.data.source.remote.response.TvShowResponse

class MovieGateRepository private constructor(private val remoteDataSource: RemoteDataSource) : MovieGateDataSource {

    companion object {
        @Volatile
        private var instance: MovieGateRepository? = null

        fun getInstance(remoteData: RemoteDataSource): MovieGateRepository =
                instance ?: synchronized(this) {
                    instance ?: MovieGateRepository(remoteData).apply { instance = this }
                }
    }
    override fun getAllMovies(): LiveData<List<MovieEntity>> {
        val movieResult = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback{
            override fun onAllMoviesReceived(movieResponse: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in movieResponse){
                    val movie = MovieEntity(
                        response.movieId,
                        response.title,
                        response.posterPath,
                        response.release,
                        response.genre,
                        response.budget,
                        response.revenue,
                        response.overview,
                        response.rating
                    )
                    movieList.add(movie)
                }
                movieResult.postValue(movieList)
            }
        })
        return movieResult
    }

    override fun getAllTvShow(): LiveData<List<TvShowEntity>> {
        val tvShowResult = MutableLiveData<List<TvShowEntity>>()
        remoteDataSource.getAllTvShow(object : RemoteDataSource.LoadTvShowsCallback{
            override fun onAllTvShowReceived(tvShowResponse: List<TvShowResponse>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for (response in tvShowResponse){
                    val tvShow = TvShowEntity(
                        response.tvShowId,
                        response.title,
                        response.posterPath,
                        response.genre,
                        response.networkLabelPath,
                        response.status,
                        response.overview,
                        response.rating
                    )
                    tvShowList.add(tvShow)
                }
                tvShowResult.postValue(tvShowList)
            }
        })
        return tvShowResult
    }
}