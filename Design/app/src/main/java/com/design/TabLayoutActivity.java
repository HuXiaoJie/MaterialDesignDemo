package com.design;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H on 2017/5/9.
 * Description:
 */

public class TabLayoutActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<String> mListTitle = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
        mTabLayout = (TabLayout) findViewById(R.id.tablayout);
        mListTitle.add("tab1");
        mListTitle.add("tab2");
        mListTitle.add("tab2");

        mTabLayout.addTab(mTabLayout.newTab().setText(mListTitle.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mListTitle.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mListTitle.get(2)));

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        // 设置ViewPager的数据等
        setupViewPager();
        mTabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager() {
        mViewPager.setAdapter(null);
        List<Fragment> list = new ArrayList<>();
        list.add(new TabFragment());
        list.add(new TabFragment());
        list.add(new TabFragment());
        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), list, mListTitle));
    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> list_fragment;                         //fragment列表
        private List<String> list_Title;                              //tab名的列表


        public ViewPagerAdapter(FragmentManager fm, List<Fragment> list_fragment, List<String> list_Title) {
            super(fm);
            this.list_fragment = list_fragment;
            this.list_Title = list_Title;
        }

        @Override
        public Fragment getItem(int position) {
            return list_fragment.get(position);
        }

        @Override
        public int getCount() {
            return list_Title.size();
        }

        //此方法用来显示tab上的名字
        @Override
        public CharSequence getPageTitle(int position) {

            return list_Title.get(position % list_Title.size());
        }
    }
}
