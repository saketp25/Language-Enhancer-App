package com.example.languageenhancer;

public class Word {
    
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId=-1;

    public Word(String defaultTranslation , String miwokTranslation , int imageResourceId ){

        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;

    }

    public Word(String defaultTranslation , String miwokTranslation ){

        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;

    }

    public String getMiwokTranslation(){

        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }

    public int getImageResourceId(){

        return mImageResourceId;
    }


    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}