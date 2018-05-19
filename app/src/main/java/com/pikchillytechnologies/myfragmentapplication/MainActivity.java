package com.pikchillytechnologies.myfragmentapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutFragment;
    Button packagesFragment;
    Button testsFragments;

    ViewPager viewPager;
    int images[] = {R.drawable.sliderimage_1, R.drawable.sliderimage_2, R.drawable.sliderimage_3, R.drawable.sliderimage_4};
    MyCustomPagerAdapter myCustomPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager)findViewById(R.id.viewPager);

        myCustomPagerAdapter = new MyCustomPagerAdapter(MainActivity.this, images);
        viewPager.setAdapter(myCustomPagerAdapter);

        // get the reference of buttons
        aboutFragment = findViewById(R.id.about_button);
        packagesFragment = findViewById(R.id.packages_button);
        testsFragments = findViewById(R.id.tests_button);

        // perform setOnClickListener on About buttons
        aboutFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aboutFragment.setBackgroundColor(Color.BLUE);
                packagesFragment.setBackgroundColor(Color.WHITE);
                testsFragments.setBackgroundColor(Color.WHITE);

                // load About Fragment
                loadFragment(new AboutFragment());
            }
        });


        // perform setOnClickListener on Packages buttons
        packagesFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                packagesFragment.setBackgroundColor(Color.BLUE);
                aboutFragment.setBackgroundColor(Color.WHITE);
                testsFragments.setBackgroundColor(Color.WHITE);

                // load Packages Fragment
                loadFragment(new PackagesFragment());
            }
        });

        // perform setOnClickListener on Tests buttons
        testsFragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                testsFragments.setBackgroundColor(Color.BLUE);
                packagesFragment.setBackgroundColor(Color.WHITE);
                aboutFragment.setBackgroundColor(Color.WHITE);

                // load Tests Fragment
                loadFragment(new TestsFragment());
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        // Create Fragment Manager
        FragmentManager fm = getFragmentManager();

        // Create FragmentTransaction
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        // Replace the FrameLayout with new fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();

    }



}
