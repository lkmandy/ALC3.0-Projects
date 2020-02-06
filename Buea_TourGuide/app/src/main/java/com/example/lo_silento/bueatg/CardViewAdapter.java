package com.example.lo_silento.bueatg;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.Integer.valueOf;

public class CardViewAdapter extends ArrayAdapter<BueaTour> {

    private int mColorResourceId;

    public CardViewAdapter(Context context, ArrayList<BueaTour> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaurants_touristic_site_view, parent, false);
        }

        BueaTour currentTour = getItem(position);

        // Name text view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_card);
        assert currentTour != null;
        nameTextView.setText(currentTour.getName());

        // Hours text view
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.hours);
        hoursTextView.setText(currentTour.getHours());

        //Ratings text view
        TextView ratingsTextView = (TextView) listItemView.findViewById(R.id.ratings);
        ratingsTextView.setText(currentTour.getTargetGroupId());

        // Image  view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_card);
        if (currentTour.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentTour.getImage());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.card_view);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}