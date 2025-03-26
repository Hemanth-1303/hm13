class House {
    String type;
    int rooms;
    int area;
    String location;
    double price;
    boolean hasGarden;


    House() {
        this("Apartment");
        System.out.println("Constructor with No parameters");
    }

  
    House(String type) {
        this(type, 2);
        System.out.println("Constructor with Type initialized");
    }


    House(String type, int rooms) {
        this(type, rooms, 120);
        System.out.println("Constructor with Type and Rooms initialized");
    }

    House(String type, int rooms, int area) {
        this(type, rooms, area, "Unknown");
        System.out.println("Constructor with Type, Rooms, and Area initialized");
    }


    House(String type, int rooms, int area, String location) {
        this(type, rooms, area, location, 500000.0);
        System.out.println("Constructor with Type, Rooms, Area, and Location initialized");
    }


    House(String type, int rooms, int	area, String location, double price) {
        this(type, rooms, area, location, price, false);
        System.out.println("Constructor with Type, Rooms, Area, Location, and Price initialized");
    }


    House(String type, int rooms, int area, String location, double price, boolean hasGarden) {
        this.type = type;
        this.rooms = rooms;
        this.area = area;
        this.location = location;
        this.price = price;
        this.hasGarden = hasGarden;
        System.out.println("Constructor with All variables initialized");
    }


    public void display() {
        System.out.println("House type is " + type);
        System.out.println("Number of rooms is " + rooms);
        System.out.println("Total area is " + area + " sq meters");
        System.out.println("Location is " + location);
        System.out.println("Price is " + price);
        System.out.println("Has garden: " + hasGarden);
    }
}
