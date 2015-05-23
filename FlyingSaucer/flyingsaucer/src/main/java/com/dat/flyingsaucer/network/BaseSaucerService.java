package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.model.Beer;
import com.dat.flyingsaucer.data.model.Store;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by davidthacker on 5/23/15.
 */
public interface BaseSaucerService {

    String BASE_ENDPOINT = "https://saucer-api.herokuapp.com";

    String BEERS_pID = "/beers/{id}";
    String STORES = "/stores";
    String STORES_pID = "/stores/{slug}";
    String NEARBY = "/nearby";

    String PARAM_BEER_ID = "{id}";
    String PARAM_STORE_ID = "{slug}";

}
