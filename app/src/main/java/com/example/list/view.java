package com.example.list;

public class view {
    private int mImageResourse;
    private String mText1;
    private String mText2;

    public view(int imageResourse , String Text1 , String Text2){
        mImageResourse = imageResourse ;
        mText1 = Text1 ;
        mText2 = Text2 ;
    }
    public int getmImageResourse(){
        return mImageResourse ;
    }
    public String getmText1() {
        return  mText1 ;
    }
    public String  getmText2 () {
        return mText2 ;
    }
}
