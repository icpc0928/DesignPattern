package segregation.improve;

/**
 * 有個接口 Interface1 其中有五個方法, B,D類分別實現這個接口,而A,C類依賴這個接口,但A類只需要使用接口的1.2.3方法，而C類只需要使用接口的1.4.5方法...
 */
public class Segregation1{

    public static void main(String[] args) {
        //使用一把
        A a = new A();
        a.depend1(new B()); //A類 通過接口 去依賴(使用)B類
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D()); //C類 通過接口 去依賴(使用)D類
        c.depend4(new D());
        c.depend5(new D());
    }
}

//接口1
interface Interface1{
    void operation1();
}
//接口2
interface Interface2{
    void operation2();
    void operation3();
}
//接口3
interface Interface3{
    void operation4();
    void operation5();
}

class B implements Interface1, Interface2{
    @Override
    public void operation1() {
        System.out.println("B 實現了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 實現了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 實現了 operation3");
    }

}

class D implements Interface1, Interface3{
    @Override
    public void operation1() {
        System.out.println("D 實現了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 實現了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 實現了 operation5");
    }
}

// A類 通過接口 Interface1, Interface2 依賴(使用) B類，但是只會用到1.2.3.方法
class A {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface2 i){
        i.operation2();
    }
    public void depend3(Interface2 i){
        i.operation3();
    }
}

// C類 通過接口 Interface1, Interface3 依賴(使用) D類，但是只會用到1.4.5.方法
class C {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface3 i){
        i.operation4();
    }
    public void depend5(Interface3 i){
        i.operation5();
    }
}
