package com.msb.singleton;

/**
 * enum
 * 线程安全
 * 防止反序列化，因为枚举类没有构造方法，没办法通过反射创建对象
 */
public enum Mgr08 {
    INSTANCE("123");

    Mgr08(String name) {

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
