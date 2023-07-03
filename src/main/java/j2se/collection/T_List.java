package j2se.collection;

import java.util.ArrayList;
import java.util.List;

public class T_List {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        int i = 3;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);
    }
}
