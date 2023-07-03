package jvm.load;

public class T_ClassLoadProduce {

    public static void main(String[] args) {
        System.out.println(T.i);
    }
    
}

class T{
    public static int i = 2;
    private static T t = new T();
    private T(){
        i++;
    }

}
