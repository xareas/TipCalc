package edu.galileo.android.tipcalc;

import android.app.Application;


public class TipCalcApp extends Application {
   private final static String  ABOUT_URL = "https://about.me/adriancatalan";

    public  String getAboutUrl(){
        return  ABOUT_URL;
    }

}
