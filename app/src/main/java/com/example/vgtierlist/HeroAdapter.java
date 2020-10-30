package com.example.vgtierlist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

public class HeroAdapter extends ArrayAdapter<Hero> {

    private final int[] mHeroRatingIds;

    public HeroAdapter(Context context, Hero[] heroes, int[] heroRatingIds) {
        super(context, 0, heroes);
        mHeroRatingIds = heroRatingIds;
    }

    @Override
    @NotNull
    public View getView(int position, View convertView, @NotNull final ViewGroup parent) {
        final Hero hero = getItem(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.main_list_item, parent, false);
        }

        // TODO: Uncomment code below to add hero image, name, attack type, role, and rating to front page
        TextView heroName = convertView.findViewById(R.id.name);
        TextView heroAttackType = convertView.findViewById(R.id.attack_type);
        TextView heroRole = convertView.findViewById(R.id.role);
        ImageView heroIcon = convertView.findViewById(R.id.icon);
        ImageView heroRating = convertView.findViewById(R.id.rating);
        //ImageView heroRating = convertView.findViewById(R.id.)

        heroName.setText(hero.getName());
        heroAttackType.setText(hero.getAttackType());
        heroRole.setText(hero.getRole());
        heroIcon.setImageResource(hero.getIconId());
        heroRating.setImageResource(mHeroRatingIds[position]);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent heroInfoPage = new Intent(getContext(), HeroInfoPageActivity.class);
                heroInfoPage.putExtra("hero_name", hero.getName());
                heroInfoPage.putExtra("hero_attack_type", hero.getAttackType());
                heroInfoPage.putExtra("hero_position", hero.getPosition());
                heroInfoPage.putExtra("hero_role", hero.getRole());
                heroInfoPage.putExtra("hero_portrait", hero.getPortraitId());
                heroInfoPage.putExtra("hero_description", hero.getDescriptionId());
                getContext().startActivity(heroInfoPage);

                if (getContext() instanceof Activity)
                {
                    ((Activity) getContext()).overridePendingTransition(0, R.anim.slideup);
                }
            }
        });

        return convertView;
    }
}
