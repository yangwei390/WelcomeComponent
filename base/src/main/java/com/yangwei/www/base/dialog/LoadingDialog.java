package com.yangwei.www.base.dialog;

import android.app.Dialog;
import android.content.Context;

import com.yangwei.www.base.R;


/**
 * Created by ____ Bye丶 on 2017/6/1.
 */

public class LoadingDialog extends Dialog {

    public LoadingDialog(Context context) {
        super(context, R.style.base_style_common_dialog);
        init();
    }

    private void init() {
        setContentView(R.layout.base_layout_loading);
        setCanceledOnTouchOutside(false);
    }
}
