class Pizza{
static	String brand = "Dominoz";
static String type = "cheese valcano paneer";
static String includedComponents = "center loaded with Molten cheese and topped with peppy Paneer";
static int price = 299;
public static void main(String args[]){
System.out.println("The pizza brand is "+brand);
System.out.println("The pizza has type that is "+type);
System.out.println("The pizza has included components that is "+includedComponents);
System.out.println("The price of pizza is "+price);
System.out.println("After initialization");
updatePizza();
System.out.println("The pizza brand is "+brand);
System.out.println("The pizza has type that is "+type);
System.out.println("The pizza has included components that is "+includedComponents);
System.out.println("The price of pizza is "+price);
}
public static void updatePizza(){
	brand = "Pizza hut";
	type = "Corn";
	includedComponents = "Golden corn";
	price = 199;
}
}