package id.tpusk.moviegate.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.tpusk.moviegate.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private val activityHomeBinding by lazy { ActivityHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityHomeBinding.root)

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityHomeBinding.viewPager.adapter = sectionPagerAdapter
        activityHomeBinding.tabs.setupWithViewPager(activityHomeBinding.viewPager)
    }
}