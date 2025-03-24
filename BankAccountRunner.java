class BankAccountRunner{
public static void main(String args[]){
System.out.println("Main started");
BankAccount.getBalance();
BankAccount.credit(300.00);
BankAccount.getBalance();
BankAccount.debit(300.00);
BankAccount.getBalance();
BankAccount.credit(50.0);

System.out.println("Main ended");
}
}