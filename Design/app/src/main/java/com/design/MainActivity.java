package com.design;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textinputlayout:
                startActivity(new Intent(this, TextInputLayoutActivity.class));
                break;
            case R.id.Snackbar:
                startActivity(new Intent(this, SnackbarActivity.class));
                break;
            case R.id.FloatActionButton:
                startActivity(new Intent(this, FloatingActionButtonActivity.class));
                break;
            case R.id.TabLayout:
                startActivity(new Intent(this, TabLayoutActivity.class));
                break;
            case R.id.NavigationView:
                startActivity(new Intent(this, NavigationViewActivity.class));
                break;
            case R.id.AppBarLayout:
                startActivity(new Intent(this, AppBarLayoutActivity.class));
                break;
            case R.id.CoordinatorLayout:
                startActivity(new Intent(this, CoordinatorLayoutActivity.class));
                break;
            default:
                break;
        }
    }
}
