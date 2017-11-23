package com.example.android.miwok;

/**
 * Created by brand on 11/12/2017.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation= defaultTranslation;
        this.mMiwokTranslation= miwokTranslation;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId ) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){
        return this.mDefaultTranslation;
    }


    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }

    public int getImageResourceId() {
        return this.mImageResourceId;
    }
}
