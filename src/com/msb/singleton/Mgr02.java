package com.msb.singleton;

/**
 * 同Mgr01
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02() {}

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr02 instance1 = Mgr02.getInstance();
        Mgr02 instance2 = Mgr02.getInstance();
        System.out.println(instance1 == instance2);
    }
}
