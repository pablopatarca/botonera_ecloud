package com.beast.botoneraraissiguier;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.beast.botoneraraissiguier.R.layout.activity_main);



        getSupportFragmentManager().beginTransaction()
                .replace(com.beast.botoneraraissiguier.R.id.container, SplashFragment.newInstance())
                .commit();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getSupportFragmentManager().beginTransaction()
                        .replace(com.beast.botoneraraissiguier.R.id.container, MainFragment.newInstance())
                        .commit();
            }
        }, 2000);
    }
}
