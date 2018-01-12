package com.example.mohammed.tourguideapp;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);

        CategoryAdapter categoryAdapter = new CategoryAdapter(getSupportFragmentManager());
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

//        viewPager.setCurrentItem(0,true);
//        viewPager.setCurrentItem(1,true);
//        viewPager.setCurrentItem(2,true);
//        viewPager.setCurrentItem(3,true);
//        viewPager.setOffscreenPageLimit(0);
//        viewPager.setOffscreenPageLimit(2);
//        viewPager.setOffscreenPageLimit(3);
//        viewPager.setOffscreenPageLimit(4);

    }


}
