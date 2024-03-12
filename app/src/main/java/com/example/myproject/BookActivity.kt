package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BookActivity : AppCompatActivity() {

    private var bookList: MutableList<Book> = mutableListOf()
    private lateinit var recyclerView: RecyclerView
    private var adapter: BookAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        recyclerView = findViewById(R.id.bk)

        //adapter
        adapter = BookAdapter(this, bookList)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter = adapter

        prepareBook()
    }
    private fun prepareBook(){
        val covers = intArrayOf(
            R.drawable.book1,
            R.drawable.book2,
            R.drawable.book3,
            R.drawable.book4,
            R.drawable.book5,
            R.drawable.book6,
            R.drawable.book7,
            R.drawable.book8,
            R.drawable.book9,
            R.drawable.book10)
        var a = Book(covers[0], "퓨처셀프", "벤저민 하디")
        bookList.add(a)
        a = Book(covers[1], "도시와 그 불확실한 벽", "무라카미 하루키")
        bookList.add(a)
        a = Book(covers[2], "시대예보:핵개인의 시대", "송길영")
        bookList.add(a)
        a = Book(covers[3], "더 그레이트 비트코인", "오태민")
        bookList.add(a)
        a = Book(covers[4], "아침 그리고 저녁", "욘 포세")
        bookList.add(a)
        a = Book(covers[5], "도둑맞은 집중력", "요한 하리")
        bookList.add(a)
        a = Book(covers[6], "김대리의 데일리 뜨개", "바늘이야기 김대리")
        bookList.add(a)
        a = Book(covers[7], "세이노의 가르침", "세이노")
        bookList.add(a)
        a = Book(covers[8], "전지적 푸바오 시점", "에버랜드 동물원")
        bookList.add(a)
        a = Book(covers[9], "마흔에 읽는 쇼펜하우어", "강용수")
        bookList.add(a)


        adapter?.notifyDataSetChanged()
    }

}