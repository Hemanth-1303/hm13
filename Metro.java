class Metro {
    String name;
    String city; 
    int numberOfCars; 
    double length;
    int capacity; 
    boolean isElectric; 

    
    Metro() {
        this("Unnamed Metro");
        System.out.println("Constructor 1: No parameters");
    }

    
    Metro(String name) {
        this(name, "Unknown City");
        System.out.println("Constructor 2: Name initialized");
    }

    
    Metro(String name, String city) {
        this(name, city, 4); 
        System.out.println("Constructor 3: Name and City initialized");
    }

    
    Metro(String name, String city, int numberOfCars) {
        this(name, city, numberOfCars, 20.0); 
        System.out.println("Constructor 4: Name, City, and Number of Cars initialized");
    }

    
    Metro(String name, String city, int numberOfCars, double length) {
        this(name, city, numberOfCars, length, 500); 
        System.out.println("Constructor 5: Name, City, Number of Cars, and Length initialized");
    }

    
    Metro(String name, String city, int numberOfCars, double length, int capacity) {
        this(name, city, numberOfCars, length, capacity, true); 
        System.out.println("Constructor 6: Name, City, Number of Cars, Length, and Capacity initialized");
    }

    
    Metro(String name, String city, int numberOfCars, double length, int capacity, boolean isElectric) {
        this.name = name;
        this.city = city;
        this.numberOfCars = numberOfCars;
        this.length = length;
        this.capacity = capacity;
        this.isElectric = isElectric;
        System.out.println("Constructor 7: All variables initialized");
    }

    void display() {
        System.out.println("Name: " + name + ", City: " + city + ", Number of Cars: " + numberOfCars +
                ", Length: " + length + "km, Capacity: " + capacity + " passengers, Electric: " + isElectric);
    }
}
