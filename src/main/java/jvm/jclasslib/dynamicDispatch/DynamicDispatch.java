package jvm.jclasslib.dynamicDispatch;

public class DynamicDispatch {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parent1 = new Child1();
        Parent parent2 = new Child2();

        parent.sayHello();
        parent1.sayHello();
        parent2.sayHello();
    }
}