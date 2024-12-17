package A11_ATM;

public abstract class ATMState {
    public ATM atmObject;

    public abstract void insertCard(ATM atm, ATMCard card);

    public abstract void authenticatePin(ATM atm, ATMCard card, int pin);

    public abstract void selectOperation(ATM atm, ATMCard card, TransactionType tType);

    public abstract void cashWithdrawal(ATM atm, ATMCard card, int withdrawAmount);

    public abstract void displayBalance(ATM atm, ATMCard card);

    public abstract void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount);

    public abstract void returnCard();

    public abstract void exit(ATM atm);

}

class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void authenticatePin(ATM atm, ATMCard card, int pin) {
        // definition
    }

    @Override
    public void selectOperation(ATM atm, ATMCard card, TransactionType tType) {
        // definition
    }

    @Override
    public void cashWithdrawal(ATM atm, ATMCard card, int withdrawAmount) {
        // definition
    }

    @Override
    public void displayBalance(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

class HasCardState extends ATMState {

    @Override
    public void insertCard(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void authenticatePin(ATM atm, ATMCard card, int pin) {
        // definition
    }

    @Override
    public void selectOperation(ATM atm, ATMCard card, TransactionType tType) {
        // definition
    }

    @Override
    public void cashWithdrawal(ATM atm, ATMCard card, int withdrawAmount) {
        // definition
    }

    @Override
    public void displayBalance(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

class SelectOperationState extends ATMState {

    @Override
    public void insertCard(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void authenticatePin(ATM atm, ATMCard card, int pin) {
        // definition
    }

    @Override
    public void selectOperation(ATM atm, ATMCard card, TransactionType tType) {
        // definition
    }

    @Override
    public void cashWithdrawal(ATM atm, ATMCard card, int withdrawAmount) {
        // definition
    }

    @Override
    public void displayBalance(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

class CheckBalanceState extends ATMState {

    @Override
    public void insertCard(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void authenticatePin(ATM atm, ATMCard card, int pin) {
        // definition
    }

    @Override
    public void selectOperation(ATM atm, ATMCard card, TransactionType tType) {
        // definition
    }

    @Override
    public void cashWithdrawal(ATM atm, ATMCard card, int withdrawAmount) {
        // definition
    }

    @Override
    public void displayBalance(ATM atm, ATMCard card) {
        System.out.println("Your Balance is: " + card.getBankBalance());
        exit(atm);
    }

    @Override
    public void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

class CashWithdrawalState extends ATMState {

    @Override
    public void insertCard(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void authenticatePin(ATM atm, ATMCard card, int pin) {
        // definition
    }

    @Override
    public void selectOperation(ATM atm, ATMCard card, TransactionType tType) {
        // definition
    }

    @Override
    public void cashWithdrawal(ATM atm, ATMCard card, int withdrawalAmountRequest) {
        if (atmObject.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if (card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {

            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new FiveHundredWithdrawProcessor(new TwoHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atmObject, withdrawalAmountRequest);
            exit(atmObject);
        }

    }

    @Override
    public void displayBalance(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }
}

public class TransferMoneyState extends ATMState {

    @Override
    public void insertCard(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void authenticatePin(ATM atm, ATMCard card, int pin) {
        // definition
    }

    @Override
    public void selectOperation(ATM atm, ATMCard card, TransactionType tType) {
        // definition
    }

    @Override
    public void cashWithdrawal(ATM atm, ATMCard card, int withdrawAmount) {
        // definition
    }

    @Override
    public void displayBalance(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}
