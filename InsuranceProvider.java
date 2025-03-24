class InsuranceProvider{
public static double search(String insuranceName){
double termPrice = 0.0;
if(insuranceName == "LIC"){
termPrice = 10000.00;
}
else if(insuranceName == "Bajaj Insurance"){
termPrice = 9000.00;
}
else if(insuranceName == "Hdfc"){
termPrice = 20000.00;
}
else if(insuranceName == "SBI Insurance"){
termPrice = 8000.00;
}
else if(insuranceName == "Canara Insurance"){
termPrice = 7000.00;
}
else{
System.out.println(insuranceName +" is not found");
}
return termPrice;
}
}