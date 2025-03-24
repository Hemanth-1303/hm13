class WaterBottle{
static	int id = 54;
static String brand = "Pigeon";
static String color = "Black";
static String type= "Reusable";
static int price = 1500;
static String capacity = "900 Milliliters";

public static void main(String args[]){
id = 74;
brand = "Cello";
color = "White";
type = "Non reusable";
price = 1000;
capacity = "1L";

updateWaterBottle();

System.out.println("The WaterBottle brand is "+brand);
System.out.println("The WaterBottle id is "+id);
System.out.println("The WaterBottle color is "+color);
System.out.println("The type of WaterBottle is "+type);
System.out.println("The WaterBottle price is "+price);

updateWaterBottle();
}

public static void updateWaterBottle(){
	id = 100;
brand = "Bisleri";
color = "blue";
type = "Non reusable";
price = 100;
capacity = "500ml";
}
}