package com.example.android.miwok;

/**
 * (@link Word) represents a vocabulary word
 * Contains default and miwok translation of word
 */

public class Word {

    //Miwok Translation
    private String mMiwokTranslation;
    //Default Translation
    private String mDefaultWorld;

    /**
     * Public Constructor
     * @param miwok_word
     * @param defaut_word
     */
    public Word(String miwok_word, String defaut_word) {
        mMiwokTranslation = miwok_word;
        mDefaultWorld = defaut_word;
    }

    /**
     * Get Method - Miwok Translation
     * @return String miwok word
     */
    public String getMiwokTransation() {
        return mMiwokTranslation;
    }

    /**
     * Get Method - Default Translation
     * @return String defaul translation
     */
    public String getDefaultTranslation() {
        return mDefaultWorld;
    }

}
