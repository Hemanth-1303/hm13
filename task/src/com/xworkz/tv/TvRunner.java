package com.xworkz.tv;

import com.xworkz.tv.smarttv.SmartTv;

public class TvRunner {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.brand();
        smartTv.screenType();
        smartTv.resolution();

        Tv tv = new Tv();
        tv.brand();
        tv.screenType();
        tv.resolution();
    }
}
