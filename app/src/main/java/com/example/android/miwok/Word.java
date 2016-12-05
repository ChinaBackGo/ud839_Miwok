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
    //Private itn word image id
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //Private int raw resource id
    private int mRawResourceId;
    //Private static int final no image state
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Public Constructor
     * @param miwok_word
     * @param default_word
     * @param raw_resource_id
     */
    public Word(String miwok_word, String default_word, int raw_resource_id) {
        mMiwokTranslation = miwok_word;
        mDefaultWorld = default_word;
        mRawResourceId = raw_resource_id;
    }

    /**
     * Public Constructor
     * @param miwok_word
     * @param default_word
     * @param image_resource_id
     * @param raw_resource_id
     */
    public Word(String miwok_word, String default_word, int image_resource_id, int raw_resource_id) {
        mMiwokTranslation = miwok_word;
        mDefaultWorld = default_word;
        mImageResourceId = image_resource_id;
        mRawResourceId = raw_resource_id;
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

    /**
     * Get Method - Word Icon
     * @return Drawable
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get Method - raw resource id
     * @return int raw resource id
     */
    public int getRawResourceId() {
        return mRawResourceId;
    }

    /**
     * has Image - returns true/false if the word has an image resource id associated
     * @return has image
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultWorld='" + mDefaultWorld + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mRawResourceId=" + mRawResourceId +
                '}';
    }
}
