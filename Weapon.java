class Weapon {
    String name;
    String type; 
    int damage;
    double weight;
    int range;
    boolean isLegendary; 

    Weapon() {
        this("Ak47 Weapon");
        System.out.println("Constructor 1: No parameters");
    }

    Weapon(String name) {
        this(name, "Generic Type");
        System.out.println("Constructor 2: Name initialized");
    }

    Weapon(String name, String type) {
        this(name, type, 10);
        System.out.println("Constructor 3: Name and Type initialized");
    }

    Weapon(String name, String type, int damage) {
        this(name, type, damage, 5.0);
        System.out.println("Constructor 4: Name, Type, and Damage initialized");
    }

    Weapon(String name, String type, int damage, double weight) {
        this(name, type, damage, weight, 50);
        System.out.println("Constructor 5: Name, Type, Damage, and Weight initialized");
    }

   
    Weapon(String name, String type, int damage, double weight, int range) {
        this(name, type, damage, weight, range, false);
        System.out.println("Constructor 6: Name, Type, Damage, Weight, Range initialized");
    }

    
    Weapon(String name, String type, int damage, double weight, int range, boolean isLegendary) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.weight = weight;
        this.range = range;
        this.isLegendary = isLegendary;
        System.out.println("Constructor 7: All variables initialized");
    }

    void display() {
        System.out.println("Name: " + name + ", Type: " + type + ", Damage: " + damage +
                ", Weight: " + weight + "kg, Range: " + range + "m, Legendary: " + isLegendary);
    }
}
