package com.example.myproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ShowAdapter(adapter: FragmentActivity) : FragmentStateAdapter(adapter) {
    private  val shows = listOf<Int>(R.drawable.show1,R.drawable.show2, R.drawable.show3
    , R.drawable.show4, R.drawable.show5, R.drawable.show6, R.drawable.show7)
    private val titles = listOf<String>("렛미플라이", "키다리 아저씨", "드라이 플라워", "모딜리아니", "에곤 실레", "비더슈탄트", "컴프롬어웨이")
    private val descs = listOf<String>("2023.09.26~2023.12.10", "2023.12.05~2024.02.25",
        "2023.11.07~2024.01.07", "2023.12.09~2024.03.10", "2023.12.09~2024.03.10", "2023.09.12~2023.11.26", "2023.11.28~2024.02.18")
    private val address = listOf<String>("예스24스테이지 1관","대학로 드림아트센터 1관","대학로 드림아트센터 3관","서경대학교 공연예술센터 스콘2관",
        "서경대학교 공연예술센터 스콘2관","대학로 드림아트센터 1관","광림아트센터 BBCH홀")

    override fun getItemCount() = shows.size

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ShowFragment.newInstance(shows[0], titles[0], descs[0], address[0])
            1 -> ShowFragment.newInstance(shows[1], titles[1], descs[1],address[1])
            2 -> ShowFragment.newInstance(shows[2], titles[2], descs[2],address[2])
            3 -> ShowFragment.newInstance(shows[3], titles[3], descs[3],address[3])
            4 -> ShowFragment.newInstance(shows[4], titles[4], descs[4],address[4])
            5 -> ShowFragment.newInstance(shows[5], titles[5], descs[5],address[5])
            6 -> ShowFragment.newInstance(shows[6], titles[6], descs[6],address[6])
            else -> ShowFragment.newInstance(shows[0], titles[0], descs[0],address[0])
        }
    }
}




