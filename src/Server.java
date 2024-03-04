import RemoteService.Calculator;
import RemoteService.CalculatorInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Server {
    public static void main(String[] args) {
        try {
            Calculator server = new Calculator();
            CalculatorInterface stub = (CalculatorInterface) UnicastRemoteObject.exportObject(server, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Calculator", stub);
            System.out.println("Server ready");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    }


