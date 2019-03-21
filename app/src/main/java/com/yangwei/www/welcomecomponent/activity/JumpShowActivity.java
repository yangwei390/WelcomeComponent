package com.yangwei.www.welcomecomponent.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.yangwei.www.base.base.BaseActivity;
import com.yangwei.www.base.base.IBasePresenter;
import com.yangwei.www.welcomecomponent.R;

/**
 * @author yangwei
 * @Date 2019/3/21
 * @Description JumpShowActivity
 */
public class JumpShowActivity extends BaseActivity implements View.OnClickListener {
    private Button btnLogin, btnRegister, btnSetting;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_show);
        initView();
    }

    @Override
    protected void initView() {
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
        btnSetting = findViewById(R.id.btn_setting);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnSetting.setOnClickListener(this);
    }

    @Override
    protected IBasePresenter initPresenter() {
        return null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                ARouter.getInstance().build("/login/home").navigation();
                break;
            case R.id.btn_register:
                ARouter.getInstance().build("/register/home").navigation();
                break;
            case R.id.btn_setting:
                ARouter.getInstance().build("/setting/home").navigation();
                break;
        }
    }
}
