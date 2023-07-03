package parttern.strategy;

import java.util.*;

public class SorterTest {

    public static void intSort() {
        Integer[] array = {10, 3, 6, 1, 4, 5, 9};
        //正序排序
        Arrays.sort(array);//会检查数组个数大于286且连续性好就使用归并排序，若小于47使用插入排序，其余情况使用双轴快速排序

        System.out.println("升序排序：");
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        for (int num : list) {
            System.out.println(num);
        }
    }

    public static void catSort(){
        Cat[] array = {new Cat(5), new Cat(3), new Cat(1), new Cat(2)};
        Arrays.sort(array);

        System.out.println("升序  排序：");
        List<Cat> list = Arrays.asList(array);
        Collections.reverse(list);
        for (Cat obj : list) {
            System.out.println(obj);
        }
    }

    public static void catCollectionsSort(){
        Cat[] array = {new Cat(5), new Cat(3), new Cat(1), new Cat(2)};
        Collections.sort(Arrays.asList(array), new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.age.compareTo(o2.age);
            }
        });

        System.out.println("升序  排序：");
        List<Cat> list = Arrays.asList(array);
//        Collections.reverse(list);
        for (Cat obj : list) {
            System.out.println(obj);
        }
    }

    public static void catCollectionsSortLambda(){
        Cat[] array = {new Cat(5), new Cat(3), new Cat(1), new Cat(2)};
        Collections.sort(Arrays.asList(array), (o1, o2 ) -> {
            return o1.age.compareTo(o2.age);
        });
        System.out.println("升序  排序：");
        List<Cat> list = Arrays.asList(array);
//        Collections.reverse(list);
        for (Cat obj : list) {
            System.out.println(obj);
        }
    }

    public static void catCollectionsSortLambda1(){
        Cat[] array = {new Cat(5), new Cat(3), new Cat(1), new Cat(2)};
        Collections.sort(Arrays.asList(array), Comparator.comparing(o -> o.age));
        System.out.println("升序  排序：");
        List<Cat> list = Arrays.asList(array);
//        Collections.reverse(list);
        for (Cat obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        catCollectionsSortLambda();
    }

}
