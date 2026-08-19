package DAY3;

public class StudentData {
        String name; int SRN;
        StudentData (String name, int SRN)
        {
            this.name = name;
            this.SRN = SRN;
        }
        public static void main(String[] args){
            StudentData s1 = new StudentData("Krish", 123);
            System.out.println("Name of Student "+ s1.name);
            System.out.println("SRN of Student "+ s1.SRN);

            StudentData s2 = new StudentData("Gopi", 345);
            System.out.println("Name of Student "+ s2.name);
            System.out.println("SRN of Student "+ s2.SRN);
        }
    }
