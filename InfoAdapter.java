package com.example.android.atourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter {
    public InfoAdapter(Context context, ArrayList<Info> infos) {
        super(context, 0, infos);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        final Info currentInfo = (Info) getItem(position);
        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentInfo.getPlaceName());

        TextView stars = listItemView.findViewById(R.id.stars);
        stars.setText(currentInfo.getmStarsTextView());


        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentInfo.hasImage) {
            imageView.setImageResource(currentInfo.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);

        }
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriIntint = Uri.parse("geo:" + currentInfo.getLatitude() + "," + currentInfo.getLongitude() + "?q=" + currentInfo.getPlaceName());
                Intent mapIntint = new Intent(Intent.ACTION_VIEW, uriIntint);
                mapIntint.setPackage("com.google.android.apps.maps");
                if (mapIntint.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(mapIntint);
                }
            }
        });
        return listItemView;
    }
}
