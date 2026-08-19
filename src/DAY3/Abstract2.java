package DAY3;
abstract class vehicle {
    abstract void start();
    void stop(){System.out.println("Stopped");}}
class car extends vehicle {
    void start() {
        System.out.println("Car starts");
    }
}
public class Abstract2 {
        public static void main(String[] args){
            car c = new car();
            c.start(); c.stop();
        }
}

