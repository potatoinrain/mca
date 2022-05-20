package mult_thread.interrupt;


public class VolatileInterupt {

    public static volatile boolean runable = true;
    public static volatile int i = 0;


    public static void main(String[] args) throws Exception{
        Thread t = new Thread(() ->{
            while(runable){
                i++;
                System.out.println("T.i:" + i + "| runable ： " + runable);
            }
        });

        t.start();

        while(true){
            if(i == 100){
                System.out.println(i);
                runable = false;
                System.out.println(i);
                break;
            }
        }
        System.out.println(i);


    }

}
