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
import id.tpusk.moviegate.databinding.FragmentDetailTvShowBinding

class DetailTvShowFragment(private val id: String) : Fragment() {

    private val detailTvShowFragmentBinding by lazy { FragmentDetailTvShowBinding.inflate(layoutInflater) }
    private val viewModel: DetailFilmViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return detailTvShowFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            viewModel.setSelectedTvShow(id)
            val tvShow = viewModel.getTvShow()
            with(detailTvShowFragmentBinding) {
                tvShow.let {
                    tvTitle.text = it.title
                    tvStatus.text = it.status
                    Glide.with(this@DetailTvShowFragment)
                        .load(it.posterPath)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                        .error(R.drawable.ic_error)
                        .into(imgPoster)
                    Glide.with(this@DetailTvShowFragment)
                        .load(it.networkLabelPath)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                        .error(R.drawable.ic_error)
                        .into(imgNetwork)
                    tvGenre.text = it.genre
                    tvOverview.text = it.overview
                }

            }
        }
    }

}