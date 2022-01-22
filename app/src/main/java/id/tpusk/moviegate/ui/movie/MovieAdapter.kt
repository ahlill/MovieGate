package id.tpusk.moviegate.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.placeholderOf
import id.tpusk.moviegate.R
import id.tpusk.moviegate.data.source.local.entity.MovieEntity
import id.tpusk.moviegate.databinding.ItemsMovieBinding
import id.tpusk.moviegate.ui.detail.DetailFilmActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listMovie = ArrayList<MovieEntity>()

    fun setMovie(movieDetail: List<MovieEntity>){
        this.listMovie.clear()
        this.listMovie.addAll(movieDetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)

        holder.itemView.setOnClickListener {
            val i = Intent(holder.itemView.context, DetailFilmActivity::class.java)
            i.putExtra(DetailFilmActivity.NAME_TYPE, DetailFilmActivity.TYPE_MOVIE)
            i.putExtra(DetailFilmActivity.NAME_ID, movie.movieId)
            holder.itemView.context.startActivity(i)
        }
    }

    override fun getItemCount(): Int = listMovie.size

    class MovieViewHolder(private val binding: ItemsMovieBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(movieDetail: MovieEntity) {
            with(binding) {
                binding.tvTitleAdapter.text = movieDetail.title

                Glide.with(itemView.context)
                        .load(movieDetail.posterPath)
                        .apply(placeholderOf(R.drawable.ic_loading))
                        .error(R.drawable.ic_error)
                        .into(imgPoster)
            }
        }

    }

}