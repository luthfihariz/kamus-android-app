package com.luthfihariz.kamusbetawi.data.source;

import com.luthfihariz.kamusbetawi.data.Dictionary;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by luthfihariz on 7/3/17.
 */

public interface DictionaryDataSource {

    Observable<List<Dictionary>> getDictionaries();

    Observable<List<Dictionary>> getDictionaries(String keyword);

    Observable<Dictionary> getRandomDictionary();
}
