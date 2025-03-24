class WashingMachine{
static	String brand = "LG";
static String color = "Middle Black";
static String capacity= "9 Kilograms";
static int price = 38000;
public static void main(String args[]){

System.out.println("The Washing Machine brand is "+brand);
System.out.println("The Washing Machine color is "+color);
System.out.println("The Capacity of Washing Machine is "+capacity);
System.out.println("The Washing Machine price is "+price);

System.out.println("After initialization");
updateWashingMachine();
System.out.println("The Washing Machine brand is "+brand);
System.out.println("The Washing Machine color is "+color);
System.out.println("The Capacity of Washing Machine is "+capacity);
System.out.println("The Washing Machine price is "+price);

}

public static void updateWashingMachine(){
	brand = "Samsung";
	color = "white";
	capacity = "11 kg";
	price = 40000;
	
}
}