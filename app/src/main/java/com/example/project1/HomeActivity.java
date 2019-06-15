package com.example.project1;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private VPadapter vPadapter;
    private TabLayout t;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        toolbar=findViewById(R.id.toolbar);
        setActionBar(toolbar);


        viewPager = findViewById(R.id.viewpager);

        vPadapter = new VPadapter(getSupportFragmentManager());
        viewPager.setAdapter(vPadapter);


        t=findViewById(R.id.tab);
        t.setupWithViewPager(viewPager);
    }

}
