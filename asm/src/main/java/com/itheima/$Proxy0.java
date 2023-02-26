package com.itheima;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public class $Proxy0 extends Proxy implements Foo {

    protected $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public void foo() {
        try {
            h.invoke(this, foo, null);
        } catch (Throwable e) {
            throw new UndeclaredThrowableException(e);
        }
    }
    static final Method foo;
    static {
        try {
            foo = Foo.class.getMethod("foo");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
