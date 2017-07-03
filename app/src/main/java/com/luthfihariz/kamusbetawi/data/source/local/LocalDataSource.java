package com.luthfihariz.kamusbetawi.data.source.local;

import android.content.Context;

import com.luthfihariz.kamusbetawi.data.Dictionary;
import com.luthfihariz.kamusbetawi.data.source.DictionaryDataSource;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by luthfihariz on 5/20/17.
 */

public class LocalDataSource implements DictionaryDataSource {

    private static LocalDataSource sInstance = null;
    private AppRoomDatabase mRoomDb;

    private LocalDataSource(Context context) {
        mRoomDb = AppRoomDatabase.getInstance(context);
    }

    public static LocalDataSource getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new LocalDataSource(context.getApplicationContext());
        }
        return sInstance;
    }

    @Override
    public Observable<List<Dictionary>> getDictionaries() {
        return Observable.fromPublisher(mRoomDb.getSourceDao().getDictionaries());
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
