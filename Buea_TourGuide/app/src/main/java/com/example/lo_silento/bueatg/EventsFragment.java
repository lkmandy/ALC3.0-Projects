package com.example.lo_silento.bueatg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    public EventsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // list of tours
        final ArrayList<BueaTour> tours = new ArrayList<BueaTour>();

        tours.add(new BueaTour(R.string.dev_fest, R.string.techies, R.string.yearly,
                R.drawable.ic_action_location));

        tours.add(new BueaTour(R.string.griot_nights, R.string.general_public, R.string.monthly,
                R.drawable.ic_action_location));

        tours.add(new BueaTour(R.string.google_io, R.string.techies, R.string.yearly,
                R.drawable.ic_action_location));

        tours.add(new BueaTour(R.string.iwd_buea, R.string.females, R.string.yearly,
                R.drawable.ic_action_location));

        tours.add(new BueaTour(R.string.iwd_buea, R.string.females, R.string.yearly,
                R.drawable.ic_action_location));

        BueaTourAdapter adapter = new BueaTourAdapter(getActivity(), tours, R.color.berge);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}