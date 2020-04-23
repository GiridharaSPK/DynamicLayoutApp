package com.giridharaspk.samplecustomviews.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class MediumFontEditText extends AppCompatEditText {

    public MediumFontEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
        rotate();
    }

    public MediumFontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        rotate();
    }

    public MediumFontEditText(Context context) {
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
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "rubic_medium.ttf");
            setTypeface(tf);
//            setFilters(new InputFilter[]{new EmojiExcludeFilter()});
        }
    }

 /*   public class EmojiExcludeFilter implements InputFilter {

        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int
        dstart, int dend) {
            for (int i = start; i < end; i++) {
                int type = Character.getType(source.charAt(i));
                if (type == Character.SURROGATE || type == Character.OTHER_SYMBOL) {
                    return "";
                }
            }
            return null;
        }
    }*/

}