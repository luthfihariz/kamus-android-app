package com.luthfihariz.kamusbetawi.data.source.remote;

import com.luthfihariz.kamusbetawi.data.Dictionary;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by luthfihariz on 7/3/17.
 */

public interface RetrofitEndpointService {

    @GET("/kamus/betawi")
    Observable<List<Dictionary>> getDictionaries();
}
