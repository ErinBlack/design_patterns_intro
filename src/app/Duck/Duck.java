package app;
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {
        quackbBehavior.quack();
    }

    public void swim(){
        System.out.printIn("All ducks float, even decoys!");
    }
}