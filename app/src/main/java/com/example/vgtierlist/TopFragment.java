package com.example.vgtierlist;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hero_list, container, false);

        Hero[] heroes = {HeroBank.grumpjaw, HeroBank.yates, HeroBank.flicker, HeroBank.reza,
                HeroBank.ardan, HeroBank.anka, HeroBank.tony, HeroBank.catherine, HeroBank.lance,
                HeroBank.adagio, HeroBank.lorelai, HeroBank.vox, HeroBank.skye,
                HeroBank.blackfeather, HeroBank.joule};

        int[] heroRatingIds = {R.drawable.s_rank, R.drawable.s_rank, R.drawable.s_rank,
                R.drawable.s_rank, R.drawable.a_rank, R.drawable.a_rank, R.drawable.a_rank,
                R.drawable.a_rank, R.drawable.a_rank, R.drawable.b_rank, R.drawable.b_rank,
                R.drawable.b_rank, R.drawable.c_rank, R.drawable.c_rank, R.drawable.c_rank};

        HeroAdapter adapter = new HeroAdapter(getActivity(), heroes, heroRatingIds);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
