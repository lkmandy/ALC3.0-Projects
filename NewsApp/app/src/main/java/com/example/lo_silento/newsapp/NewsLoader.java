package com.example.lo_silento.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<NewsCustom>> {
    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<NewsCustom> loadInBackground() {
        if(mUrl == null) {
            return null;
        }
        return Query.fetchNewsData(mUrl);
    }
}