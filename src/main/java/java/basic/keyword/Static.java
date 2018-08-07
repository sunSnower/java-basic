package java.basic.keyword;

/**
 * static方法内部不能调用非静态方法，反过来是可以的
 * 在没有创建任何对象的前提下，仅仅通过类本身调用static方法
 */
public class Static {
    /**
     * 静态变量被所有的对象所共享，在内存中只有一个副本
     * 它当且仅当在类初次加载时会被初始化
     */
    public static int index = 1;

    /**
     * static方法不能访问非静态成员变量和非静态成员方法
     * 可以通过类名直接调用
     */
    public static void staticMethod(){
        System.out.println("this is a static method");
    }
}
