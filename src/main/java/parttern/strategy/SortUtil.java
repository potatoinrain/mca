package parttern.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class SortUtil<T> {

    public void sort(T[] arr, Comparator<T> comparator){
//        comparator.compare()
        Arrays.sort(arr, comparator);
    }

}

class CatS1{
    int weight;
    int height;
}

class DogS1 {
    int weight;
}


