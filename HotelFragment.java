package com.example.android.atourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list,container,false);

        final ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.holiday_inn_hotel),getString( R.string.stars5),21.6259844,39.1546075));
        infos.add(new Info(getString(R.string.sheraton_jeddah_hotel),getString(R.string.stars5),21.6148779,39.1132907));
        infos.add(new Info(getString(R.string.the_ritz_carlton_jeddah),getString(R.string.stars5),21.5244499,39.1526492));
        infos.add(new Info(getString(R.string.the_east),getString(R.string.stars4),21.6036407,39.1097157));
        infos.add(new Info(getString(R.string.hilton_jeddah),getString(R.string.stars5),21.6046213,39.1098529));
        infos.add(new Info(getString(R.string.park_haya),getString(R.string.stars5),21.5137934,39.1549364));
        infos.add(new Info(getString(R.string.radisson_blu),getString(R.string.stars4),21.5616417,39.1724327));
        infos.add(new Info(getString(R.string.sofitel_corniche_hotel),getString(R.string.stars5),21.6016835,39.1100147));
        infos.add(new Info(getString(R.string.moevenpick),getString(R.string.stars4),21.5880863,39.1061382));
        infos.add(new Info(getString(R.string.rosewood_hotel_jeddah),getString(R.string.stars5),21.576435,39.1105371));

          InfoAdapter adapter = new InfoAdapter(getActivity(), infos);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
