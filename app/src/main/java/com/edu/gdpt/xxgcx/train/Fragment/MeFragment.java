package com.edu.gdpt.xxgcx.train.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.Activity.LoginActivity;
import com.edu.gdpt.xxgcx.train.R;
import com.edu.gdpt.xxgcx.train.Widget.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {
    private Button btn_me_login;
    private CircleImageView cv_me_head;
    private boolean isLogin=false;
    private TextView tv_me_name;


    public MeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_me, container, false);
        btn_me_login=view.findViewById(R.id.btn_me_login);
        cv_me_head=view.findViewById(R.id.cv_me_head);
        tv_me_name=view.findViewById(R.id.tv_me_name);
        btn_me_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity().getApplicationContext(),LoginActivity.class);
                startActivityForResult(intent,1);
            }
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1 && data !=null){
            boolean isLogin=data.getBooleanExtra("isLogin",true);
            String userName=data.getStringExtra("loginUserName");
            tv_me_name.setText(userName);
            this.isLogin=isLogin;
            btn_me_login.setVisibility(View.GONE);
        }
    }
}
