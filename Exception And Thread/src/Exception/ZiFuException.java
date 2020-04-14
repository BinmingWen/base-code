package Exception;
/*
    子父类的异常：
    -如果父类抛出异常，子类重写父类方法时，抛出和父类相同的异常或是父类异常的子类或者不抛出异常
    -父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出。
    总结：
       父类异常是什么，子类异常就该是什么样子。
 */
class ZiFuException {

}
class Fu{
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04() throws Exception {}
}
class Zi extends Fu{
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws ArrayIndexOutOfBoundsException{}
    public void show03(){}
    public void show04() throws Exception{}
}

