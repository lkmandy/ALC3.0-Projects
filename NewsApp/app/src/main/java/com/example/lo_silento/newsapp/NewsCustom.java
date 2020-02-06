package com.example.lo_silento.newsapp;

public class NewsCustom {

    // Title of the news
    private String mTitle;

    // Section of the  news
    private String mSection;

    // Date in which the news article was created
    private String mDate;

    // Author of the  news
    private String mAuthor;

    // Website URL of the news
    private String mUrl;

    // constructor
    public NewsCustom(String mTitle, String mSection, String mAuthor, String mDate, String mUrl) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mDate = mDate;
        this.mSection = mSection;
        this.mUrl = mUrl;
    }



    public String getmTitle() {
        return mTitle;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmUrl() {
        return mUrl;
    }
}