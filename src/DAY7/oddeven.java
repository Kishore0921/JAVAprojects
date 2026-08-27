package DAY7;

public class oddeven {
    public static void main(String[] args){
        int num = 8;
        if((num & 1) == 0){
            System.out.println(num + " is Even");
        }
        else {
            System.out.println(num + " is Odd" );
        }
    }
}
