package br.edu.uniavan.entities;

public abstract class Worker extends Person {
    protected Double basicIncome = 1000.0;

    public Worker() {}

    public Worker(String name) {
        super(name);
    }

    public double getIncome(){
        return basicIncome;
    }
}
