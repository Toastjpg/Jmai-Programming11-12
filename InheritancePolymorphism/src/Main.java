class A{
    public A(int i){
        System.out.println(1);
    }

    public A(){
        this(10);
        System.out.println(2);
    }
    void A(){
        A(10);
        System.out.println(3);
    }

    void A(int i){

    }
}

public class Main{
    public static void main(String[] args) {
        new A().A();
    }
}