package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.model.Beer;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by davidthacker on 5/23/15.
 */
public interface FlyingSaucerService {

    @GET("/beers/{id}")
    Beer getBeerFromId(@Path("{id}") String id);

}
