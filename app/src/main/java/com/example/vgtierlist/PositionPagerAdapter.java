package com.example.vgtierlist;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PositionPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] heroPositions = {new TopFragment(), new MidFragment(),
            new BotFragment(), new CaptainFragment(), new JungleFragment()};
    private int positionCount = 5;
    private Context mContext;

    public PositionPagerAdapter(Context context, @NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return heroPositions[position];
    }

    @Override
    public int getCount() {
        return positionCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
        {
            return mContext.getString(R.string.category_top);
        }
        else if (position == 1)
        {
            return mContext.getString(R.string.category_mid);
        }
        else if (position == 2)
        {
            return mContext.getString(R.string.category_bot);
        }
        else if (position == 3)
        {
            return mContext.getString(R.string.category_captain);
        }
        else
        {
            return mContext.getString(R.string.category_jungle);
        }
    }
}
