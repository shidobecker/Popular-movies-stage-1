package com.example.android.popularmoviesstage1.api;

import com.example.android.popularmoviesstage1.model.Movie;
import com.example.android.popularmoviesstage1.model.MoviesResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MoviesApi {

    String MOVIES_BASE_PATH = "https://api.themoviedb.org/3/movie/";

    @GET("top_rated")
    Call<MoviesResult> getTopRatedMovies();

    @GET("popular")
    Call<MoviesResult> getPopularMovies();

    @GET("{id}")
    Call<Movie> getMovieById(@Path("id") int id);

}
