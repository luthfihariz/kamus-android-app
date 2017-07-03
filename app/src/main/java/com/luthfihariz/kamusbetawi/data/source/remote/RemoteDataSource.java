package com.luthfihariz.kamusbetawi.data.source.remote;

import com.luthfihariz.kamusbetawi.data.Dictionary;
import com.luthfihariz.kamusbetawi.data.source.DictionaryDataSource;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by luthfihariz on 7/3/17.
 */

public class RemoteDataSource implements DictionaryDataSource {
    @Override
    public Observable<List<Dictionary>> getDictionaries() {
        return null;
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
