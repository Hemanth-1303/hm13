class AirC{
	static boolean isOn = false;
	static int currentTemp = 0;
	static int maxTemp = 6;
	static int minTemp;
	
public static boolean acCondition(){
	
if(isOn == false){
isOn = true;
}
else {
isOn = false;

}
return isOn;
}

//increase temp
public static void increaseTemp(){
	boolean isOn = AirC.acCondition();
	if(isOn == true){
		if(currentTemp<maxTemp){
		currentTemp = currentTemp+1;
		System.out.println("The current temparature is " +currentTemp);
	} else System.out.println("Max temparature has reached"); 
	}
	  else System.out.println("Turn on the Ac");
	  
	  return ;
}

public static void decreaseTemp(){
	boolean isOn = AirC.acCondition();
	if(isOn == true){
		if(currentTemp>maxTemp){
		currentTemp = currentTemp-1;
		System.out.println("The current temparature is " +currentTemp);
	} else
		System.out.println("Max temparature has reached");
	} else  System.out.println("Turn on the Ac");
	
	  return ;
}
}
