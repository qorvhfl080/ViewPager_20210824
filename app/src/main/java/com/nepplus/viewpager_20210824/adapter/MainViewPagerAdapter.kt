package com.nepplus.viewpager_20210824.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager_20210824.fragment.BirthFragment
import com.nepplus.viewpager_20210824.fragment.HelloFragment
import com.nepplus.viewpager_20210824.fragment.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "인사"
        } else if (position == 1) {
            return "이름"
        } else {
            return "출생년도"
        }
    }

    override fun getCount(): Int {
//        뷰페이저가 총 몇장짜리인지 return
        return 3
    }

    override fun getItem(position: Int): Fragment {
//        각각의 position에 어떤 Fragment가 배치되어야 하는가
        if (position == 0) {
            return HelloFragment()
        } else if (position == 1) {
            return NameFragment()
        } else {
            return BirthFragment()
        }
    }
}