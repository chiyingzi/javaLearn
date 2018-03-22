package mzr.source;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by maozongren.
 * Time 2018/2/24 上午9:54
 */
public class ThreadTest extends Thread {
    public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static void main(String[] args) {
        try {
            System.out.println(System.currentTimeMillis());
            ThreadTest thread = new ThreadTest();
            System.out.println("线程start: " + dateFormat.format(new Date()));
            thread.start();
            Thread.sleep(5000);
            System.out.println("wait结束: " + dateFormat.format(new Date()));
            synchronized (thread) {
                thread.notify();
                System.out.println("重新nofify: " + dateFormat.format(new Date()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("进入run: " + dateFormat.format(new Date()));
        try {
            synchronized (this) {
                System.out.println("开始wait: " + dateFormat.format(new Date()));
                this.wait();
            }

            while (true) {
                    Thread.sleep(500);
                    System.out.println("运行中: " + dateFormat.format(new Date()));

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
