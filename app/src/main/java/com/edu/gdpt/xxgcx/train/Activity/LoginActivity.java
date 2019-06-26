package com.edu.gdpt.xxgcx.train.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.edu.gdpt.xxgcx.train.R;
import com.edu.gdpt.xxgcx.train.Sqlite.DBUtils;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt_login_name;
    private EditText edt_login_psw;
    private ImageButton iv_login_login;
    private TextView tv_login_register;
    private DBUtils dbUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dbUtils=DBUtils.getInstance(getApplicationContext());
        initView();
    }

    private void initView() {
        edt_login_name = (EditText) findViewById(R.id.edt_login_name);
        edt_login_psw = (EditText) findViewById(R.id.edt_login_psw);
        iv_login_login = (ImageButton) findViewById(R.id.iv_login_login);
        tv_login_register = (TextView) findViewById(R.id.tv_login_register);

        tv_login_register.setOnClickListener(this);
        iv_login_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_login_login:
                String userName = edt_login_name.getText().toString().trim();
                String psw = edt_login_psw.getText().toString().trim();
                if (TextUtils.isEmpty(userName)) {
                    Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(psw)) {
                    Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }else if (dbUtils.userLogin(userName,psw)){
                    Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
                    Intent data=new Intent();
                    data.putExtra("isLogin",true);
                    data.putExtra("loginUserName",userName);
                    setResult(RESULT_OK,data);
                    finish();
                    return;
                }else {
                    Toast.makeText(this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.tv_login_register:
                startActivity(new Intent(this,RegisterActivity.class));
                break;
        }
    }

}
