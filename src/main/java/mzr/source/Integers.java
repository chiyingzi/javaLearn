package mzr.source;

/**
 * Created by maozongren.
 * Time 2017/11/21 上午10:39
 */
public class Integers {
    public static void main(String[] args) {
        equal();
    }

    /**
     * 字符串格式化
     */
    public static void equal() {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        int c = 1;
        System.out.println(a != b);
        System.out.println(a.equals(b));
        System.out.println(a.intValue() == c);

    }
}
