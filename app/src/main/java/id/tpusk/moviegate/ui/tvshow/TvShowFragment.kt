package id.tpusk.moviegate.ui.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import id.tpusk.moviegate.databinding.FragmentTvShowBinding
import id.tpusk.moviegate.viewmodel.ViewModelFactory

class TvShowFragment : Fragment() {

    private val fragmentTvShowBinding by lazy { FragmentTvShowBinding.inflate(layoutInflater) }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val factory = ViewModelFactory.getInstance()
            val tvShowViewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]
            val tvShowAdapter = TvShowAdapter()

            tvShowViewModel.getTvShow().observe(this, { tvShow ->
                tvShowAdapter.setTvShowActivity(tvShow)

                with(fragmentTvShowBinding.rvTvShow) {
                    layoutManager = GridLayoutManager(context, 2)
                    setHasFixedSize(true)
                    adapter = tvShowAdapter
                }
            })
        }
    }
}