package others.systemapi;

/**
 * @author yangyu
 * @date 2022年06月23日 12:23
 */
public class helloIdentityHashCode {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.hashCode());
        System.out.println(System.identityHashCode(o));
    }
}
