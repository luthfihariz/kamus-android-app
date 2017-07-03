package com.luthfihariz.kamusbetawi.data.source.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.luthfihariz.kamusbetawi.data.Dictionary;

import org.reactivestreams.Publisher;

import java.util.List;


/**
 * Created by luthfihariz on 6/12/17.
 */

@Dao
public interface DictionaryDao {
    @Query("SELECT * FROM dictionary")
    Publisher<List<Dictionary>> getDictionaries();

    @Query("SELECT * FROM dictionary WHERE terms LIKE :keyword")
    Publisher<List<Dictionary>> getDictionary(String keyword);
}
