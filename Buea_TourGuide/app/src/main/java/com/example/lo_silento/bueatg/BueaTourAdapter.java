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

/* Buea Tour Guide Adapter class */
public class BueaTourAdapter extends ArrayAdapter<BueaTour> {

    private int mColorResourceId;

    public BueaTourAdapter(Context context, ArrayList<BueaTour> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.events_institutions_view, parent, false);
        }
        BueaTour currentTour = getItem(position);

        /* name text view */
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        assert currentTour != null;
        nameTextView.setText(currentTour.getName());

        /* target group text view */
        TextView targetGroupTextView = (TextView) listItemView.findViewById(R.id.target_group);
        targetGroupTextView.setText(currentTour.getTargetGroupId());

        /* Frequency text view */
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.frequency);
        hoursTextView.setText(currentTour.getHours());

        /* image text view */
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentTour.hasImage()) {
            imageView.setImageResource(currentTour.getImage());
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}