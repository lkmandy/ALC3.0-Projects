package com.example.lo_silento.bueatg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // list of tours
        final ArrayList<BueaTour> tours = new ArrayList<BueaTour>();

        tours.add(new BueaTour(R.string.iya, R.string.five, R.string.weekdays,
                R.drawable.iya));

        tours.add(new BueaTour(R.string.twist, R.string.five, R.string.weekends,
                R.drawable.twist));

        tours.add(new BueaTour(R.string.dolly_fast_food, R.string.four, R.string.half_day,
                R.drawable.dollyfastfood));

        tours.add(new BueaTour(R.string.oxford_guest_house, R.string.four, R.string.weekends,
                R.drawable.oxford));

        tours.add(new BueaTour(R.string.spark_land, R.string.three, R.string.weekdays,
                R.drawable.sparkland));

        CardViewAdapter adapter = new CardViewAdapter(getActivity(), tours, R.color.berge);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}