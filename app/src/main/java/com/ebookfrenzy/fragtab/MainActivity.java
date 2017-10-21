package com.ebookfrenzy.fragtab;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import layout.FragmentOne;

public class MainActivity extends AppCompatActivity {

    FragmentTabHost tabHost;
    private static final String TAB1 = "tab1";
    private static final String TAB2 = "tab2";
    private static final String TAB3 = "tab3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (FragmentTabHost)findViewById(R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(),R.id.realtabcontent);
//        tabHost.appTab(TabHost.newTabSpec(TAB1).setIndicator("TAB1"), FragmentOne.class, null);
    }
}
