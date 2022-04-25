package javaTraining;

public class Operation1 implements Operation{
    @Override
    public int sum(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public double div(int n1, int n2) {
        return n1/n2;
    }

    @Override
    public int mul(int n1, int n2) {
        return n2*n2;
    }
}
