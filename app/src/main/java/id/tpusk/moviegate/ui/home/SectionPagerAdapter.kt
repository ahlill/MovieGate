package id.tpusk.moviegate.ui.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import id.tpusk.moviegate.R
import id.tpusk.moviegate.ui.movie.MovieFragment
import id.tpusk.moviegate.ui.tvshow.TvShowFragment

class SectionPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> MovieFragment()
            1 -> TvShowFragment()
            else -> Fragment()
        }


    override fun getPageTitle(position: Int): CharSequence = mContext.resources.getString(
        TAB_TITLES[position])

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.movie, R.string.serial_tv)
    }

}