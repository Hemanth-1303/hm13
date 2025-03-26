class Switch {
    String type;
    int rating; 
    String color;
    String brand;
    double price;
    boolean isSmart;

 
    Switch() {
        this("Toggle Switch");
        System.out.println("Constructor with No parameters");
    }

  
    Switch(String type) {
        this(type, 10);
        System.out.println("Constructor with Type initialized");
    }

   
    Switch(String type, int rating) {
        this(type, rating, "White");
        System.out.println("Constructor with Type and Rating initialized");
    }

    Switch(String type, int rating, String color) {
        this(type, rating, color, "Generic");
        System.out.println("Constructor with Type, Rating, and Color initialized");
    }

   
    Switch(String type, int rating, String color, String brand) {
        this(type, rating, color, brand, 500.0);
        System.out.println("Constructor with Type, Rating, Color, and Brand initialized");
    }

   
    Switch(String type, int rating, String color, String brand, double price) {
        this(type, rating, color, brand, price, false);
        System.out.println("Constructor with Type, Rating, Color, Brand, and Price initialized");
    }


    Switch(String type, int rating, String color, String brand, double price, boolean isSmart) {
        this.type = type;
        this.rating = rating;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.isSmart = isSmart;
        System.out.println("Constructor with All variables initialized");
    }


    public void display() {
        System.out.println("Switch type is " + type);
        System.out.println("Switch rating is " + rating);
        System.out.println("Switch color is " + color);
        System.out.println("Switch brand is " + brand);
        System.out.println("Switch price is " + price);
        System.out.println("Is smart switch " + isSmart);
    }
}
