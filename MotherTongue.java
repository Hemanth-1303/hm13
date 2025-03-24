class MotherTongue{
static String languages[] = {"Hindi","Kannada","Telugu","Tamil","Malayalam","Bengali","Marathi","Gujurati","Urdu","Bhojpuri","Punjabi","Odia","Rajasthani",
"Chhattisgarhi","Assamese","Maithili","Magahi","Haryanvi","Khotta","Marwari","Santalli","Kashmiri","Bundeli","Malvi","Sadri","Mewari","Awadhi","Wagdi",
"Nepali","Gondi","Lamani","Dogri","Nimadi","Tulu","Konkani","Manipuri","Sindhi","Bagri","Ahirani","Kangri"};

public static void main(String args[]){
languages();
}

public static void languages(){
for(String Languages:languages){
System.out.println("The languages are :"+Languages);
}
}
}