class VacuumCleaner {
static	String brand = "Dyson";
static String color = "Red";
static String size = "2L";
static int price = 30000;
public static void main(String args[]) {        
System.out.println("The Vacuum Cleaner brand is " + brand);
System.out.println("The Vacuum Cleaner color is " + color);
System.out.println("The size of Vacuum Cleaner is " + size);
System.out.println("The Vacuum Cleaner price is " + price);
System.out.println("After initialization");
updateVacuumCleaner();
System.out.println("The Vacuum Cleaner brand is " + brand);
System.out.println("The Vacuum Cleaner color is " + color);
System.out.println("The size of Vacuum Cleaner is " + size);
System.out.println("The Vacuum Cleaner price is " + price);
}
public static void updateVacuumCleaner(){
	brand = "Agaro";
	color = "Black";
	size = "5L";
	price = 20000;
}
}