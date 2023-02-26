package com.itheima.a12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class $Proxy1 implements A12.Foo {

    private final A1201.Target.InvocationHandler handler;

    public $Proxy1(A1201.Target.InvocationHandler handler) {
        this.handler = handler;
    }

    @Override
    public void foo() {
        try {
            handler.invoke(this, foo, new Object[0]);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public int bar() {
        try {
            return (int) handler.invoke(this, bar, new Object[0]);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    static Method foo;
    static Method bar;
    static {
        try {
            foo = A1201.Foo.class.getMethod("foo");
            bar = A1201.Foo.class.getMethod("bar");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
