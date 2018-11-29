package com.example.android.atourguide;


public class Info {
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mStarsTextView;
    private double mLatitude;
    private double mLongitude;
    private String mPlaceName;
    public boolean hasImage;
    private boolean isHasStarRating;


    public Info(String placeName, String starsTextView , double latitude , double longitude ) {
        mPlaceName = placeName;
        mLatitude = latitude;
        mLongitude = longitude;
        mStarsTextView = starsTextView;
        if (starsTextView.contains("★")) {
            isHasStarRating = true;
        }

    }

    public Info(String placeName, String starsTextView, double latitude , double longitude, int imageResourceId) {
        mPlaceName = placeName;
        mStarsTextView = starsTextView;
        mLatitude = latitude;
        mLongitude = longitude;
        mImageResourceId = imageResourceId;
        hasImage = true;

    }




    public String getmStarsTextView() {
        return mStarsTextView;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImage(int image){
       mImageResourceId = image;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }

    public boolean hasStarRating() {
        return isHasStarRating;

    }

    public void setHasStarRating(boolean hasStarRating) {
        isHasStarRating = hasStarRating;
    }
}
