package myJava.basic.jvm.memory.module;

/**
 * 虚拟机栈
 * 每个线程有一个私有的栈， 栈里面存放"栈桢"
 * 每个方法会创建一个栈帧， 栈帧中存放了局部变量表(基本数据类型和对象引用)、操作数栈、方法出口等信息。
 * 栈的大小可以固定也可以动态扩展
 */
public class VMStacks {
    private static int index = 1;
    public void call(){
        index++;
        call();
    }
    public static void main(String[] args){
        VMStacks testVMStacks = new VMStacks();
        try{
            testVMStacks.call();
        } catch (Throwable e){
            System.out.println("stack deep : " + index);
            e.printStackTrace();
        }
    }
}
