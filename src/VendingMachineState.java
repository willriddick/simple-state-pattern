package src;

/*
 * VendingMachineState interface
 */
public interface VendingMachineState {
    public VendingMachineState insertMoney();
    public VendingMachineState selectItem();
    public VendingMachineState retrieveItem();
    public void quit();
    public void printStatus();
}