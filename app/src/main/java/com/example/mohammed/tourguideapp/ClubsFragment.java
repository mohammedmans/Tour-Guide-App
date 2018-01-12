package com.example.mohammed.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ClubsFragment extends Fragment {

    public ClubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.activity_place_list, container, false);

        ArrayList<Place>places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.alhlyName),R.drawable.alahly,getString(R.string.alhlyDesc),getString(R.string.alahlyLocation)));
        places.add(new Place(getString(R.string.elzamalekName),R.drawable.elzamalek,getString(R.string.elzamalekDesc),getString(R.string.elzamalekLocation)));


        placeAdapter adapter = new placeAdapter(getActivity(),places);

        ListView listView = (ListView)rootview.findViewById(R.id.list);
        listView.setAdapter(adapter );

        return rootview;
    }
}