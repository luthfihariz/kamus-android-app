package com.luthfihariz.kamusbetawi.data.source.remote;

import android.content.Context;

import com.luthfihariz.kamusbetawi.data.Dictionary;
import com.luthfihariz.kamusbetawi.data.source.DictionaryDataSource;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by luthfihariz on 7/3/17.
 */

class RemoteDataSource implements DictionaryDataSource {

    private static RemoteDataSource sInstance;
    private RetrofitEndpointService mRetrofit;

    private RemoteDataSource(Context context) {
        mRetrofit = RetrofitHelper
                .getInstance(context.getApplicationContext())
                .provideRetrofit()
                .create(RetrofitEndpointService.class);
    }

    public static RemoteDataSource getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new RemoteDataSource(context);
        }
        return sInstance;
    }

    @Override
    public Observable<List<Dictionary>> getDictionaries() {
        return mRetrofit.getDictionaries();
    }

    @Override
    public Observable<List<Dictionary>> getDictionaries(String keyword) {
        return null;
    }

    @Override
    public Observable<Dictionary> getRandomDictionary() {
        return null;
    }
}
