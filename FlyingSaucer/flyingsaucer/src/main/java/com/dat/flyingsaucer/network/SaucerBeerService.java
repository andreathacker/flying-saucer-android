package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.model.Beer;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by davidthacker on 5/23/15.
 */
public interface SaucerBeerService<T extends Beer> extends BaseSaucerService {

    @GET(BEERS_pID)
    T getBeerFromId(@Path(PARAM_BEER_ID) String beerId);

}
