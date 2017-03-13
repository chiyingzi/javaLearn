package mzr;

public class NPE {


    public static void main(String[] args) {
        int test = intUnboxing();
        System.out.println(test++);
    }

    // int自动拆箱也有可能出现NPE
    public static int intUnboxing() {
        Integer i = null;
        return i;
    }
}
