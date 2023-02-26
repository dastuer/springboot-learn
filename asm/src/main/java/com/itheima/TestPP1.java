package com.itheima;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

public class TestPP1 {
    public static void main(String[] args) throws Exception {
        byte[] dump = $Proxy0Dump.dump();
        // try (FileOutputStream fos = new FileOutputStream("./$Proxy0.class")) {
        //     fos.write(dump);
        // }
        ClassLoader loader = new ClassLoader(){
            @Override
            protected Class<?> findClass(String s) {
                return super.defineClass(s, dump, 0, dump.length);
            }
        };
        Class<?> proxyClass = loader.loadClass("com.itheima.$Proxy0");
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        Foo o = (Foo)constructor.newInstance((InvocationHandler) (o1, method, objects) -> {
            System.out.println("before");
            Object result = method.invoke(o1, objects);
            System.out.println("after");
            return result;
        });
        o.foo();

    }
}
