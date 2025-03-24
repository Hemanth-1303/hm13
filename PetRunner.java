class PetRunner{
public static void main(String args[]){
Pet pet = new Pet();
pet.id = 1;
pet.name = "Labrador";
pet.gender = "male";
pet.age = 10;
pet.price = 6000.00;
System.out.println("the pet id is "+pet.id);
System.out.println("the pet name is "+pet.name);
System.out.println("the pet gender is "+pet.gender);
System.out.println("the pet age is "+pet.age);
System.out.println("the pet price is "+pet.price);

Pet pet1 = new Pet();
pet.id = 2;
pet.name = "Golden Retriever";
pet.gender = "male";
pet.age = 8;
pet.price = 10000.00;
System.out.println("the pet id is "+pet.id);
System.out.println("the pet name is "+pet.name);
System.out.println("the pet gender is "+pet.gender);
System.out.println("the pet age is "+pet.age);
System.out.println("the pet price is "+pet.price);

Pet pet2 = new Pet();
pet.id = 3;
pet.name = "German Shephard";
pet.gender = "female";
pet.age = 11;
pet.price = 15000.00;
System.out.println("the pet id is "+pet.id);
System.out.println("the pet name is "+pet.name);
System.out.println("the pet gender is "+pet.gender);
System.out.println("the pet age is "+pet.age);
System.out.println("the pet price is "+pet.price);
}
}
