package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.dao.BaseDao;
import com.dat.flyingsaucer.data.dao.BeerDao;
import com.dat.flyingsaucer.data.dao.StoreBeerItemDao;
import com.dat.flyingsaucer.data.dao.StoreDao;
import com.dat.flyingsaucer.data.model.Beer;
import com.dat.flyingsaucer.data.model.Store;
import com.dat.flyingsaucer.data.model.StoreBeerItem;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by davidthacker on 5/23/15.
 */
public class SaucerRestAdapter {

    private SaucerService mService;

    public SaucerRestAdapter() {

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(SaucerService.BASE_ENDPOINT).build();
        mService = restAdapter.create(SaucerService.class);

    }

    public void getAllStores(final RestCallback<StoreDao> callback){

        mService.listStores(new Callback<List<Store>>() {
            @Override
            public void success(List<Store> stores, Response response) {

                if (stores != null) {

                    StoreDao dao = new StoreDao();
                    dao.modelList = stores;

                    callback.onSuccess(dao);

                }else{
                    callback.onSuccess(null);
                }
            }

            @Override
            public void failure(RetrofitError error) {
                callback.onError();
            }
        });
    }

    public void getStore(String storeSlug, final RestCallback<StoreDao> callback) {

        mService.getStore(storeSlug, new Callback<Store>() {
            @Override
            public void success(Store store, Response response) {

                if (store != null) {

                    StoreDao dao = new StoreDao();
                    dao.modelList.add(store);

                    callback.onSuccess(dao);

                } else {
                    callback.onSuccess(null);
                }
            }

            @Override
            public void failure(RetrofitError error) {
                callback.onError();
            }
        });
    }

    public void getBeer(String beerId, final RestCallback<BeerDao> callback) {

        mService.getBeer(beerId, new Callback<Beer>() {
            @Override
            public void success(Beer beer, Response response) {

                if (beer != null) {

                    BeerDao dao = new BeerDao();
                    dao.modelList.add(beer);

                    callback.onSuccess(dao);

                } else {
                    callback.onSuccess(null);
                }
            }

            @Override
            public void failure(RetrofitError error) {
                callback.onError();
            }
        });
    }

    public void getStoreBeerItems(String storeSlug, final RestCallback<StoreBeerItemDao> callback){

        mService.listStoreBeers(storeSlug, new Callback<List<StoreBeerItem>>() {

            @Override
            public void success(List<StoreBeerItem> storeBeerItems, Response response) {

                if (storeBeerItems != null) {

                    StoreBeerItemDao dao = new StoreBeerItemDao();
                    dao.modelList = storeBeerItems;

                    callback.onSuccess(dao);

                } else {
                    callback.onSuccess(null);
                }
            }

            @Override
            public void failure(RetrofitError error) {
                callback.onError();
            }

        });
    }


    public interface RestCallback<T extends BaseDao>{

        void onSuccess(T dao);
        void onError();

    }
}
