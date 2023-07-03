package parttern.strategy;

public class Sorter {

    public static void sort(Object[] arr, SorterStrategy strategy){

    }

    public static void sort(int[] arr){

    }

    public static void sort(long[] arr){

    }


}

class Cat implements Comparable<Cat> {
    public Integer age;
    public Cat(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return age.compareTo(o.age);
    }
}
class Cat1 {
    public Integer age;
    public Cat1(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat1{" +
                "age=" + age +
                '}';
    }

}