class Charger{
static	String brand = "DONGNI";
static String compatibleDevice = "HP Laptop charger, HP Pavilion charger, HP Envy charger, HP Stream charger, HP Elitebook charger, HP ProBook charger, HP model 15 charger";
static String includedComponents = "connector";
static String specialFeature = "Short Circuit Protection";
static String color = "Black";
public static void main(String args[]){
System.out.println("The charger brand is "+brand);
System.out.println("The charger has compatible device that is "+compatibleDevice);
System.out.println("The charger has included components that is "+includedComponents);
System.out.println("The charger has special features that is "+specialFeature);
System.out.println("The color of charger is "+color);
System.out.println("After initialization");
updateCharger();
System.out.println("The charger brand is "+brand);
System.out.println("The charger has compatible device that is "+compatibleDevice);
System.out.println("The charger has included components that is "+includedComponents);
System.out.println("The charger has special features that is "+specialFeature);
System.out.println("The color of charger is "+color);

}
public static void updateCharger(){
	brand = "Hp";
	compatibleDevice = "HP Laptop charger, HP Pavilion charger, HP Envy charger";
	includedComponents = "Connector";
	specialFeature = "Short circuit";
	color = "Black";
}
}