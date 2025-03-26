class Glass {
    String type;
    double thickness;
    double transparency;
    String color;
    double price;
    boolean isFragile;

    
    Glass() {
        this("Window Glass");
        System.out.println("Constructor with No parameters");
    }

    
    Glass(String type) {
        this(type, 5.0);
        System.out.println("Constructor with Type initialized");
    }

    
    Glass(String type, double thickness) {
        this(type, thickness, 90.0);
        System.out.println("Constructor with Type and Thickness initialized");
    }

    
    Glass(String type, double thickness, double transparency) {
        this(type, thickness, transparency, "Clear");
        System.out.println("Constructor with Type, Thickness, and Transparency initialized");
    }

    
    Glass(String type, double thickness, double transparency, String color) {
        this(type, thickness, transparency, color, 150.0);
        System.out.println("Constructor with Type, Thickness, Transparency, and Color initialized");
    }

    
    Glass(String type, double thickness, double transparency, String color, double price) {
        this(type, thickness, transparency, color, price, true);
        System.out.println("Constructor with Type, Thickness, Transparency, Color, and Price initialized");
    }

    
    Glass(String type, double thickness, double transparency, String color, double price, boolean isFragile) {
        this.type = type;
        this.thickness = thickness;
        this.transparency = transparency;
        this.color = color;
        this.price = price;
        this.isFragile = isFragile;
        System.out.println("Constructor with All variables initialized");
    }


    public void display() {
        System.out.println("Glass type is " + type);
        System.out.println("Glass thickness is " + thickness + " mm");
        System.out.println("Glass transparency is " + transparency);
        System.out.println("Glass color is " + color);
        System.out.println("Price is " + price);
        System.out.println("Is fragile: " + isFragile);
    }
}
