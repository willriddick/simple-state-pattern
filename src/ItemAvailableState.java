package src;

/*
 * ItemAvailableState for VendingMachine 
 */
public class ItemAvailableState implements VendingMachineState {
    public VendingMachineState insertMoney() {
        System.out.println("* Retrieve item before inserting money.");
        return this;
    }
    
    public VendingMachineState selectItem() {
        System.out.println("* Retrieve item before selecting new item.");
        return this;
    }
    
    public VendingMachineState retrieveItem() {
        System.out.println("* Item retrieved.");
        return new IdleState();
    }

    public void quit() {
        System.out.println("* You walked away from the vending machine without your item.");
    }

    public void printStatus() {
        System.out.println("Status: ItemAvailableState");
    }
}