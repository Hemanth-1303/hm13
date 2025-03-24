class Amazonrunner{
public static void main(String args[]){
Amazon ref = new Amazon();
ref.id = 1;
ref.name = "Kushal";
ref.phonenumber = 9876543210L;
ref.password = "k@123";
System.out.println("The Amazon ref id is "+ref.id);
System.out.println("The Amazon name is "+ref.name);
System.out.println("The Amazon phonenumber is "+ref.phonenumber);
System.out.println("The Amazon password is "+ref.password);

Amazon anotherref = new Amazon();
anotherref.id = 2;
anotherref.name = "Akash";
anotherref.phonenumber = 9876543210L;
anotherref.password = "a@123";
System.out.println("The Amazon ref id is "+anotherref.id);
System.out.println("The Amazon name is "+anotherref.name);
System.out.println("The Amazon phonenumber is "+anotherref.phonenumber);
System.out.println("The Amazon password is "+anotherref.password);
}
}
