class Factory {
    String name;
    String location;
    int employees;
    double area;
    double annualRevenue;
    boolean isAutomated;


    Factory() {
        this("Generic Factory");
        System.out.println("Constructor with No parameters");
    }


    Factory(String name) {
        this(name, "Unknown");
        System.out.println("Constructor with Name initialized");
    }


    Factory(String name, String location) {
        this(name, location, 100);
        System.out.println("Constructor with Name and Location initialized");
    }


    Factory(String name, String location, int employees) {
        this(name, location, employees, 1000.0);
        System.out.println("Constructor with Name, Location, and Employees initialized");
    }


    Factory(String name, String location, int employees, double area) {
        this(name, location, employees, area, 5000000.0);
        System.out.println("Constructor with Name, Location, Employees, and Area initialized");
    }


    Factory(String name, String location, int employees, double area, double annualRevenue) {
        this(name, location, employees, area, annualRevenue, false);
        System.out.println("Constructor with Name, Location, Employees, Area, and Annual Revenue initialized");
    }


    Factory(String name, String location, int employees, double area, double annualRevenue, boolean isAutomated) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.area = area;
        this.annualRevenue = annualRevenue;
        this.isAutomated = isAutomated;
        System.out.println("Constructor with All variables initialized");
    }


    public void display() {
        System.out.println("Factory name is " + name);
        System.out.println("Factory location is " + location);
        System.out.println("Number of employees is " + employees);
        System.out.println("Factory area is " + area + " sq meters");
        System.out.println("Annual revenue is " + annualRevenue);
        System.out.println("Is automated: " + isAutomated);
    }
}
