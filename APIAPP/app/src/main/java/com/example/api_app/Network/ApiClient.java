package com.example.api_app.Network;


import android.telephony.gsm.GsmCellLocation;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Esta clase trae los datos de la api, y transforma el JSON
public class ApiClient {

    private static Retrofit retrofit;
    public static Retrofit getClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.20.25:80/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
