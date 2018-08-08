package myJava.basic.constant.pool;

public class StringConstantPool {
    /**
     * JDK7.0版本 字符串常量池被移到堆中。
     * 是一个Hash表
     * 字符串常量池中的相同的字符串只存在一份
     * 执行完第一行后，常量池中已存在"hello,world!"
     * 那么s2不会在常量池中申请新的空间，而是直接把已存在的字符串内存地址返回给s2
     * @return
     */
    public static boolean testStringConstantPool(){
        String s1 = "hello, world!";
        String s2 = "hello, world!";
        return (s1 == s2);
    }
    public static void main(String[] args){
        System.out.println(testStringConstantPool());
    }
}
