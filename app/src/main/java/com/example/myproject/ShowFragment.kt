package com.example.myproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ShowFragment : Fragment() {

    private var show = 0
    private var title = ""
    private var desc = ""
    private var address= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_show, container, false)
        val imageView = view.findViewById<ImageView>(R.id.showimageView).setImageResource(show)
        val addressView = view.findViewById<TextView>(R.id.address).setText(address)
        val titleView = view.findViewById<TextView>(R.id.title).setText(title)
        val descView = view.findViewById<TextView>(R.id.desc).setText(desc)
        return view

    }

    companion object {
        fun newInstance(show: Int, title:String, desc: String, address: String) : ShowFragment{
            return ShowFragment().apply {
                this.show = show
                this.title = title
                this.desc =desc
                this.address = address
            }
        }
    }
}