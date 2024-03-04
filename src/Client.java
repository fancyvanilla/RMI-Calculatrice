import RemoteService.CalculatorInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import static java.lang.Float.NaN;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            CalculatorInterface stub = (CalculatorInterface) registry.lookup("Calculator");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Welcome to the Calculator App!\n" +
                        "To use the app, you can type 1 for addition," +
                        " 2 for subtraction, 3 for multiplication, " +
                        "4 for division, or 5 for power.\n");
                System.out.print("The operation code: ");
                int input = scanner.nextInt();

                System.out.print("Please, enter the two operands of your operation:\n");
                float op1 = scanner.nextFloat();
                float op2 = scanner.nextFloat();

                switch (input) {
                    case 1:
                        System.out.println("Result: " + stub.add(op1, op2));
                        break;

                    case 2:
                        System.out.println("Result: " + stub.subtract(op1, op2));
                        break;

                    case 3:
                        System.out.println("Result: " + stub.multiply(op1, op2));
                        break;

                    case 4:
                        float val = stub.divide(op1, op2);
                        if (!Float.isNaN(val)) {
                            System.out.println("Result: " + val);
                        } else {
                            System.out.println("You can't divide by 0!");
                        }
                        break;

                    case 5:
                        System.out.println("Result: " + stub.power(op1, op2));
                        break;

                    default:
                        System.out.println("Please enter a number between 1 and 5 to choose an operation!");
                        break;
                }

                System.out.println("If you want to exit, type #.");
                if (scanner.next().equals("#")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
