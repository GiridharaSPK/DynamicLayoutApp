package com.giridharaspk.samplecustomviews.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;


public class BoldFontEditText extends AppCompatEditText {

    public BoldFontEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
        rotate();
    }

    public BoldFontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        rotate();
    }

    public BoldFontEditText(Context context) {
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
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "rubic_bold.otf");
            setTypeface(tf);
//            setFilters(new InputFilter[]{new EmojiExcludeFilter()});
        }
    }



   /* private class EmojiExcludeFilter implements InputFilter {

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
    }
*/
}