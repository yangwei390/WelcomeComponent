package com.yangwei.www.register.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.yangwei.www.base.base.BaseActivity;
import com.yangwei.www.base.base.IBasePresenter;
import com.yangwei.www.register.R;
import com.yangwei.www.register.fragment.RegisterFragment;

/**
 * @author yangwei
 * @Date 2019/3/21
 * @Description RegisterActivity
 */
@Route(path = "/register/home")
public class RegisterActivity extends BaseActivity {
    private RegisterFragment registerFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity_register);
        initView();
    }

    @Override
    protected void initView() {
        initFragment();
    }

    private void initFragment() {
        registerFragment = new RegisterFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.lt_register, registerFragment, "register");
        fragmentTransaction.commit();
    }

    @Override
    protected IBasePresenter initPresenter() {
        return null;
    }
}
