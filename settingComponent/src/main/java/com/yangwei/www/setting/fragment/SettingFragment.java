package com.yangwei.www.setting.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yangwei.www.base.base.BaseFragment;
import com.yangwei.www.setting.R;

/**
 * @author yangwei
 * @Date 2019/3/21
 * @Description SettingFragment
 */
public class SettingFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.setting_fragment_setting, null);
        initView(view);
        return view;
    }

    @Override
    protected void initView(View view) {

    }
}
