package com.design;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by H on 2017/5/9.
 * Description:
 */

public class NavigationViewActivity extends AppCompatActivity {

    private NavigationView mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationview);
        mDrawerLayout = (NavigationView) findViewById(R.id.nv_main_navigation);
        mDrawerLayout.setNavigationItemSelectedListener(null);
    }
//    private void setupDrawerContent(NavigationView navigationView) {
//        navigationView.setNavigationItemSelectedListener(
//                new NavigationView.OnNavigationItemSelectedListener() {
//                    @Override
//                    public boolean onNavigationItemSelected(MenuItem menuItem) {
//                        menuItem.setChecked(true);
//                        mDrawerLayout.closeDrawers();
//                        return true;
//                    }
//                });
//    }
}
