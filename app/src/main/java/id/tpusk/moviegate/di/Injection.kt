package id.tpusk.moviegate.di

import id.tpusk.moviegate.data.source.MovieGateRepository
import id.tpusk.moviegate.data.source.remote.RemoteDataSource
import id.tpusk.moviegate.ui.JsonHelper

object Injection {
    fun provideRepository(): MovieGateRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper())
        return MovieGateRepository.getInstance(remoteDataSource)

    }
}