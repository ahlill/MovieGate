package id.tpusk.moviegate.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import id.tpusk.moviegate.R
import id.tpusk.moviegate.databinding.ActivityDetailBinding

class DetailFilmActivity : AppCompatActivity() {

    private val activityDetailBinding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
    private val viewModel: DetailFilmViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityDetailBinding.root)

        val extras = intent.extras

        if (extras != null) {
            when (extras.getString(NAME_TYPE)) {
                TYPE_MOVIE -> {
                    val id = extras.getString(NAME_ID)
                    id?.let { viewModel.setSelectedMovie(id) }
                    val mFragmentManager = supportFragmentManager
                    val mFragmentDetailMovie = id?.let { DetailMovieFragment(it) }
                    val fragmentMovie = mFragmentManager.findFragmentByTag(DetailMovieFragment::class.java.simpleName)

                    if (fragmentMovie !is DetailMovieFragment) {
                        if (mFragmentDetailMovie != null) {
                            mFragmentManager
                                .beginTransaction()
                                .add(R.id.detail_placeholder, mFragmentDetailMovie, DetailMovieFragment::class.java.simpleName)
                                .commit()
                        }
                    }
                }
                TYPE_TVSHOW -> {
                    val id = extras.getString(NAME_ID)
                    id?.let { viewModel.setSelectedTvShow(id) }
                    val mFragmentManager = supportFragmentManager
                    val mFragmentDetailTvShow = id?.let { DetailTvShowFragment(it) }
                    val fragmentMovie = mFragmentManager.findFragmentByTag(DetailTvShowFragment::class.java.simpleName)

                    if (fragmentMovie !is DetailMovieFragment) {
                        if (mFragmentDetailTvShow != null) {
                            mFragmentManager
                                .beginTransaction()
                                .add(R.id.detail_placeholder, mFragmentDetailTvShow, DetailTvShowFragment::class.java.simpleName)
                                .commit()
                        }
                    }
                }
            }
        }
    }

    companion object {
        const val TYPE_MOVIE = "type_movie"
        const val TYPE_TVSHOW = "type_tv_show"

        const val NAME_TYPE = "type_name"

        const val NAME_ID = "id"

    }
}