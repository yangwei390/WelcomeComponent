package com.yangwei.www.setting.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.yangwei.www.base.base.BaseActivity;
import com.yangwei.www.base.base.IBasePresenter;
import com.yangwei.www.setting.R;
import com.yangwei.www.setting.fragment.SettingFragment;

/**
 * @author yangwei
 * @Date 2019/3/21
 * @Description SettingActivity
 */
@Route(path = "/setting/home")
public class SettingActivity extends BaseActivity {
    private SettingFragment settingFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity_setting);
        initView();
    }

    @Override
    protected void initView() {
        initFragment();
    }

    private void initFragment() {
        settingFragment = new SettingFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.lt_setting, settingFragment, "setting");
        fragmentTransaction.commit();
    }

    @Override
    protected IBasePresenter initPresenter() {
        return null;
    }


}
