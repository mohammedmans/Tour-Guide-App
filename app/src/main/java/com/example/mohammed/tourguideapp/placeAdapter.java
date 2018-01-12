package com.example.mohammed.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.LayoutInflater.from;

/**
 * Created by Mohammed on 1/10/2018.
 */

public class placeAdapter extends ArrayAdapter<Place> {
    private Context mContext;
    public placeAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
        mContext = context;
    }


    @Override
    // existing views that can be re-use
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_item, parent, false);
        }
        final Place currentPlace = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_image);
        imageView.setImageResource(currentPlace.getmImageResourceID());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.place_desc);
        descTextView.setText(currentPlace.getDesc());

        TextView direcTextView = (TextView)listItemView.findViewById(R.id.place_name);
        direcTextView.setText(currentPlace.getName());

        Button button = (Button) listItemView.findViewById(R.id.place_direc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentPlace.getLocation()));
                mContext.startActivities(new Intent[]{intent});

            }
        });

        return listItemView;
    }

}
