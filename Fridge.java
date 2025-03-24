class Fridge{
static	String brand = "West Bend";
static String color = "Black";
static String capacity= "7.4 Cubic Feet";
static int price = 42000;
static int numberOfDoors = 2;
static String defrostSystem = "Semi-Automatic";
public static void main(String args[]){
System.out.println("The Fridge brand is "+brand);
System.out.println("The Fridge color is "+color);
System.out.println("The Capacity of Fridge is "+capacity);
System.out.println("The Fridge price is "+price);
System.out.println("The Fridge No of doors is "+numberOfDoors);
System.out.println("The Fridge Defrost system is "+defrostSystem);
System.out.println("After initialization");
updateFridge();
System.out.println("The Fridge brand is "+brand);
System.out.println("The Fridge color is "+color);
System.out.println("The Capacity of Fridge is "+capacity);
System.out.println("The Fridge price is "+price);
System.out.println("The Fridge No of doors is "+numberOfDoors);
System.out.println("The Fridge Defrost system is "+defrostSystem);
}
public static void updateFridge(){
	brand = "samsung";
	color = "Grey";
	capacity = "6 Cubic";
	price = 40000;
	numberOfDoors = 1
	defrostSystem = "Automatic";
}
}