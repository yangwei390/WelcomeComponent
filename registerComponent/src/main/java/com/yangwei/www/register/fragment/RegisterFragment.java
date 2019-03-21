package com.yangwei.www.register.fragment;

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
import com.yangwei.www.register.R;

/**
 * @author yangwei
 * @Date 2019/3/21
 * @Description RegisterFragment
 */
public class RegisterFragment extends BaseFragment implements View.OnClickListener {
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
        View view = inflater.inflate(R.layout.register_fragment_register, null);
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
            toast("注册成功，去登录");
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ARouter.getInstance().build("/login/home").navigation();
                }
            }, 2000);
        }
    }
}
