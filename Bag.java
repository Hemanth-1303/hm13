class Bag{
static String brand = "NEWHEY";
static String color = "Brown";
static String department= "Men";
static int price = 3200;
static String dateFirstAvailable = "‎March 11, 2018";
public static void main(String args[]){
System.out.println("The Bag brand is "+brand);
System.out.println("The Bag color is "+color);
System.out.println("The Department of Bag is "+department);
System.out.println("The Date First Available of Bag is "+dateFirstAvailable);
System.out.println("The Bag price is "+price);
System.out.println("After initilization");
updateBag();
System.out.println("The Bag brand is "+brand);
System.out.println("The Bag color is "+color);
System.out.println("The Department of Bag is "+department);
System.out.println("The Date First Available of Bag is "+dateFirstAvailable);
System.out.println("The Bag price is "+price);
}
public static void updateBag(){
	brand = "Wildcraft";
	color = "black";
	department = "Men";
	price = 3000;
	dateFirstAvailable = "Dec 13, 2020";
}
}