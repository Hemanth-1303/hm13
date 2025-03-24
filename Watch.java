class Watch{
	static String color = "Black";
static String brand = "Casio F108WH Series";
static String type= "Digital Watch ";
static int price = 1500;
static String shape = "square";
static String countryOfOrigin = "China";
static boolean isWaterProof = true;
public static void main(String args[]){

System.out.println("The Watch brand is "+brand);
System.out.println("The Watch color is "+color);
System.out.println("The type of watch  is "+type);
System.out.println("The shape of watch is "+shape);
System.out.println("The watch was origin in  "+countryOfOrigin);
System.out.println("The watch price is "+price);
System.out.println("is watch is watchproof "+isWaterProof);

System.out.println("After initialization");
updateWatch();
System.out.println("The Watch brand is "+brand);
System.out.println("The Watch color is "+color);
System.out.println("The type of watch  is "+type);
System.out.println("The shape of watch is "+shape);
System.out.println("The watch was origin in  "+countryOfOrigin);
System.out.println("The watch price is "+price);
System.out.println("is watch is watchproof "+isWaterProof);

}

public static void updateWatch(){
	brand = "Fastrack";
	color = "White";
	type = "Smart watch";
	shape = "circle";
	countryOfOrigin = "India";
	price = 2000;
	isWaterProof = false;
}
}
