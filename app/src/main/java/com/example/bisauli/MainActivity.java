package com.example.bisauli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bisauli.ui.main.fragments.LoginFragment;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    private Button btn_navigation;
    private EditText et_login,et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreateCalled()");

        initiateFragment();

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

    private void initiateFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.main_fragment,new LoginFragment(),"LoginFragment");
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
