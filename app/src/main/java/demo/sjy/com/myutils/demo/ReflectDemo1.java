package demo.sjy.com.myutils.demo;

import demo.sjy.com.myutils.utils.MLog;

/**
 * 练习方法反射的类
 */
public class ReflectDemo1 {
    public void logA(String a, String b) {
        MLog.d(a + "--拼接--" + b);
    }

    public void logA(int a, int b) {
        MLog.d("计算和=" + (a + b));
    }

}
