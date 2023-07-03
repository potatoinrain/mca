package jvm.jclasslib;

public class VirutalDispatch {

    public void hello1(){
        hello2();
    }

    public void hello2(){
        hello3();
    }

    public void hello3(){
        System.out.println("hello3");
    }

    public static void main(String[] args) {
        VirutalDispatch virutalDispatch = new VirutalDispatch();
        virutalDispatch.hello1();
    }

}
