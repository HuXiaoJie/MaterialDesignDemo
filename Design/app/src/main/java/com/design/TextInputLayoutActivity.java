package com.design;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by H on 2017/5/9.
 * Description:
 */

public class TextInputLayoutActivity extends Activity implements View.OnClickListener {

    private TextInputLayout mUserName, mPassword;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textinputlayout);
        mUserName = (TextInputLayout) findViewById(R.id.username);
        mPassword = (TextInputLayout) findViewById(R.id.password);
        mSubmit = (Button) findViewById(R.id.submit);
        mSubmit.setOnClickListener(this);

        mUserName.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence c, int i, int i1, int i2) {
                if (c.toString().length() > 0) {
                    mUserName.setErrorEnabled(false);
                } else {
                    mUserName.setErrorEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mPassword.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence c, int i, int i1, int i2) {
                if (c.toString().length() > 0) {
                    mPassword.setErrorEnabled(false);
                } else {
                    mPassword.setErrorEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submit:
                String name = mUserName.getEditText().getText().toString();
                String password = mPassword.getEditText().getText().toString();

                if (TextUtils.isEmpty(name)) {
                    mUserName.setError("username is Empty");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    mPassword.setError("password is Empty");
                    return;
                }
                Toast.makeText(this, "Login Success", Toast.LENGTH_LONG).show();

                break;
            default:
                break;
        }

    }
}
