package com.example.mohammed.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mohammed on 1/10/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new AboutFragment();
        else if (position == 1)
            return new ClubsFragment();
        else if (position == 2)
            return new ResturantsFragment();
        else
            return new MallsFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "About";
        else if (position == 1)
            return "Clubs";
        else if (position == 2)
            return "Resturants";
        else
            return "Malls";
    }
}
