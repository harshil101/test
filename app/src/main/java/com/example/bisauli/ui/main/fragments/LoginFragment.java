package com.example.bisauli.ui.main.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bisauli.R;
import com.example.bisauli.util.FragmentUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    private Button signUp;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        signUp = view.findViewById(R.id.btn_signup);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtil.beginTransaction(
                        getActivity(), new SignUpFragment(), SignUpFragment.class.getSimpleName());
            }
        });
    }
}
