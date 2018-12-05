package com.example.vsvll.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        ratingBar = findViewById(R.id.ratingBar);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingBar.getRating();

                if(rating <=2)
                {
                    textView.setText("Rating: "+rating+"\n Is it that worse");
                }
                if(rating >2 && rating <4) {

                    textView.setText("Rating: "+rating+"\n We will try to be better!");

                }

                if(rating >=4) {

                    textView.setText("Rating: "+rating+"\n We will keep up the good work!");

                }

            }
        });
    }
}
