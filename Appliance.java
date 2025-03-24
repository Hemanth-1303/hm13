class Appliance {
static	String brand = "Bajaj";
static String color = "Black";
static String size = "750W";
static int price = 4000;
static String grindingMethod = "Blade";
static String fuelType = "Electric";

public static void main(String args[]) {
System.out.println("The Mixer Grinder brand is " + brand);
System.out.println("The Mixer Grinder color is " + color);
System.out.println("The size of Mixer Grinder is " + size);
System.out.println("The Mixer Grinder price is " + price);
System.out.println("The Mixer Grinder grinding method is " + grindingMethod);
System.out.println("The Mixer Grinder fuel type is " + fuelType);
System.out.println("After initilization");
updateAppliance();
System.out.println("The Mixer Grinder brand is " + brand);
System.out.println("The Mixer Grinder color is " + color);
System.out.println("The size of Mixer Grinder is " + size);
System.out.println("The Mixer Grinder price is " + price);
System.out.println("The Mixer Grinder grinding method is " + grindingMethod);
System.out.println("The Mixer Grinder fuel type is " + fuelType);
}
public static void updateAppliance(){
	brand = "Kent";
	color = "White";
	size = "800W";
	price = 5000;
	grindingMethod = "Blade";
	fuelType = "Electric";
}
}