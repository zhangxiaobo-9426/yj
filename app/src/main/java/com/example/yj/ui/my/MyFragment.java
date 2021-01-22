package com.example.yj.ui.my;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.yj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    private Button bt_username;


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loginbutton(view);
    }

    private void loginbutton(View view) {
        bt_username = view.findViewById(R.id.bt_username);
        try {
            Bundle bundle = getArguments();
            bt_username.setText(bundle.getString("USERNAME"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        bt_username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_MyFragment_to_loginFragment);
            }
        });
    }
}
