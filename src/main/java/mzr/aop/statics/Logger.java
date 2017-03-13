package mzr.aop.statics;

import java.util.Date;

/**
 * Created by mzr on 17-3-9.
 */
public class Logger {
    public static void start() {
        System.out.println(new Date() + " say hello start...");
    }

    public static void end() {
        System.out.println(new Date() + " say hello end");
    }
}
