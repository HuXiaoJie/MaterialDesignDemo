package com.design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by H on 2017/5/9.
 * Description:
 */

public class FloatingActionButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floatactionbutton);
        findViewById(R.id.floatactionbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FloatingActionButtonActivity.this, "和普通点击一样", Toast.LENGTH_LONG).show();
            }
        });
    }
}
