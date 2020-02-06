package com.example.lo_silento.bueatg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TouristicSitesFragment extends Fragment {

    public TouristicSitesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // list of tours
        final ArrayList<BueaTour> tours = new ArrayList<BueaTour>();

        tours.add(new BueaTour(R.string.mt_cameroon, R.string.free, R.string.tourists,
                R.drawable.mtcamer));
        tours.add(new BueaTour(R.string.reunification_monument, R.string.paid, R.string.family,
                R.drawable.monument));

        tours.add(new BueaTour(R.string.tole_tea, R.string.general_public, R.string.free,
                R.drawable.tole_tea));

        tours.add(new BueaTour(R.string.sasse_shrine, R.string.free, R.string.general_public,
                R.drawable.sasse_shrine));
        tours.add(new BueaTour(R.string.parliamentarian_lodge, R.string.man_know_man, R.string.gov_officials,
                R.drawable.parlia));

        CardViewAdapter adapter = new CardViewAdapter(getActivity(), tours, R.color.berge);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}