class Wire {
    String material;
    double length;
    double diameter;
    String insulationType;
    double price;
    boolean isFlexible;

   
    Wire() {
        this("Copper");
        System.out.println("Constructor with No parameters");
    }

    
    Wire(String material) {
        this(material, 1.0);
        System.out.println("Constructor with Material initialized");
    }


    Wire(String material, double length) {
        this(material, length, 0.5);
        System.out.println("Constructor with Material and Length initialized");
    }

   
    Wire(String material, double length, double diameter) {
        this(material, length, diameter, "PVC");
        System.out.println("Constructor with Material, Length, and Diameter initialized");
    }

   
    Wire(String material, double length, double diameter, String insulationType) {
        this(material, length, diameter, insulationType, 100.0);
        System.out.println("Constructor with Material, Length, Diameter, and InsulationType initialized");
    }


    Wire(String material, double length, double diameter, String insulationType, double price) {
        this(material, length, diameter, insulationType, price, true);
        System.out.println("Constructor with Material, Length, Diameter, InsulationType, and Price initialized");
    }

    
    Wire(String material, double length, double diameter, String insulationType, double price, boolean isFlexible) {
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.insulationType = insulationType;
        this.price = price;
        this.isFlexible = isFlexible;
        System.out.println("Constructor with All variables initialized");
    }

   
    public void display() {
        System.out.println("Wire material is " + material);
        System.out.println("Wire length is " + length);
        System.out.println("Wire diameter is " + diameter);
        System.out.println("Wire insulation type is " + insulationType);
        System.out.println("Wire price is " + price);
        System.out.println("Wire is flexible: " + isFlexible);
    }
}
