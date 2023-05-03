package src;

/*
 * CreditAvailableState for VendingMachine 
 */
public class CreditAvailableState implements VendingMachineState {
    public VendingMachineState insertMoney() {
        System.out.println("* Credit already issued. Select an item.");
        return this;
    }
    
    public VendingMachineState selectItem() {
        System.out.println("* Item selected. Vending.");
        return new ItemAvailableState();
    }
    
    public VendingMachineState retrieveItem() {
        System.out.println("* No item to retrieve.");
        return this;
    }

    public void quit() {
        System.out.println("* You walked away from the vending machine with credit on the machine.");
    }

    public void printStatus() {
        System.out.println("Status: CreditAvailableState");
    }
}