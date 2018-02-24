package mzr.source;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maozongren.
 * Time 2017/6/5 下午5:20
 */
public class Template {


    public static void main(String[] args) {
        List<Template> test = new ArrayList<Template>();
        test.add(new Template());
        wrapSuccess(test);
    }
    public static <T> List<T> wrapSuccess(List<T> data) {
        System.out.println("succ");
        return data;
    }
}
