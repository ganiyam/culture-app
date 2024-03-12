package com.example.myproject

import Data
import MovieAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myproject.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieBinding
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var data: Data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //데이터 등록
        data = Data(
            mutableListOf("더 마블스", "소년들", "그대들은 어떻게 살 것인가", "30일", "뉴 노멀", "톡 투 미"),
            mutableListOf("액션", "드라마", "애니메이션", "코미디", "스릴러", "공포"),
            mutableListOf("2023.11.08.", "2023.11.01.", "2023.10.25.", "2023.10.03.", "2023.11.08.", "2023.11.01."),
            mutableListOf(R.drawable.movie1, R.drawable.movie2, R.drawable.movie3, R.drawable.movie4, R.drawable.movie5, R.drawable.movie6)
        )

        // 어댑터 등록
        movieAdapter = MovieAdapter(data)

        binding.mv.layoutManager = LinearLayoutManager(this)
        binding.mv.adapter = movieAdapter

        movieAdapter.notifyDataSetChanged()
    }

}
