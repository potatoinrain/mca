package mult_thread.concurrent.tool;

import java.lang.ref.WeakReference;
import java.util.HashMap;

public class T_WeakReference {

    public static void main(String[] args) {
        WeakReference<M> m = new WeakReference<>(new M());
//
////        System.out.println(m.get());
////        M n = m.get();
////        System.gc();
////        System.out.println(m.get());
//
////        n = null;
////        System.gc();
//        System.out.println(m.get());
//
//        HashMap<WeakReference<M>, String> map = new HashMap();
//        map.put(m, "abc");
////        n = null;
//        System.gc();
//        System.out.println(map.keySet().toArray()[0]);
//        System.out.println(map.values().toArray()[0]);
//
//        ThreadLocal<M> tl = new ThreadLocal<>();
//        tl.set(new M());
//        tl.remove();

        HashMap<WeakReference<M>, M> map = new HashMap<>();


    }

}
