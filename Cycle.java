class Cycle{
static String brand = "Lifelong";
static String color = "Blue";
static String type= "Mountain Bike";
static int price = 6500;
public static void main(String args[]){
System.out.println("The Cycle brand is "+brand);
System.out.println("The Cycle color is "+color);
System.out.println("The type of Cycle is "+type);
System.out.println("The Cycle price is "+price);
System.out.println("After initialization");
updateCycle();
System.out.println("The Cycle brand is "+brand);
System.out.println("The Cycle color is "+color);
System.out.println("The type of Cycle is "+type);
System.out.println("The Cycle price is "+price);
System.out.println("After initialization");

}
public static void updateCycle(){
	brand = "Hercules";
	color = "Black";
	type = "Mountain Bike";
	price = 10000;
}
}