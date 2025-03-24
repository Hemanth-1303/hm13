class Movierunner{
public static void main(String args[]){
System.out.println("main started");
Movie.theatre();
Theatre.screening();
Screening.customer();
Customer.payment();
Payments.ticket();
System.out.println("main ended");
}
}
