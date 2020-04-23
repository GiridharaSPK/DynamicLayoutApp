package com.giridharaspk.samplecustomviews;


import java.io.Serializable;

class CustomViewModel implements Serializable {

    public CustomViewModel(int viewType, String text) {
        this.viewType = viewType;
        this.text = text;
    }

    private int viewType;
    private String text = "sample text";

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

}
