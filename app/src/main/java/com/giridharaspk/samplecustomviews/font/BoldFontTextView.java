package com.giridharaspk.samplecustomviews.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

/**
 * Created by kartiki.tripathi on 4/8/17.
 */

public class BoldFontTextView extends AppCompatTextView {


    public BoldFontTextView(Context context) {
        super(context);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "rubic_bold.ttf");

        this.setTypeface(face);
    }

    public BoldFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "rubic_bold.ttf");
        this.setTypeface(face);
    }

    public BoldFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "rubic_bold.ttf");
        this.setTypeface(face);
    }


}