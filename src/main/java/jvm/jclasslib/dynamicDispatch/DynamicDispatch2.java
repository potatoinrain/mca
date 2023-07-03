package jvm.jclasslib.dynamicDispatch;

public class DynamicDispatch2 {
    public static void main(String[] args) {
        Father object = new Son();
        object.override();
    }
}

class Father {
    public void override() {
        System.out.println("get father method");
    }
}

class Son extends Father {
    public void override() {
        System.out.println("get son method");
    }
}
