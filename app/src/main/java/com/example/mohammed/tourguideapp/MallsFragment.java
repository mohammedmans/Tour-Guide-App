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


public class MallsFragment extends Fragment {

    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.activity_place_list, container, false);

        ArrayList<Place>places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.citystarName),R.drawable.citystarsmall,getString(R.string.citystarDesc),getString(R.string.citystarLocation)));
        places.add(new Place(getString(R.string.cairofestName),R.drawable.cairofestival,getString(R.string.cairofestDesc),getString(R.string.cairofestLocation)));


        placeAdapter adapter = new placeAdapter(getActivity(),places);

        ListView listView = (ListView)rootview.findViewById(R.id.list);
        listView.setAdapter(adapter );

        return rootview;
    }
}