package A11_ATM;

import java.util.Date;

public class ATMCard {
    private String cardNumber;
    private String customerName;
    private Date cardExpiryDate;
    private int PIN_NUMBER = 112211;
    private BankAccount bankAccount;

    public boolean isCorrectPINEntered(int pin) {
        if (pin == PIN_NUMBER) {
            return true;
        }
        return false;
    }

    public int getBankBalance(){
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount){
        bankAccount.withdrawAmount(amount);
    }


}
