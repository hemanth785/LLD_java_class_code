package Vending_Machine;

public class State {

  // State is an interface
  public interface State {
    // Interface method (does not have a body)
    public void insertMoney(VendingMachine machine, double amount);
    public void pressButton(VendingMachine machine, int rackNumber);
    public void returnChange(double amount);
    public void updateInventory(VendingMachine machine, int rackNumber);
    public void dispenseProduct(VendingMachine machine, int rackNumber);
  }

  public class NoMoneyInsertedState implements State {
    @override
    public void insertMoney(VendingMachine machine, double amount) {
      // changes state to MonenInsertedState
    }
    public void pressButton(VendingMachine machine, int rackNumber) {}
    public void returnChange(double amount) {}
    public void updateInventory(VendingMachine machine, int rackNumber) {}
    public void dispenseProduct(VendingMachine machine, int rackNumber) {}
  }

  public class MoneyInsertedState implements State {
    @override
    public void insertMoney(VendingMachine machine, double amount) {}
    public void pressButton(VendingMachine machine, int rackNumber) {
        // check if product item is available
        // validate money and compare it with product price
        // change state to DispenseState 
    }
    public void returnChange(double amount) {}
    public void updateInventory(VendingMachine machine, int rackNumber) {}
    public void dispenseProduct(VendingMachine machine, int rackNumber) {}
  }

  public class DispenseState implements State {
    @override
    public void insertMoney(VendingMachine machine, double amount) {}
    public void pressButton(VendingMachine machine, int rackNumber) {}
    public void returnChange(double amount){}
    public void updateInventory(VendingMachine machine, int rackNumber) {}
    public void dispenseProduct(VendingMachine machine, int rackNumber) {
        // dispense product
        // change state to NoMoneyInsertedState
    }
  }
}
