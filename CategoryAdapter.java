package com.example.android.atourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HotelFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new ShopFragment();
            case 3:
                return new SpotFragment();

            default:
                return new HotelFragment();
        }


    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab_title_1);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_title_2);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_title_3);
        } else {
            return mContext.getString(R.string.tab_title_4);
        }
    }
}
