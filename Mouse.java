class Mouse{
static 	String brand = "TMKB Technology Mechanical KeyBoard";
static String color = "White";
static String connectivityTechnology= "USB";
static int price = 1500;
static String specialFeature = "Drag-Free Paracord, High-Precision Optical Sensor"; 
public static void main(String args[]){

System.out.println("The Mouse brand is "+brand);
System.out.println("The Mouse color is "+color);
System.out.println("The connectivity technology of Mouse is "+connectivityTechnology);
System.out.println("The Special Feature of Mouse is "+specialFeature);
System.out.println("The Mouse price is "+price);
System.out.println("After initialization");
updateMouse();
System.out.println("The Mouse brand is "+brand);
System.out.println("The Mouse color is "+color);
System.out.println("The connectivity technology of Mouse is "+connectivityTechnology);
System.out.println("The Special Feature of Mouse is "+specialFeature);
System.out.println("The Mouse price is "+price);

}
public static void updateMouse(){
	brand = "Zebronics";
	color = "White";
	connectivityTechnology = "USB";
	price = 1000;
	specialFeature = "Drag-Free Paracord";
}
}