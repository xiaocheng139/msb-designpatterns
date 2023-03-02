package com.msb.singleton;

/**
 * 饿汉式
 * Pros:
 * 线程安全，因为JVM保证类只加载一次，所以static变量随之加载，完成实例化
 * Cons:
 * 不能延迟创建，不管用到与否，类加载的时候就创建实例
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {}

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 instance1 = Mgr01.getInstance();
        Mgr01 instance2 = Mgr01.getInstance();
        System.out.println(instance1 == instance2);
    }
}
