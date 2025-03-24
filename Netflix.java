class Netflix{
static String hindiSeries[] =  {"Sacred Games"," Mirzapur"," Asur: Welcome to Your Dark Side","Special OPS"," Inside Edge","Undekhi"," Panchayat","Avrodh: The Siege Within","Mafia","The Family Man"};

static String kannadaSeries[] = {"Ekam","The Hunt for Veerappan"," Nandhini","Honeymoon","Game","Hara Hara Mahadeva","Mukta Mukta"," Nigooda Raatri"," Humble Politiciann Nograj"," Majaa Talkies"};

static String malayalamMovies[] = {"Rekhachithram","Officer on Duty","Dominic and the Ladies Purse"," Get-Set Baby!","Daveed","Bromance","Painkili","Ponman"," Pravinkoodu Shappu","Identity"};

static String englishSeries[] = {" Breaking Bad"," Planet Earth II"," Planet Earth","Band of Brothers","Chernobyl","The Wire","Avatar","Blue Planet II","The Sopranos","Game of Thrones"};


public static void main(String args[]){
System.out.println("start of main");
getSeries();
System.out.println("end of main");
}

public static void getSeries(){
System.out.println("start of address");
for(String HindiSeries : hindiSeries){
System.out.println("The Hindi series are "+HindiSeries);
}

for(String KannadaSeries : kannadaSeries){
System.out.println("The kannada series are "+KannadaSeries);
}

for(String MalayalamMovies : malayalamMovies){
System.out.println("The malayalam movies are "+MalayalamMovies);
}

for(String EnglishSeries : englishSeries){
System.out.println("The English series are "+EnglishSeries);
}


System.out.println("end of address");
}
}