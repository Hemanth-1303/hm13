class Paper {
    String type;
    double thickness;
    String color;
    String origin;
    double price;
    boolean recycled;

    Paper() {
        this("A4");
        System.out.println("Constructor with No parameters");
    }


    Paper(String type) {
        this(type, 0.1);
        System.out.println("Constructor with Type initialized");
    }


    Paper(String type, double thickness) {
        this(type, thickness, "White");
        System.out.println("Constructor with Type and Thickness initialized");
    }


    Paper(String type, double thickness, String color) {
        this(type, thickness, color, "India");
        System.out.println("Constructor with Type, Thickness, and Color initialized");
    }


    Paper(String type, double thickness, String color, String origin) {
        this(type, thickness, color, origin, 50.0);
        System.out.println("Constructor with Type, Thickness, Color, and Origin initialized");
    }


    Paper(String type, double thickness, String color, String origin, double price) {
        this(type, thickness, color, origin, price, true);
        System.out.println("Constructor with Type, Thickness, Color, Origin, and Price initialized");
    }


    Paper(String type, double thickness, String color, String origin, double price, boolean recycled) {
        this.type = type;
        this.thickness = thickness;
        this.color = color;
        this.origin = origin;
        this.price = price;
        this.recycled = recycled;
        System.out.println("Constructor with All variables initialized");
    }


    public void display() {
        System.out.println("Paper type is " + type);
        System.out.println("Paper thickness is " + thickness);
        System.out.println("Paper color is " + color);
        System.out.println("Paper origin is " + origin);
        System.out.println("Paper price is " + price);
        System.out.println("Paper is recycled " + recycled);
    }
}
