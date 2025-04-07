package com.xworkz.paintapp.paint;

import java.sql.SQLOutput;

public class PaintRunner {
    public static void main(String args[]){
        System.out.println("main Started");
        Paint paint = new Paint();
        paint.setPaintId(1);
        paint.setPaintName("Asian Paint");
        paint.setPaintColor("Blue");
        paint.setManufactureDate("04/04/2025");
        paint.setExpiryDate("05/04/2026");
        paint.setPrice(4999.99);

        int paintId = paint.getPaintId();
        String paintName = paint.getPaintName();
        String paintColor = paint.getPaintColor();
        String manufactureDate = paint.getManufactureDate();
        String expiryDate = paint.getExpiryDate();
        double setPrice = paint.getPrice();

        System.out.println("The paint Id is "+paintId);
        System.out.println("The paint name is "+paintName);
        System.out.println("The paint color is "+paintColor);
        System.out.println("The paint manufacture date is "+manufactureDate);
        System.out.println("The paint expiry date is "+expiryDate);
        System.out.println("The paint price is "+setPrice);
    }

}
