package com.example.p06_food;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title, description;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            // aslo set in menifest
        }

        //imageView = findViewById(R.id.another_imageView);
        title = findViewById(R.id.titleText);
        imageView = findViewById(R.id.image1);
        description = findViewById(R.id.descriptionText);

        if (position == 0) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();

            String aTitle = intent.getStringExtra("title");
            //String aDescription = intent.getStringExtra("description");

            // imageView.setImageResource(pic);
            title.setText(aTitle);

            switch (aTitle) {
                case "Miso Soup":
                    imageView.setImageResource(R.drawable.miso_soup);
                    description.setText("In a medium saucepan over medium-high heat, combine dashi granules and water; bring to a boil. Reduce heat to medium, and whisk in the miso paste. Stir in tofu. Separate the layers of the green onions, and add them to the soup. Simmer gently for 2 to 3 minutes before serving.");
                    break;
                case "Mochi":
                    imageView.setImageResource(R.drawable.mochi);
                    description.setText("Wrap red bean paste in aluminum foil and place in the freezer for at least 3 hours. Mix sweet rice flour and green tea powder thoroughly in a microwave-safe glass or ceramic bowl. Stir in water, then sugar. Mix until smooth. Cover bowl with plastic wrap.\n" +
                            "\n Cook the rice flour mixture in the microwave for 3 minutes and 30 seconds. Meanwhile, remove red bean paste from the freezer and divide paste into 8 equal balls. Set aside. Stir rice flour mixture and heat for another 15 to 30 seconds.");
                    break;
                case "Salmon Teriyaki":
                    imageView.setImageResource(R.drawable.salmon_teriyaki);
                    description.setText("Mix sesame oil, lemon juice, soy sauce, brown sugar, sesame seeds, ground mustard, ginger, and garlic powder in a small saucepan over low heat. Bring to a simmer, stirring until sugar has dissolved. Set aside 1/2 cup of marinade for basting.\n" +
                            "\n Pour remaining marinade into a resealable plastic bag and place salmon into the marinade. Squeeze air out of the bag, seal, and marinate the salmon steaks for at least 1 hour (2 hours for better flavor). Drain and discard used marinade.");
            }
            // description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }

        if (position == 1) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            int picture = bundle.getInt("image");
            imageView.setImageResource(pic);
            title.setText(aTitle);
            imageView.setImageResource(picture);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }

        if (position == 2) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }

        if (position == 3) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }

        if (position == 4) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }

    }


}
