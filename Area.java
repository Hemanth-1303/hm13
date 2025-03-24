class Area{
static int pinCodes[] = {560026,560023,560064};
public static void main(String args[]){
System.out.println("main started");
getPinCodes();
System.out.println("main ended");
}

public static void getPinCodes(){
System.out.println("Inside getPinCodes()");
System.out.println("List of Area PinCodes are : ");
for(int pinCode:pinCodes){
System.out.println(pinCode);
}
System.out.println("End of pinCode");
}
}
