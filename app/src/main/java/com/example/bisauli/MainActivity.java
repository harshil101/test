package com.example.bisauli;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bisauli.ui.main.fragments.LoginFragment;
import com.example.bisauli.util.FragmentUtil;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    private Button btn_navigation;
    private EditText et_login, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreateCalled()");

        initiateFragment();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStartCalled()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResumeCalled()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPauseCalled()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStopCalled()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroyCalled()");
    }

    private void initiateFragment() {
        FragmentUtil.beginTransaction(this, new LoginFragment(), LoginFragment.class.getSimpleName());
    }
}
