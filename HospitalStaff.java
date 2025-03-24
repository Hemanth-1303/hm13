class HospitalStaff{
static String name[] = {"Aditiya","Akash","Bhumika","Arun","Hemanth","Chandana","Anusha","Vishwas","Darshan","Pradeep"};
static char gender[] = {'M','M','F','M','M','F','F','M','M','M'};

public static void main(String args[]){
getDetails();
}

public static void getDetails(){
for(String Name:name){
System.out.println("The Hospital Staff Name is: "+Name);
}

for(char Gender:gender){
System.out.println("The staff gender is: "+ Gender);
}
}
}

