package mult_thread.synchronizedT;

/**
 * @author yangyu
 * @date 2022年06月15日 12:07
 */
public class T_StringEfficiency {


    //StringBuilder 和 StringBuffer 在效率上测试
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

        long l1 = System.currentTimeMillis();
        for(int i=0;i<1_0000_0000;i++){
            buffer.append("s");
        }
        long l2 = System.currentTimeMillis();

        System.out.println(l2-l1);
    }


}
