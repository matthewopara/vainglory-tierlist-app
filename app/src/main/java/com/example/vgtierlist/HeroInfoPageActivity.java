package com.example.vgtierlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HeroInfoPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_info_page);

        final Bundle bundle = getIntent().getExtras();

        TextView name = findViewById(R.id.hero_name);
        name.setText(bundle.getString("hero_name"));

        TextView attackType = findViewById(R.id.hero_attack_type);
        attackType.setText(bundle.getString("hero_attack_type"));

        TextView position = findViewById(R.id.hero_position);
        position.setText(bundle.getString("hero_position"));

        TextView role = findViewById(R.id.hero_role);
        role.setText(bundle.getString("hero_role"));

        ImageView image = findViewById(R.id.hero_portrait);
        image.setImageResource(bundle.getInt("hero_portrait"));
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maxPortrait = new Intent(getApplicationContext(), PortraitActivity.class);
                maxPortrait.putExtra("portrait", bundle.getInt("hero_portrait"));
                startActivity(maxPortrait);
            }
        });

        TextView description = findViewById(R.id.hero_description);
        description.setText(bundle.getInt("hero_description"));
    }
}
