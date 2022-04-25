package javaTraining;

public class Operation2 extends Car implements Operation{
    int x;

    @Override
    public int sum(int n1, int n2) {
        return n1+n2*2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1-n2*2;
    }

    @Override
    public double div(int n1, int n2) {
        return n1/n2*2;
    }

    @Override
    public int mul(int n1, int n2) {
        return n1*n2*2;
    }
}
