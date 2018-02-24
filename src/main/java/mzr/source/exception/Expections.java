package mzr.source.exception;

/**
 * Created by maozongren.
 * Time 2017/6/11 下午5:02
 */
public class Expections {
    public static void main(String[] args) {
        try {
            exceptionMethod1(new NullPointerException());
        } catch (Exception e) {
            System.out.println("catch1 it");
        }
    }

    public static void exceptionMethod1(NullPointerException e){
        try {
            exceptionMethod2(e);
        } catch (Exception e2) {
            System.out.println("catch2 it");
        }
    }

    public static void exceptionMethod2(NullPointerException e){
        throw e;
    }
}
