package com.wsw.qiuzhao.Thread;

/**
 * Created by wsw on 2019/9/5 16:34
 * 死锁
 */
public class DeadLockDemo {
    private static final Object resource1 = new Object(); //资源1
    private static final Object resource2 = new Object(); //资源2

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1){
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }
        }, "线程1").start();

        new Thread(() -> {
            synchronized (resource1){
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource1){
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }
        }, "线程2").start();
    }
}
