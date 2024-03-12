import android.icu.text.CaseMap.Title
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject.R
import com.example.myproject.databinding.MovieItemRecyclerviewBinding
//movie data
class Data (val movieList: MutableList<String>, val movieAuthor: MutableList<String>, val movieDate: MutableList<String>, val movieImage: MutableList<Int>)
class MovieAdapter(val data: Data) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
// 아이템뷰 객체생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = MovieItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }
//뷰 홀더에 데이터를 바인딩
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data.movieList[position],data.movieAuthor[position], data.movieDate[position], data.movieImage[position] )
    }
// 데이터 갯수 반환
    override fun getItemCount(): Int {
        return data.movieList.size
    }
// 각 아이템 뷰의 구성 요소를 담당하는 뷰 홀더
    class MyViewHolder(val binding: MovieItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(movieTitle: String, movieAuthor: String, movieDate: String, movieImage: Int){
            binding.mvItem.text = movieTitle
            binding.mvItem2.text = movieAuthor
            binding.mvItem3.text = movieDate
            binding.mvImage.setImageResource(movieImage)
        }
    }
}



