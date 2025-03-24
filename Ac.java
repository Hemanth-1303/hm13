class Ac{
static	String brand = "FLOWBREEZE";
static String color = "White";
static String capacity= "2 Gallons";
static int price = 9000;
static String noiseLevel = "49db";;
static String voltage = "110 Volts";
public static void main(String args[]){
System.out.println("The Ac brand is "+brand);
System.out.println("The Ac color is "+color);
System.out.println("The Capacity of Ac is "+capacity);
System.out.println("The Ac price is "+price);
System.out.println("The Ac Noise level is "+noiseLevel);
System.out.println("The Ac Voltage is "+voltage);
System.out.println("After initilization");
updateAc();
System.out.println("The Ac brand is "+brand);
System.out.println("The Ac color is "+color);
System.out.println("The Capacity of Ac is "+capacity);
System.out.println("The Ac price is "+price);
System.out.println("The Ac Noise level is "+noiseLevel);
System.out.println("The Ac Voltage is "+voltage);
}
public static void updateAc(){
	brand = "Blue star";
	color = "Black";
	capacity = "3 Gallons";
	price = 10000;
	noiseLevel = "40db";
	voltage = "100 Volts";
}
}