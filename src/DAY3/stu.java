package DAY3;

public class stu {
    String name;
    stu(String name){ this.name=name;}
    void display(){System.out.println("Student name is "+this.name);}

    public static void main(String[] args){
        new stu("Hari").display();
    }
}
