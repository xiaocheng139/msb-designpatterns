package com.msb.singleton;

/**
 * 尝试缩小锁的范围
 * 但是没用 线程不安全
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {}

    public static Mgr05 getInstance() {
        if (INSTANCE == null) { //线程1，2同时进入
            synchronized (Mgr05.class) { // 2获得锁之后new了对象然后释放，1会接着获得锁然后继续new
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
