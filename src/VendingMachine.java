package src;

/* 
 * VendingMachine class
 * 
 * Has three states:
 *  1. Idle
 *  2. CreditAvailable
 *  3. ItemAvailable
 * 
 */
public class VendingMachine {
    private VendingMachineState state = new IdleState();

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public VendingMachineState getState() {
        return state;
    }

    public void insertMoney() {
        setState(state.insertMoney());
    }
    
    public void selectItem() {
        setState(state.selectItem());
    }

    public void retrieveItem() {
        setState(state.retrieveItem());
    }

    public void quit() {
        state.quit();
    }

    public void printStatus() {
        state.printStatus();
    }
}
