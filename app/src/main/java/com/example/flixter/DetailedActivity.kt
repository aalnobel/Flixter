package com.example.flixter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RatingBar
import android.widget.TextView

private const val TAG = "DetailActivity"
class DetailedActivity : AppCompatActivity() {


    private  lateinit var  tvTitle: TextView
    private  lateinit var  tvOverview: TextView
    private  lateinit var  ratingBar: RatingBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)
        tvTitle = findViewById(R.id.tvTitle)
        tvOverview = findViewById(R.id.tvOverview)
        ratingBar = findViewById(R.id.rbVoteAverage)

//        val movie = intent.getParcelableExtra<Movie>(MOVIE_EXTRA) as Movie
//        Log.i(TAG, "Movie is $movie")
//        tvTitle.text = movie.title
//        tvOverview.text=movie.overview
//        ratingBar.rating = movie.voteAverage.toFloat()

    }
}


