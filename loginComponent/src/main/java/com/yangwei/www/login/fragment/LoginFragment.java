package com.yangwei.www.login.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.yangwei.www.base.base.BaseFragment;
import com.yangwei.www.login.R;

/**
 * @author yangwei
 * @Date 2019/3/21
 * @Description LoginFragment
 */
public class LoginFragment extends BaseFragment implements View.OnClickListener {
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };


    private Button btnOk;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment_login, null);
        initView(view);
        return view;
    }

    @Override
    protected void initView(View view) {
        btnOk = view.findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_ok) {
            toast("登录成功,跳转设置页");
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ARouter.getInstance().build("/setting/home").navigation();
                }
            }, 2000);
        }
    }
}
