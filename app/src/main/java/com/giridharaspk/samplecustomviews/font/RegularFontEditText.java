package com.giridharaspk.samplecustomviews.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;


public class RegularFontEditText extends AppCompatEditText {

    public RegularFontEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
        rotate();
    }

    public RegularFontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        rotate();
    }

    public RegularFontEditText(Context context) {
        super(context);
        init();
        rotate();
    }

    private void rotate() {
        // TODO Auto-generated method stub
        setSelected(true);
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "rubic_regular.ttf");
            setTypeface(tf);
        }
    }


}