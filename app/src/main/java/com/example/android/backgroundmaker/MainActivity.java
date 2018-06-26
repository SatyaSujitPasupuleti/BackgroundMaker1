package com.example.android.backgroundmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    }
    public void goGrey(View view)
    {
        Intent intent = new Intent(MainActivity.this,greyscale.class);
        startActivity(intent);

    }
    public void goBlur(View view)
    {
        Intent intent = new Intent(MainActivity.this, Blur.class);
        startActivity(intent);

    }
    public void goCon(View view)
    {
        Intent intent = new Intent(MainActivity.this, Contrast.class);
        startActivity(intent);

    }
    public void goBright(View view)
    {
        Intent intent = new Intent(MainActivity.this, Brightness.class);
        startActivity(intent);

    }


}
