class WaterPurifier {
static	int id = 6006;
static String brand = "Kent";
static String color = "White";
static String size = "10L";
static int price = 12000;
static String purificationMethod = "RO+UV";
static String fuelType = "Electric";

public static void main(String args[]) {	
System.out.println("The Water Purifier brand is " + brand);
System.out.println("The Water Purifier color is " + color);
System.out.println("The size of Water Purifier is " + size);
System.out.println("The Water Purifier price is " + price);

updateWaterPurifier();
System.out.println("The Water Purifier brand is " + brand);
System.out.println("The Water Purifier color is " + color);
System.out.println("The size of Water Purifier is " + size);
System.out.println("The Water Purifier price is " + price);
}


public static void updateWaterPurifier(){
	brand = "Havells";
    color = "Blue";
	price = 30000;
	size = "20L";
}
}