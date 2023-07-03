package jvm.t_reflect;

import jvm.T_User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class T_SimpleReflect {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println(T_User.class);
        System.out.println(T_User.class.getClassLoader());
        T_User u = new T_User();
        u.setNo(50);
        Class uClass = u.getClass();
        Field[] fields = uClass.getDeclaredFields();
        for (Field f : fields){

        }

        Method[] methods = uClass.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        Method getMethod = uClass.getDeclaredMethod("getNo");
        System.out.println(getMethod.invoke(u));


    }
}
