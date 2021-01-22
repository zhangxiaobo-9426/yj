package com.example.yj.ui.my;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    private EditText login_username,login_pwd;
    private Button login_login_bt;
    private  String username,pwd;



    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        login();
        login_login_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle =new Bundle();
                String a1 ="XXX";
                bundle.putString("USERNAME",a1);
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_MyFragment,bundle);
            }
        });
    }

    private void init(View view) {
        login_username = view.findViewById(R.id.login_username);
        login_pwd = view.findViewById(R.id.login_pwd);
        login_login_bt = view.findViewById(R.id.login_login_bt);
        username = login_username.getText().toString();
        pwd = login_pwd.getText().toString();
    }

    /**
     * 模拟登录操作
     */
    private void login()
    {
        if (TextUtils.isEmpty(username))
        {
            // Toast 提示用户输入必要信息
            Toast.makeText(getContext(), "请输入用户名", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(pwd))
        {
            Toast.makeText(getContext(), "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }
    }

}
