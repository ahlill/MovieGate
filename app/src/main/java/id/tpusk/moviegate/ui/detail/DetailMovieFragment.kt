package id.tpusk.moviegate.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.tpusk.moviegate.R
import id.tpusk.moviegate.databinding.FragmentDetailMovieBinding

class DetailMovieFragment(private val id: String) : Fragment() {

    private val detailMovieFragmentBinding by lazy { FragmentDetailMovieBinding.inflate(layoutInflater) }
    private val viewModel: DetailFilmViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return detailMovieFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            viewModel.setSelectedMovie(id)
            val movie = viewModel.getMovie()
            with(detailMovieFragmentBinding) {
                movie.let {
                    tvTitle.text = it.title
                    Glide.with(this@DetailMovieFragment)
                        .load(it.posterPath)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                        .error(R.drawable.ic_error)
                        .into(imgPoster)
                    tvRelease.text = it.release
                    tvGenre.text = it.genre
                    tvBudget.text = it.budget
                    tvRevenue.text = it.revenue
                    tvOverview.text = it.overview
                }

            }
        }
    }
}
