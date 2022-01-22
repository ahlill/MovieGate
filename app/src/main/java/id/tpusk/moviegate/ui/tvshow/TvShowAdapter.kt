package id.tpusk.moviegate.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.placeholderOf
import id.tpusk.moviegate.R
import id.tpusk.moviegate.data.source.local.entity.TvShowEntity
import id.tpusk.moviegate.databinding.ItemsTvshowBinding
import id.tpusk.moviegate.ui.detail.DetailFilmActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private var listTvShow = ArrayList<TvShowEntity>()

    fun setTvShowActivity(tvShowDetail: List<TvShowEntity>?) {
        if (tvShowDetail == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvShowDetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvShowBinding = ItemsTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = listTvShow[position]
        holder.bind(tvShow)

        holder.itemView.setOnClickListener {
            val i = Intent(holder.itemView.context, DetailFilmActivity::class.java)
            i.putExtra(DetailFilmActivity.NAME_ID, tvShow.tvShowId)
            i.putExtra(DetailFilmActivity.NAME_TYPE, DetailFilmActivity.TYPE_TVSHOW)
            holder.itemView.context.startActivity(i)
        }
    }

    override fun getItemCount(): Int = listTvShow.size

    class TvShowViewHolder(private val binding: ItemsTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShowDetail: TvShowEntity) {
            with(binding) {
                tvTitleAdapter.text = tvShowDetail.title

                Glide.with(itemView.context)
                    .load(tvShowDetail.posterPath)
                    .apply(placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(imgPoster)
            }

        }

    }
}