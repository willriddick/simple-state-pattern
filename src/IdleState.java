package src;

/*
 * IdleState for VendingMachine 
 */
public class IdleState implements VendingMachineState {
    public VendingMachineState insertMoney() {
        System.out.println("* Money inserted, credit issued.");
        return new CreditAvailableState();
    }
    
    public VendingMachineState selectItem() {
        System.out.println("* You must add credit before selecting an item.");
        return this;
    }
    
    public VendingMachineState retrieveItem() {
        System.out.println("* No item to retrieve.");
        return this;
    }

    public void quit() {
        System.out.println("* You walked away from the vending machine.");
    }

    public void printStatus() {
        System.out.println("Status: IdleState");
    }
}