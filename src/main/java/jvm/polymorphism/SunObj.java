package jvm.polymorphism;

public class SunObj extends  BaseObj{

    public static void main(String[] args) {
        BaseObj bo = new SunObj();
        SunObj so = new SunObj();
        System.out.println(bo.getClass());
        System.out.println(so.getClass());
    }


}
