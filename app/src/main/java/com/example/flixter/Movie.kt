package com.example.flixter

import org.json.JSONArray

class Movie(
    val movieId: Int,
    private val posterPath: String,
    val title: String,
    val overview: String,
) {
    val posterImageUrl = "https://image.tmdb.org/t/p/w342/$posterPath"
    companion object{
        fun fromJsonArray(moviJsonArray: JSONArray): List<Movie> {
            val movies = mutableListOf<Movie>()
            for(i in 0 until moviJsonArray.length()){
                val movieJason = moviJsonArray.getJSONObject(i)
                movies.add(
                    Movie(
                        movieJason.getInt("id"),
                        movieJason.getString("poster_path"),
                        movieJason.getString("title"),
                        movieJason.getString("overview")

                    )
                )
            }
            return movies

        }
    }
}