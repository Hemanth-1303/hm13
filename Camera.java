class Camera{
static	String brand = "Qubo";
static String color = "White";
static int price = 2000;
static String countryOfOrigin = "China";
static boolean isWaterProof = false;
public static void main(String args[]){
System.out.println("The Camera brand is "+brand);
System.out.println("The Camera color is "+color);
System.out.println("The Camera origin in  "+countryOfOrigin);
System.out.println("The Camera price is "+price);
System.out.println("is Camera is watchproof "+isWaterProof);
System.out.println("After initialization");
updateCamera();
System.out.println("The Camera brand is "+brand);
System.out.println("The Camera color is "+color);
System.out.println("The Camera origin in  "+countryOfOrigin);
System.out.println("The Camera price is "+price);
System.out.println("is Camera is watchproof "+isWaterProof);

}
public static void updateCamera(){;
brand = "canon";
color = "black";
price = 35000;
countryOfOrigin = "China";
isWaterProof = true;
}
}

