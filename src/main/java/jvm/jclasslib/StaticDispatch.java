package jvm.jclasslib;

public class StaticDispatch {

    static class Parent{}
    static class Child1 extends Parent{}
    static class Child2 extends Parent{}

    public void sayHello(Parent parent){
        System.out.println("parent sayHello");
    }
    public void sayHello(Child1 child1){
        System.out.println("child1 sayHello");
    }
    public void sayHello(Child2 child2){
        System.out.println("child2 sayHello");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parent1 = new Child1();
        Parent parent2 = new Child2();

        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(parent);
        staticDispatch.sayHello(parent1);
        staticDispatch.sayHello(parent2);
        staticDispatch.sayHello((Child2)parent2);
    }
}

