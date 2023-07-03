package jvm.jclasslib;


public class HelloJClasslib {


    public HelloJClasslib(int ii) {

    }

    private HelloJClasslib(int ii, int jj) {

    }

    private HelloJClasslib(int ii, int jj, int jj1, int jjs) {

    }

    private HelloJClasslib(String ii, long jj, int jj2) {

    }

    public void helloMethod() {
        int i = 2;
        System.out.println(i);
        method2();
        System.out.println(2);
        method3();
    }

    public void helloMethod1() {
        method2();
    }

    public void helloMethod2() {
        method3();
    }

    public static void method2() {
        int i = 2;
        System.out.println(i);
    }

    public void method3() {
        int i = 2;
        System.out.println(i);
    }


}
