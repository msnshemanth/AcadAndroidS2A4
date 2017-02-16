package com.example.hemanth.s2assign4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.R.attr.onClick;
import static android.R.attr.visibility;
import static com.example.hemanth.s2assign4.R.id.button;

public class MainActivity extends AppCompatActivity {

    ImageView sampleimage;
    Button show,hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleimage = (ImageView)findViewById(R.id.imageView);
        hide = (Button)findViewById(button);
        show = (Button)findViewById(button);

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    sampleimage.setVisibility(View.INVISIBLE);
                    show.setText("Show");
                show.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sampleimage.setVisibility(View.VISIBLE);
                        hide.setText("Hide");
                    }
                });

            }
        });

    }
}
