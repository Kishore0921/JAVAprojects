package DAY3;

class animal2 {void sound(){System.out.println("Animal sound");}}
class dog extends animal2{
    @Override
    void sound(){System.out.println("Dog barks");}
}
public class Override1 {
    public static void main(String[] args){
        dog d = new dog();
        System.out.println("The parent class methods is sound ");
        d.sound();
        animal2 a = new animal2();
        a.sound();
     }
}
