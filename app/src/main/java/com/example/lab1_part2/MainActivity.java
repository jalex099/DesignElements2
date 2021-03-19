package com.example.lab1_part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.Resources;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //clip the image in the ImageView
        ImageView imageview = (ImageView) findViewById(R.id.image);
        Drawable drawable = imageview.getBackground();
        if (drawable instanceof ClipDrawable) {
            ((ClipDrawable)drawable).setLevel(drawable.getLevel() + 3500);
        }
        Resources res = getResources();
        Drawable shape = ResourcesCompat.getDrawable(res, R.drawable.shape, getTheme());

        TextView tv = (TextView)findViewById(R.id.shapeText);
        tv.setBackground(shape);
    }

}