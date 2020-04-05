package com.ebri.kuncikamar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebri.kuncikamar.FragmentMain.*
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_fragment_main.*
import androidx.viewpager.widget.ViewPager
import android.graphics.PorterDuff
import androidx.core.content.ContextCompat



class FragmentMainActivity : AppCompatActivity() {


    private val tabIcons = intArrayOf(
        R.drawable.ic_home,
        R.drawable.ic_whislist,
        R.drawable.ic_transaction,
        R.drawable.ic_inbox,
        R.drawable.ic_profile)

    lateinit var tabLayout: TabLayout
    lateinit var viewpager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_main)
        

        viewpager = findViewById(R.id.viewpager_main)
        setupViewPager(viewpager_main)
        tabLayout = findViewById(R.id.tabs_main)
        tabLayout.setupWithViewPager(viewpager_main)
        setupTabIcons()
        tabLayout.setOnTabSelectedListener(
            object : TabLayout.ViewPagerOnTabSelectedListener(viewpager_main) {

                override fun onTabSelected(tab: TabLayout.Tab) {
                    super.onTabSelected(tab)
                    val tabIconColor = ContextCompat.getColor(this@FragmentMainActivity, R.color.colorPrimary)
                    tab.icon!!.setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN)
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    super.onTabUnselected(tab)
                    val tabIconColor = ContextCompat.getColor(this@FragmentMainActivity, R.color.colorPrimaryDarker)
                    tab!!.icon!!.setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN)
                }

            }
        )
    }

    private fun setupTabIcons() {
        tabLayout.getTabAt(0)!!.setIcon(tabIcons[0])
        tabLayout.getTabAt(1)!!.setIcon(tabIcons[1])
        tabLayout.getTabAt(2)!!.setIcon(tabIcons[2])
        tabLayout.getTabAt(3)!!.setIcon(tabIcons[3])
        tabLayout.getTabAt(4)!!.setIcon(tabIcons[4])
    }


    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = MyPagerAdapter(supportFragmentManager)
        adapter.addFragment(LandingFragment.newInstance(), "")
        adapter.addFragment(TransactionFragment(), "")
        adapter.addFragment(InboxFragment(), "")
        adapter.addFragment(ProfileFragment(), "")
        adapter.addFragment(WhislistFragment.newInstance(), "")
        viewPager.adapter = adapter
    }
}

