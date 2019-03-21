package com.yangwei.www.welcomecomponent.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.yangwei.www.base.base.BaseActivity;
import com.yangwei.www.base.base.IBasePresenter;
import com.yangwei.www.welcomecomponent.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Button btnJump, btnNesting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void initView() {
        btnJump = findViewById(R.id.btn_jump);
        btnNesting = findViewById(R.id.btn_Nesting);

        btnJump.setOnClickListener(this);
        btnNesting.setOnClickListener(this);
    }

    @Override
    protected IBasePresenter initPresenter() {
        return null;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_jump:
                goPage(JumpShowActivity.class);
                break;
            case R.id.btn_Nesting:
                break;
        }
    }
}
