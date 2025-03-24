class BigBasket{
static String vegetables[] = {"capsicum","carrot","cauliflower","Coriander Leaves","onion","potato","cucumber","lady's finger","Broccoli ","beetroot"};
static String biscuits[] = {"Good day","jeera cookies","Bourbon","Oreo","Nurtichoice","Marie gold","Parle-G","Dark fanstacy","Hide & sick","Jim Jam"};
static String beverages[] = {"Frooti","Mazza","Pepsi","Coca cola","Mirinda","Paper boat","Red bull","Sprite","Mountain Dew","Bindu"};
static String snacks[] = {"Butter Murukku","Moong Dal Namkeen","Khatta Meetha","Lays","Nacho chips","Uncle chips","Namkeen - Bhujia Sev","Masala Peanaut","Kaju salted",
"Bengaluru Special Mixture"};
static String perfumes[] = {"Wild stone","Park avenue","envy","Fogg","Plum","La'French","Villian","Wow touch","Lattafa","Inatur"};

public static void main(String args[]){
getItems();
}

public static void getItems(){
for(String Vegetables:vegetables){
System.out.println("The Vegetables Items available are :"+Vegetables);
}

for(String Biscuits:biscuits){
System.out.println("The Vegetables Items available are :"+Biscuits);
}

for(String Beverages:beverages){
System.out.println("The Beverages Items available are :"+Beverages);
}

for(String Snacks:snacks){
System.out.println("The Snacks Items available are :"+Snacks);
}

for(String Perfumes:perfumes){
System.out.println("The Perfumes Items available are :"+Perfumes);
}
}
}