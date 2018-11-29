package com.example.android.atourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list,container,false);

        final ArrayList<Info> infosFood = new ArrayList<Info>();
        infosFood.add(new Info(getString(R.string.food1),getString(R.string.time_food),21.5535712,39.1698617));
        infosFood.add(new Info(getString(R.string.food2),getString(R.string.time_food),21.5289338,39.1609168));
        infosFood.add(new Info(getString(R.string.food3),getString(R.string.time_food),21.55345,39.1692557));
        infosFood.add(new Info(getString(R.string.food4),getString(R.string.time_food),21.551218,39.1457887));
        infosFood.add(new Info(getString(R.string.food5),getString(R.string.time_food),21.5584242,39.1526905));
        infosFood.add(new Info(getString(R.string.food6),getString(R.string.time_food),21.5167451,39.1577836));
        infosFood.add(new Info(getString(R.string.food7),getString(R.string.time_food),21.5589758,39.1556567));
        infosFood.add(new Info(getString(R.string.food8),getString(R.string.time_food),21.5594618,39.1361073));
        infosFood.add(new Info(getString(R.string.food9),getString(R.string.time_food),21.5594618,39.1361073));
        infosFood.add(new Info(getString(R.string.food10),getString(R.string.time_food),21.548209,39.134175));

        InfoAdapter adapter = new InfoAdapter(getActivity(),infosFood);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
