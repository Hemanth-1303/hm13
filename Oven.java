class Oven{
static	String brand = "LG";
static String color = "Black";
static String size= "28L";
static int price = 20000;
public static void main(String args[]){

System.out.println("The Oven brand is "+brand);
System.out.println("The Oven color is "+color);
System.out.println("The size of Oven is "+size);
System.out.println("The Oven price is "+price);
System.out.println("After initialization");
updateOven();
System.out.println("The Oven brand is "+brand);
System.out.println("The Oven color is "+color);
System.out.println("The size of Oven is "+size);
System.out.println("The Oven price is "+price);
System.out.println("After initialization");

}
public static void updateOven(){
	brand = "Piegon";
	color = "White";
	size = "30L";
	price = 15000;
}
}