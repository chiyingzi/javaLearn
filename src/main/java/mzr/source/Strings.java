package mzr.source;

/**
 * 字符串测试
 * Created by maozongren.
 * Time 2017/6/5 上午11:58
 */
public class Strings {


    public static void main(String[] args) {
        format();
    }

    /**
     * 字符串格式化
     */
    public static void format() {
        int testInt = 1;
        System.out.printf(String.format("%07d", testInt));
    }
}


