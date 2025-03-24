class MixerGrinder {
static 	String brand = "Bajaj";
static String color = "Black";
static String size = "750W";
static int price = 4000;
static String grindingMethod = "Blade";
public static void main(String args[]) {        
System.out.println("The Mixer Grinder brand is " + brand);
System.out.println("The Mixer Grinder color is " + color);
System.out.println("The size of Mixer Grinder is " + size);
System.out.println("The Mixer Grinder price is " + price);
System.out.println("The Mixer Grinder grinding method is " + grindingMethod);
System.out.println("After initialization");
updateMixerGrinder();
System.out.println("The Mixer Grinder brand is " + brand);
System.out.println("The Mixer Grinder color is " + color);
System.out.println("The size of Mixer Grinder is " + size);
System.out.println("The Mixer Grinder price is " + price);
System.out.println("The Mixer Grinder grinding method is " + grindingMethod);
}
public static void updateMixerGrinder(){
	brand = "Piegon";
	color = "Grey";
	size = "800W";
	price = 5000;
	grindingMethod = "blade";
}
}