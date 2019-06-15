package com.example.project1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class VPadapter extends FragmentPagerAdapter {


    public VPadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        DemoFragment demoFragment = new DemoFragment();
        i = i+1;
        Bundle bundle = new Bundle();
        bundle.putString("message","Fragment :"+1);
        demoFragment.setArguments(bundle);
        return demoFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return "Tab"+position;
    }
}
