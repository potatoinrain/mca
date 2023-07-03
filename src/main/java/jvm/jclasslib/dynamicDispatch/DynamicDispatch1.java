package jvm.jclasslib.dynamicDispatch;

public class DynamicDispatch1 {

    private int i;

    static class Parent{
        public void sayHello(){
            System.out.println("Parent");
        }
    }
    static class Child1 extends Parent {
        public void sayHello(){
            System.out.println("Child1");
        }
    }
    static class Child2 extends Parent {
        public void sayHello(){
            System.out.println("Child2");
        }
    }
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parent1 = new Child1();
        Parent parent2 = new Child2();

        parent.sayHello();
        parent1.sayHello();
        parent2.sayHello();
    }
}

