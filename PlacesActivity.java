package com.example.android.atourguide;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;


public class PlacesActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CategoryAdapter categoryAdapter;
    private ViewPager viewPager;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);


        categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new CategoryAdapter(PlacesActivity.this,
                getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.local_hotel);
        tabLayout.getTabAt(1).setIcon(R.drawable.local_dining);
        tabLayout.getTabAt(2).setIcon(R.drawable.local_mall);
        tabLayout.getTabAt(3).setIcon(R.drawable.filter_hdr);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.iconTapColor), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        imageView = findViewById(R.id.icon_left);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlacesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
