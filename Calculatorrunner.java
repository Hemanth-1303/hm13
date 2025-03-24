class calculatorRunner {
    public static void main(String[] args) {
    int addition = Calculator.add(134,58);
    
    System.out.println("addition of two numbers is : "+addition);

    int substraction = Calculator.substract(345,88);
    System.out.println("substraction two of numbers is : "+substraction);

  int multiplication = Calculator.multiplication(78,89);
  System.out.println("multiplication two of numbers is : "+multiplication);

  int division = Calculator.division(234,10);
  System.out.println("division of two numbers is : "+division);
    }
}
