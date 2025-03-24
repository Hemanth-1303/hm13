class Zepto{
public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber, String dob, String mailId, String gender){
boolean userValid = false;
boolean isfirstName = false;
boolean islastName = false;
boolean isphoneNumber = false;
boolean isdob = false;
boolean ismailId = false;
boolean isgender = false;
if(firstName != null && firstName.length() >= 3 && !firstName.isEmpty()){
isfirstName = true;
System.out.println("The first name is "+firstName);
}
else{
System.out.println("First name is Invalid");
}

if(lastName != null && lastName.length() >= 1){
islastName = true;
}
else{
System.out.println("last name is Invalid");
}

if(phoneNumber != null && phoneNumber.length() == 10){
isphoneNumber = true;
}
else{
System.out.println("phone Number is Invalid");
}

if(dob != null){
isdob = true;
System.out.println("The dob is "+dob);
}
else{
System.out.println("Date of birth is Invalid");
}

if(mailId != null){
ismailId = true;
}
else{
System.out.println("mail id is Invalid");
}

if(gender != null){
isgender = true;
}
else{
System.out.println("gender does not exist");
}

if(isfirstName == true && islastName == true && isdob == true && isgender == true && ismailId == true && isphoneNumber == true){
userValid = true;
}
return userValid;
}
public static String signUp(String firstName, String lastName, String phoneNumber, String dob, String mailId ,String gender){
String registerStatus = null;
boolean ref = validateUserProfile(firstName,lastName,phoneNumber,dob,mailId,gender);
if(ref == true){
registerStatus = "Register success";
}
else{
registerStatus = "Register failed";
}
return registerStatus;
}
}