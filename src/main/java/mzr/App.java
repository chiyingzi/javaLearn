package mzr;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Hello world!
 */
public class App {

    static int THREAD_COUNT = 1000;
    static int EVERY_CAPACITY_COUNT = 10000;
    static AtomicInteger atomic = new AtomicInteger(0);
    static ConcurrentHashMap<Integer, Integer> mapTest = new ConcurrentHashMap<Integer, Integer>();

    public static class EveryThread implements Runnable {
        public int i;

        public EveryThread(int i) {
            this.i = i;
        }

        public void run() {
            for (int j = 0; j < EVERY_CAPACITY_COUNT; j++) {
                mapTest.put(EVERY_CAPACITY_COUNT * i + j, EVERY_CAPACITY_COUNT * i + j);
            }
            atomic.getAndIncrement();
        }
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread t = new Thread(new EveryThread(i));
            t.start();
        }

        while (atomic.get() < THREAD_COUNT) {
            System.out.println("count is : " + atomic.get());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }

        System.out.println("map size : " + mapTest.size());
        System.out.println("use time : " + (System.currentTimeMillis() - start) + "ms");
    }


}
