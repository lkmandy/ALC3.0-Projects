package com.example.lo_silento.bueatg;

/* Custom Buea Tour Guide Class */
public class BueaTour {

    // Tour Guide variables
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mNameId;
    private int mTargetGroupId;
    private int mHours;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /* Constructor with four parameters */
    public BueaTour(int name, int targetGroup, int hours, int image) {
        mNameId = name;
        mTargetGroupId = targetGroup;
        mHours = hours;
        mImageResourceId = image;
    }

    public int getName() {
        return mNameId;
    }

    public int getTargetGroupId() {
        return mTargetGroupId;
    }

    public int getHours() {
        return mHours;
    }

    public int getImage() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}