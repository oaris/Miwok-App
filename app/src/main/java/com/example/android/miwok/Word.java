package com.example.android.miwok;

/**
 * Created by brand on 11/12/2017.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation= defaultTranslation;
        this.mMiwokTranslation= miwokTranslation;
    }

    public String getDefaultTranslation(){
        return this.mDefaultTranslation;
    }


    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }
}
