package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
 TabLayout tabLayout;
 TabItem mhome,mscience,mhealth,mtechnology,msports,mentertainment;
 PagerAdapter pagerAdapter;
 Toolbar mtoolbar;
String api = "0361c50e99e948a88d9063e25f462026";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
       mhome = findViewById(R.id.home);
       mscience = findViewById(R.id.science);
       mentertainment = findViewById(R.id.entertainment);
       mhealth = findViewById(R.id.health);
       mtechnology = findViewById(R.id.technology);
       msports = findViewById(R.id.sports);
        ViewPager viewPager = findViewById(R.id.fragmentcontainer);
        tabLayout = findViewById(R.id.include);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),6);
      viewPager.setAdapter(pagerAdapter);
      tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
          @Override
          public void onTabSelected(TabLayout.Tab tab) {
              viewPager.setCurrentItem(tab.getPosition());
              if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 || tab.getPosition()== 4 || tab.getPosition()== 5){
                  pagerAdapter.notifyDataSetChanged();
              }
          }

          @Override
          public void onTabUnselected(TabLayout.Tab tab) {

          }

          @Override
          public void onTabReselected(TabLayout.Tab tab) {

          }
      });
      viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
