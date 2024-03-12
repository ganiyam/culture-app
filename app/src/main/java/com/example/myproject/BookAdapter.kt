package com.example.myproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(val context: Context, val bookList: MutableList<Book>): RecyclerView.Adapter<BookAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val photo: ImageView = itemView.findViewById(R.id.bookImage)
        val title: TextView = itemView.findViewById(R.id.bookTitle)
        val author: TextView = itemView.findViewById(R.id.bookAuthor)
    }

    //아이템뷰 객체 성생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.book_item_recyclerview, parent, false)
        return MyViewHolder(itemView)
    }
    //아이템뷰에 데이터 결합하기
    override fun onBindViewHolder(holder: BookAdapter.MyViewHolder, position: Int) {
        val book = bookList.get(position)
        holder.photo.setImageResource(book.photo)
        holder.title.text = book.title
        holder.author.text= book.author
    }
    //데이터 갯수 반환
    override fun getItemCount() = bookList.size
}