package RemoteService;

import java.util.Optional;

import static java.lang.Math.pow;

public class Calculator implements CalculatorInterface {

    @Override
    public float add(float op1, float op2) {
        return op1+op2;
    }

    @Override
    public float subtract(float op1,float op2) {
        return op1-op2;
    }

    @Override
    public float multiply(float op1,float op2) {
        return op1*op2;
    }

    @Override
    public float divide(float op1, float op2) {
        return op2==0?Float.NaN: op1/op2;
    }

    @Override
    public double power(double op1, double op2) {
        return pow(op1,op2);
    }
}
