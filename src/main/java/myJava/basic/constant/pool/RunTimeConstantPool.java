package myJava.basic.constant.pool;

/**
 * 运行时常量池存在于内存中，也就是class常量池被加载到内存之后的版本
 * 不同之处：字面量可以动态的添加， 符号引用可以被解析为直接引用。
 *
 * JVM在执行某个类的时候，经过加载、连接、初始化， 连接包括：验证、准备、解析三个阶段；
 * 当类加载到内存中，jvm将class常量池中的内容存放到运行时常量池中，由此可知，运行时常量池也是每个类都有一个。
 * 解析阶段，把符号引用替换为直接引用，解析的过程会去查询字符串常量池，保持一致性。
 */
public class RunTimeConstantPool {
}
