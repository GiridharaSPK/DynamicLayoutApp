package com.giridharaspk.samplecustomviews;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class CustomViewModel implements Serializable {

    private int viewType;
    private String text = "sample text";
    private String hint = "sample hint";
    private int textSize;
    private ArrayList<String> stringList = new ArrayList<>();

    public CustomViewModel(int viewType, String text, int textSize, String hint) {
        this.viewType = viewType;
        this.text = text;
        this.textSize = textSize;
        this.hint = hint;
    }

    public CustomViewModel(int viewType, String text, int textSize, String hint, ArrayList<String> spinnerList) {
        this.viewType = viewType;
        this.text = text;
        this.textSize = textSize;
        this.hint = hint;
        this.stringList.addAll(spinnerList);
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public ArrayList<String> getStringList() {
        return stringList;
    }

    public void setStringList(ArrayList<String> stringList) {
        this.stringList = stringList;
    }

}
