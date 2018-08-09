package myJava.basic.keyword;

/**
 * 抽象类是为了将相同的但不确定的东西提取出来
 * 规则：
 * 1.抽象类中可以有非抽象方法，但有抽象方法的类一定是抽象类
 * 2.抽象类不能被实例化
 * 
 */
public abstract class Abstract {
    abstract void pring();
}
abstract class test extends Abstract{

}