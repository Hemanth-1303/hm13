class Road {
    String name;
    int length; 
    int lanes;
    String surfaceType;
    boolean tollRoad; 
    double maintenanceCost; 

    
    Road() {
        this("Unnamed Road");
        System.out.println("Constructor 1: No parameters");
    }

    Road(String name) {
        this(name, 5);
        System.out.println("Constructor 2: Name initialized");
    }

   
    Road(String name, int length) {
        this(name, length, 2);
        System.out.println("Constructor 3: Name and Length initialized");
    }

    
    Road(String name, int length, int lanes) {
        this(name, length, lanes, "Asphalt");
        System.out.println("Constructor 4: Name, Length, and Lanes initialized");
    }

    
    Road(String name, int length, int lanes, String surfaceType) {
        this(name, length, lanes, surfaceType, false);
        System.out.println("Constructor 5: Name, Length, Lanes, and SurfaceType initialized");
    }

    
    Road(String name, int length, int lanes, String surfaceType, boolean tollRoad) {
        this(name, length, lanes, surfaceType, tollRoad, 100000.0);
        System.out.println("Constructor 6: Name, Length, Lanes, SurfaceType, and TollRoad initialized");
    }

    
    Road(String name, int length, int lanes, String surfaceType, boolean tollRoad, double maintenanceCost) {
        this.name = name;
        this.length = length;
        this.lanes = lanes;
        this.surfaceType = surfaceType;
        this.tollRoad = tollRoad;
        this.maintenanceCost = maintenanceCost;
        System.out.println("Constructor 7: All variables initialized");
    }

    void display() {
        System.out.println("Name: " + name + ", Length: " + length + "km, Lanes: " + lanes +
                ", Surface Type: " + surfaceType + ", Toll Road: " + tollRoad +
                ", Maintenance Cost: Rs" + maintenanceCost + "/year");
    }
}
