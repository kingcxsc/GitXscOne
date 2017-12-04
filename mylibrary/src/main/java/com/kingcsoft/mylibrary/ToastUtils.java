package com.kingcsoft.mylibrary;

/**
 * Created by Administrator on 2017/12/4 0004.
 */

import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 *
 * @author xushengcan
 * @date 16/8/30
 */
public class ToastUtils {

    /**
     * 显示吐司
     *
     * @param context
     */
    public static void showToast(Context context) {
        Toast.makeText(context, "我是徐圣灿！！！！", Toast.LENGTH_LONG).show();
    }
}
