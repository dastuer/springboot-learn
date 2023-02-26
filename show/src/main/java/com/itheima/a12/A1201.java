package com.itheima.a12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A1201 {
    interface Foo{
        void foo();
        int bar();
    }
    static class Target implements Foo{

        @Override
        public void foo() {
            System.out.println("target foo");
        }

        @Override
        public int bar() {
            System.out.println("target bar");
            return 0;
        }

        interface InvocationHandler{
            Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException;
        }

        public static void main(String[] args) {
            Target target = new Target();
            $Proxy1 $Proxy1 = new $Proxy1((proxy, method, args1) -> {
                System.out.println("before");
                Object result = method.invoke(target, args1);
                System.out.println("after");
                return result;
            });
            $Proxy1.bar();

        }
    }
}
