package com.prathamyadav006.viewme;

public class ModelClass {
    private  int imageview ;
    private String textview;



    ModelClass(int imageview, String textview){
        this.textview=textview;
        this.imageview=imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public void setTextview(String textview) {
        this.textview = textview;
    }

    public int getImageview() {
        return imageview;
    }

    public String getTextview() {
        return textview;
    }

}
