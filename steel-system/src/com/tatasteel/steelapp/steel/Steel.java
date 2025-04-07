package com.tatasteel.steelapp.steel;

public class Steel {
    private String brandName;
    private String type;
    private int grade;
    private String origin;
    private double price;
    private double weight;
    private String application;

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public String getOrigin(){
        return origin;
    }

    public void setPrice(double origin){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setApplication(String application){
        this.application = application;
    }

    public String getApplication(){
        return application;
    }
}
