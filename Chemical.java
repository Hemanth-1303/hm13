class Chemical {
    String name;
    String formula;
    double molecularWeight;
    String state; 
    double price;
    boolean isHazardous;


    Chemical() {
        this("Water");
        System.out.println("Constructor with No parameters");
    }

    Chemical(String name) {
        this(name, "H2O");
        System.out.println("Constructor with Name initialized");
    }


    Chemical(String name, String formula) {
        this(name, formula, 18.015);
        System.out.println("Constructor with Name and Formula initialized");
    }


    Chemical(String name, String formula, double molecularWeight) {
        this(name, formula, molecularWeight, "Liquid");
        System.out.println("Constructor with Name, Formula, and Molecular Weight initialized");
    }


    Chemical(String name, String formula, double molecularWeight, String state) {
        this(name, formula, molecularWeight, state, 50.0);
        System.out.println("Constructor with Name, Formula, Molecular Weight, and State initialized");
    }


    Chemical(String name, String formula, double molecularWeight, String state, double price) {
        this(name, formula, molecularWeight, state, price, false);
        System.out.println("Constructor with Name, Formula, Molecular Weight, State, and Price initialized");
    }


    Chemical(String name, String formula, double molecularWeight, String state, double price, boolean isHazardous) {
        this.name = name;
        this.formula = formula;
        this.molecularWeight = molecularWeight;
        this.state = state;
        this.price = price;
        this.isHazardous = isHazardous;
        System.out.println("Constructor with All variables initialized");
    }


    public void display() {
        System.out.println("Chemical name is " + name);
        System.out.println("Chemical formula is " + formula);
        System.out.println("Molecular weight is " + molecularWeight);
        System.out.println("State is " + state);
        System.out.println("Price is " + price);
        System.out.println("Is hazardous: " + isHazardous);
    }
}
