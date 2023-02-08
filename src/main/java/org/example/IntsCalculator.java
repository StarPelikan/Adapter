package org.example;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int art1) {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(art1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int art1) {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(art1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int arg0, int art1) {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(art1)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}