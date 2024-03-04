package RemoteService;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote {
   float add(float op1,float op2) throws RemoteException;
    float subtract(float op1, float op2) throws RemoteException;
   float multiply(float op1,float op2) throws RemoteException;

    float divide(float op1, float op2)throws RemoteException;

    double power(double op1, double op2)throws RemoteException;
}
