package sk.itsovy.projectstrategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num){
        return strategy.doOperation(num);
    }
}
