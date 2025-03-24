class Shoe{
static 	String brand = "Puma";
static String color = "Black";
static int price = 1500;
public static void main(String args[]){
System.out.println("The Shoe brand is "+brand);
System.out.println("The Shoe color is "+color);
System.out.println("The Shoe price is "+price);
System.out.println("After initialization");
System.out.println("The Shoe brand is "+brand);
System.out.println("The Shoe color is "+color);
System.out.println("The Shoe price is "+price);
}
public static void updateShoe(){
	brand = "Nike";
	color = "White";
	price = 2500;
}
}