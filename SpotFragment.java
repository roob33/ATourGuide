package com.example.android.atourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SpotFragment extends Fragment {
    public SpotFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> infosSpot = new ArrayList<Info>();
        infosSpot.add(new Info(getString(R.string.spot1), getString(R.string.place_type), 21.5487586, 39.1701798, R.drawable.museum));
        infosSpot.add(new Info(getString(R.string.spot2), getString(R.string.place_type), 21.5487439, 39.2380325, R.drawable.albald));
        infosSpot.add(new Info(getString(R.string.spot3), getString(R.string.place_type), 21.5156556, 39.1472399, R.drawable.fountain));
        infosSpot.add(new Info(getString(R.string.spot4), getString(R.string.place_type), 21.5487147, 39.2380327, R.drawable.flag));
        infosSpot.add(new Info(getString(R.string.spot5), getString(R.string.place_type), 21.4691404, 39.1976747, R.drawable.islamic_port));
        infosSpot.add(new Info(getString(R.string.spot6),getString(R.string.place_type2),21.5135508,39.1763201, R.drawable.hospital));

        InfoAdapter adapter = new InfoAdapter(getActivity(), infosSpot);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
