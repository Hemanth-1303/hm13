class Processor{
static	String brand = "Intel Core I5 12400F";
static String gen = "12th gen";
static String manufacturer = "Intel";
static String model = "Core i5-11400F";
static String  speed = "4.4 GHz";
public static void main(String args[]){
System.out.println("The Processor brand is "+brand);
System.out.println("The Processor contains "+gen);
System.out.println("The Processor has manufacturer "+manufacturer);
System.out.println("The Processor have speed of  "+speed);
System.out.println("The Processor of model is "+model);
System.out.println("After initialization");
updateProcessor();
System.out.println("The Processor brand is "+brand);
System.out.println("The Processor contains "+gen);
System.out.println("The Processor has manufacturer "+manufacturer);
System.out.println("The Processor have speed of  "+speed);
System.out.println("The Processor of model is "+model);
}
public static void updateProcessor(){
	brand = "Intel core I7";
	gen = "13th";
	manufacturer = "Intel";
	model = "core i7";
	speed = "5.6Ghz";
}
}