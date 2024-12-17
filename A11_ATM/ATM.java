package A11_ATM;

public class ATM {
    //TODO: Ideally we should have singleton implementation of ATM Class

    private static ATM atmObject = new ATM(); //Singleton
    private ATMState currentATMState;
    private int atmBalance;
    private int noOfFiveHundredBills;
    private int noOfTwoHundredBills;
    private int noOfOneHundredBills;

    // References to various ATM components
    private CardReader cardReader;
    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Screen screen;
    private Printer printer;


    public void initializeATM(int atmBalance, int noOfFiveHundredBills, int noOfTwoHundredBills, int noOfOneHundredBills){
        currentATMState = new IdleState();
    }

    public int getAtmBalance(){
        return 10000;
    }

    public int deductATMBalance(int amount){
        //TODO:
        return 100;
    }

    public int getNoOfFiveHundredNotes(){
        return this.noOfFiveHundredBills;
    }

    public int getNoOfTwoHundredNotes(){
        return this.noOfTwoHundredBills;
    }

    public int getNoOfOneHundredNotes(){
        return this.noOfOneHundredBills;
    }

    public void deductFiveHundredNotes(int count){
        noOfFiveHundredBills = noOfFiveHundredBills - count;
    }

    public void deductTwoHundredNotes(int count){
        noOfTwoHundredBills = noOfTwoHundredBills - count;
    }

    public void deductOneHundredNotes(int count){
        noOfOneHundredBills = noOfOneHundredBills - count;
    }


}



class ATMRoom {
    private ATM atm;
    private User user;
}


class CardReader {
    public boolean readCard(){
        return true;
    }
}

class CashDispenser {
    public boolean dispenseCash(){
        return true;
    }
}

class Keypad {
    public String getInput(){
        return "";
    }
}

class Screen {
    public void showMessage(){
    }
}

class Printer {
    public void printReceipt(){
    }
}