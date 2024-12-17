package A11_ATM;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public double getBalance(){
        return 20.0;
    }

    public boolean withdrawAmount(double amount){
        balance = balance - amount;
        return true;
    }
}

class SavingAccount extends BankAccount {
    public double withdrawLimit(){
        return 10000.0;
    }
}

class CurrentAccount extends BankAccount {
    public double withdrawLimit(){
        return 10000.0;
    }
}
