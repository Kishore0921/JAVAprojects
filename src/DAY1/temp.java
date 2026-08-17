package DAY1;

public class temp {

    public static class DataTypes{
        public void printVariables()
        {
            int age=25;
            System.out.println("By constructor "+age);
        }
    }
    public static void main(String[] args){
        int age=21;
        double salary=30000;
        char grade='A';
        boolean placed = false;
        String name="Rahul";
        System.out.println(age);
        System.out.println(grade);
            System.out.println(placed);
            System.out.println(name);
            System.out.println(salary);
            DataTypes dat= new DataTypes();
            dat.printVariables();
    }
}
