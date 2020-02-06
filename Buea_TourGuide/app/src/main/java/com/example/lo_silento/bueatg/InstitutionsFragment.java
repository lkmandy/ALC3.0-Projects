package com.example.lo_silento.bueatg;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class InstitutionsFragment extends Fragment {

    public InstitutionsFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // list of tours
        final ArrayList<BueaTour> tours = new ArrayList<BueaTour>();

        tours.add(new BueaTour(R.string.cuib, R.string.medium, R.string.four,
                R.drawable.ic_action_location));

        tours.add(new BueaTour(R.string.university_of_buea, R.string.high, R.string.five,
                R.drawable.ic_action_location));

        tours.add(new BueaTour(R.string.landmark, R.string.low, R.string.three,
                R.drawable.ic_action_location));

        tours.add(new BueaTour(R.string.biaka, R.string.low, R.string.three,
                R.drawable.ic_action_location));

        tours.add(new BueaTour(R.string.oxford, R.string.medium, R.string.four,
                R.drawable.ic_action_location));

        BueaTourAdapter adapter = new BueaTourAdapter(getActivity(), tours, R.color.berge);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}