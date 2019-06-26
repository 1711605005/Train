package com.edu.gdpt.xxgcx.train.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.edu.gdpt.xxgcx.train.R;
import com.edu.gdpt.xxgcx.train.Sqlite.DBUtils;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt_reg_name;
    private EditText edt_reg_psw;
    private EditText edt_reg_again;
    private Button btn_reg_register;
    private String userName,psw,again;
    private DBUtils dbUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dbUtils=DBUtils.getInstance(getApplicationContext());
        initView();
    }

    private void initView() {
        edt_reg_name = (EditText) findViewById(R.id.edt_reg_name);
        edt_reg_psw = (EditText) findViewById(R.id.edt_reg_psw);
        edt_reg_again = (EditText) findViewById(R.id.edt_reg_again);
        btn_reg_register = (Button) findViewById(R.id.btn_reg_register);

        btn_reg_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_reg_register:
                userName = edt_reg_name.getText().toString().trim();
                again = edt_reg_again.getText().toString().trim();
                psw = edt_reg_psw.getText().toString().trim();
                if (TextUtils.isEmpty(userName)) {
                    Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(psw)) {
                    Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(again)) {
                    Toast.makeText(this, "请再次输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }else if (!psw.equals(again)){
                    Toast.makeText(this,"输入两次的密码不一样",Toast.LENGTH_SHORT).show();
                    return;
                }else if (dbUtils.userIsExist(userName)){
                    Toast.makeText(this, "此用户名已存在", Toast.LENGTH_SHORT).show();
                    return;
                }else if (dbUtils.userRegister(userName,psw)){
                    Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
                    RegisterActivity.this.finish();
                }
                break;
        }
    }

}
