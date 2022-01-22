package id.tpusk.moviegate.ui.movie

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import id.tpusk.moviegate.databinding.FragmentMovieBinding
import id.tpusk.moviegate.viewmodel.ViewModelFactory

class MovieFragment : Fragment() {

    private val fragmentMovieBinding by lazy { FragmentMovieBinding.inflate(layoutInflater) }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance()
            val movieViewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
            val movieAdapter = MovieAdapter()


            movieViewModel.getMovie().observe(this, { movie ->
                Log.d(TAG, "MovieFragment: $movie ")

                movieAdapter.setMovie(movie)
                movieAdapter.notifyDataSetChanged()

                with(fragmentMovieBinding.rvMovie) {
                    layoutManager = GridLayoutManager(context, 2)
                    setHasFixedSize(true)
                    adapter = movieAdapter
                }
            })
        }
    }

}