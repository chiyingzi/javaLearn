package mzr.source;

/**
 * 字符串测试
 * Created by maozongren.
 * Time 2017/6/5 上午11:58
 */
public class Longs {


    public static void main(String[] args) {
        equal();
    }

    /**
     * 字符串格式化
     */
    public static void equal() {
        Long a = new Long(1);
        Long b = new Long(1);
        System.out.println(a != b);
        System.out.println(a.equals(b));
    }
}


