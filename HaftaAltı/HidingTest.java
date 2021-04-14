package HaftaAltı;

public class HidingTest {
    public static void main(String[] args) {
        SuperClass sc = new SubClass(); //polymorphism
        sc.method(); // instance metot koşulur.
        sc.staticMethod(); // super classın statik metodu koşulur.
        SubClass.staticMethod(); // subclass'ın statik metodu koşulur.
    }
}
class SuperClass{
    public void method(){
        System.out.println("Instance method of Super");
    }
    public static void staticMethod(){
        System.out.println("Static method of Super");
    }
}
class SubClass extends SuperClass{
    public void method(){
        System.out.println("Instance method of Subclass");
    }
    public static void staticMethod(){
        System.out.println("Static method of SubClass");
    }
}
