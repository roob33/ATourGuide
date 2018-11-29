package com.example.android.atourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list,container,false);

        final ArrayList<Info> infosShop = new ArrayList<Info>();
        infosShop.add(new Info(getString(R.string.shop1),getString(R.string.time_shop),21.5588811,39.1731367));
        infosShop.add(new Info(getString(R.string.shop2),getString(R.string.time_shop),21.5227144,39.2273241));
        infosShop.add(new Info(getString(R.string.shop3),getString(R.string.time_shop),21.6073263,39.1977984));
        infosShop.add(new Info(getString(R.string.shop4),getString(R.string.time_shop),21.5120558,39.1968098));
        infosShop.add(new Info(getString(R.string.shop5),getString(R.string.time_shop),21.6116354,39.1988283));
        infosShop.add(new Info(getString(R.string.shop6),getString(R.string.time_shop),21.5569874,39.1935544));
        infosShop.add(new Info(getString(R.string.shop7),getString(R.string.time_shop),21.5885792,39.1951991));
        infosShop.add(new Info(getString(R.string.shop8),getString(R.string.time_shop),21.5589622,39.2059677));
        infosShop.add(new Info(getString(R.string.shop9),getString(R.string.time_shop),21.5822672,39.1411501));
        infosShop.add(new Info(getString(R.string.shop10),getString(R.string.time_shop),21.5821633,39.1185115));

        InfoAdapter adapter = new InfoAdapter(getActivity(),infosShop);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
