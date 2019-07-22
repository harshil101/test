package com.example.bisauli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    private Button btn_navigation;
    private EditText et_login,et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreateCalled()");

        btn_navigation = findViewById(R.id.btn_navigation);
        et_login = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);

        btn_navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(et_login.getText().toString().trim())){
                    Toast.makeText(MainActivity.this, "Email is empty", Toast.LENGTH_SHORT).show();
                }else if (TextUtils.isEmpty(et_password.getText().toString().trim())){
                    Toast.makeText(MainActivity.this, "Password is empty", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStartCalled()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResumeCalled()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPauseCalled()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStopCalled()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroyCalled()");
    }
}
