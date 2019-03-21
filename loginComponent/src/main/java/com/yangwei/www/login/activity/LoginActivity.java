package com.yangwei.www.login.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.yangwei.www.base.base.BaseActivity;
import com.yangwei.www.base.base.IBasePresenter;
import com.yangwei.www.login.R;
import com.yangwei.www.login.fragment.LoginFragment;

/**
 * @author yangwei
 * @Date 2019/3/21
 * @Description LoginActivity
 */
@Route(path = "/login/home")
public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private LoginFragment loginFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_login);
        initView();
    }

    @Override
    protected void initView() {
        initFragment();
    }

    private void initFragment() {
        loginFragment = new LoginFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.lt_login, loginFragment, "login");
        fragmentTransaction.commit();
    }

    @Override
    protected IBasePresenter initPresenter() {
        return null;
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
//        if (i == R.id.tv_login) {
//            ARouter.getInstance().build("/register/home").navigation();
//        }
    }
}
