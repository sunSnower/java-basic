package myJava.basic.keyword;

/**
 * 1.修饰类
 *      不可继承
 *
 * 2.修饰方法
 *      不可被重载
 *
 * 3.修饰变量
 *      初始化后，不可更改赋值
 *      
 */
public final class Final {
    public static void main(String[] args){
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println(Test.a);
        System.out.println(test1.b);
        System.out.println(Test.a);
        System.out.println(test2.b);

    }
}
class Test{
    static double a = Math.random();
    final double b = Math.random();
}