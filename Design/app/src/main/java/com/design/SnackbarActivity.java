package com.design;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by H on 2017/5/9.
 * Description:
 */

public class SnackbarActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        findViewById(R.id.Snackbar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello Snackbar out", Snackbar.LENGTH_LONG).setActionTextColor(Color.parseColor("#acc900")).setAction("Button", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(SnackbarActivity.this, "Toast comes out", Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });
    }
}
