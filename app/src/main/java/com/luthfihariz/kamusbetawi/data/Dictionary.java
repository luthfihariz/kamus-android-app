package com.luthfihariz.kamusbetawi.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by luthfihariz on 7/3/17.
 */

@Entity(tableName = "dictionary")
public class Dictionary {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String terms;
    private String desc;

    public int getId() {
        return id;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
