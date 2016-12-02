package com.chinavalley.mytestbox;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/11/2.
 */

public class MyTestBox extends EditText {

    public MyTestBox(Context context) {
        super(context);
    }

    public MyTestBox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTestBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        Log.i("MyTestBox", "这里是MyTestBox的onKeyDown");
        return false;
    }
}
