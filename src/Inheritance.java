class Add {
    void add(){
        int a = 10, b = 10;
        int result = a+b;
        System.out.println("add = "+result);
    }
}
class Sub extends Add{
    void sub(){
        int a = 10, b = 8;
        int result = a-b;
        System.out.println("sub = "+result);
    }
}
public class Inheritance extends Sub {
    public static void main(String[] args){
    Inheritance simplemath = new Inheritance();
    simplemath.add();
    simplemath.sub();
    }
}

