package com.example.bisauli.util;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bisauli.R;

public class FragmentUtil {
    public static void beginTransaction(FragmentActivity activity, Fragment fragment, String tag) {

        FragmentManager manager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.main_fragment, fragment, tag);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
