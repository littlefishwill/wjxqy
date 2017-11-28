package com.szw.game.wjxqy.ui.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.szw.game.wjxqy.frame.WjxqyAppliaciton;

/**
 * Created by shenmegui on 2016/9/9.
 */
public class SkinTextView extends TextView {
    public static Typeface typeface =null;

    public SkinTextView(Context context) {
        super(context);
        initFont();
    }

    public SkinTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFont();
        initFontShaow();
    }

    public SkinTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SkinTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * 设置字体阴影
     */
    private void initFontShaow() {
        setShadowLayer(3,2,2, Color.parseColor("#2B2B2B"));
    }

    /**
     * 初始化 字体类型
     */
    private void initFont(){
        if(typeface==null){
            typeface  = Typeface.createFromAsset(WjxqyAppliaciton.getInstance().getAssets(),"hyxk.ttf");
        }

        if(typeface!=null){
            setTypeface(typeface);
        }

        // --- 初始化为默认颜色

    }

}
