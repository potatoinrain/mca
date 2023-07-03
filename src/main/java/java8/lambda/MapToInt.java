package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapToInt {

    //mapToInt会将stream转化为intstream
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        Object[] arr1 = list.stream()
                .map(Integer::intValue)
                .toArray();
    }

}
