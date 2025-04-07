package com.xworkz.paintapp.paint;

public class Paint {
    private int paintId;
    private String paintName;
    private String paintColor;
    private String manufactureDate;
    private String expiryDate;
    private double price;

    public void setPaintId(int paintId){
        this.paintId = paintId;
    }

    public int getPaintId(){
        return paintId;
    }

    public void setPaintName(String paintName){
        this.paintName = paintName;
    }

    public String getPaintName(){
        return paintName;
    }

    public void setPaintColor(String paintColor){
        this.paintColor = paintColor;
    }

    public String getPaintColor(){
        return paintColor;
    }

    public void setManufactureDate(String manufactureDate){
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate(){
        return manufactureDate;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
