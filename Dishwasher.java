class Dishwasher {
static	String brand = "Bosch";
static String color = "Grey";
static String size = "12 Place Settings";
static int price = 35000;
static String fuelType = "Electric";
public static void main(String args[]) {
        
 System.out.println("The Dishwasher brand is " + brand);
 System.out.println("The Dishwasher color is " + color);
 System.out.println("The size of Dishwasher is " + size);
 System.out.println("The Dishwasher price is " + price);
 System.out.println("The Dishwasher fuel type is " + fuelType);
 System.out.println("After initialization");
 updateDishwasher();
 System.out.println("The Dishwasher brand is " + brand);
 System.out.println("The Dishwasher color is " + color);
 System.out.println("The size of Dishwasher is " + size);
 System.out.println("The Dishwasher price is " + price);
 System.out.println("The Dishwasher fuel type is " + fuelType);
}
public static void updateDishwasher();
brand = "Voltas";
color = "black";
size = "11 Place";
price = 30000;
fuelType = "Electric";
}
}