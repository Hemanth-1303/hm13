class UdupiGrand{
static String southIndian[] = {"Plain Dosa","Masala Dosa","Onion Dosa","Paneer Dosa","Butter Masala Dosa","Uttpam","Idli","Rice Bath","Pulav","Vada"};

static String  northIndian[] = {"Kaju Masala","Paneer Butter Masala","Mushroom Masala","Veg kadai","Veg Hydrabadi","Roti curry","Palak paneer","Daal fry","Tomato curry",
"Capsicum Masala"};

static String chinese[] = {"Gobi Manchuri","Gobi chilli","gobi 65","Paneer Manchuri","Paneer chilli","Baby corn manchuri","Veg spring roll","Mushroom manchuri","Paneer Soute","Veg Poonam dry"};

static String tandoori[]={"Roti","Butter roti","Kulcha","Naan","Parota","Butter naan","Alu parota","Butter Parota"};

static String rolls[] = {"Mix veg roll","Paneer roll","Chilli Paneer roll","Egg roll","Chicken Tikka roll","Paneer Tikka Roll","Egg roll"};

static String juice[] = {"Apple juice","Orange juice","Butter fruit","Papaya","Kiwi","Pineapple","Mango","Grape","Watermelon","Muskmelon"};



public static void main(String args[]){
getMenus();
}

public static void getMenus(){
for(String SouthIndian:southIndian){
System.out.println("The South Indian foods available are :"+SouthIndian);
}

for(String NorthIndian:northIndian){
System.out.println("The North Indian foods available are :"+NorthIndian);
}

for(String Chinese:chinese){
System.out.println("The Chinese foods available are :"+Chinese);
}

for(String Tandoori:tandoori){
System.out.println("The tandoori available are :"+Tandoori);
}

for(String Rolls:rolls){
System.out.println("The rolls available are :"+Rolls);
}

for(String Juice:juice){
System.out.println("The Juice available are :"+Juice);
}
}
}