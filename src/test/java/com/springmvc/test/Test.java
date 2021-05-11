package com.springmvc.test;

public class Test {
    public static void main(String[] args) throws Exception {
        BeanA a = new BeanA();
        BeanB fasdf = new BeanB();
        MyClassLoad load = new MyClassLoad();
        Class b = load.loadClass("com.springmvc.test.BeanB");
        System.out.println(b.getClassLoader());
        System.out.println(BeanA.class.getClassLoader());
        System.out.println(BeanB.class.getClassLoader());
    }
}
