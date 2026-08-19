package DAY3;

public class Animal {
    void eat(){
        System.out.println("Dog eats");
    }
    static class dog extends Animal{
        void bark(){
            System.out.println("Dog barks");
        }
    }
    public static void main(String[] args){
        dog d = new dog();
        d.eat();
        d.bark();
    }
}
