package src;
import src.VendingMachine;
import java.util.Scanner;

/*
 * Demo.java
 */
public class Demo {
    /**
     * Runs the demo program.
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*-------------------------------------------*");
        System.out.println("|Starting Vending Machine State Pattern Demo|");
        System.out.println("*-------------------------------------------*");


        VendingMachine vm = new VendingMachine();
        Scanner scan = new Scanner(System.in);	
        boolean done = false;
        int selection = 0;

		while (!done) {
			try {
                System.out.println("");
				System.out.println("Choose an action");
                System.out.println("   0: quit");
                System.out.println("   1: insert money");
                System.out.println("   2: select item");
                System.out.println("   3: retrieve item");

				selection = scan.nextInt(); 

                switch (selection) {
                    case 0:
                        System.out.println("");
                        vm.quit(); 
                        System.out.println("");
                        done = true;
                        break;

                    case 1:
                        System.out.println("");
                        vm.insertMoney(); 
                        break;

                    case 2:
                        System.out.println("");
                        vm.selectItem(); 
                        break;

                    case 3:
                        System.out.println("");
                        vm.retrieveItem(); 
                        break;

                    default:
                        System.out.println("");
				        System.out.println("Incorrect input. Type a number 0-3");
                        break;
                }
			} 
			catch (Exception e) {
				System.out.println("\nIncorrect input. Type a number between 0 and 3.");
				scan.nextLine();
			}	
		}
    }
}
