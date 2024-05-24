package com.example.api_app.Network;


import com.example.api_app.Model.Movie;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiMovie {

    // Describes the operations that are requested from the API
   @GET("movies/list.php")
   Call<List<Movie>> getMovies();
}

