package DAY1;

public class findmax {
    public static void main(String[] args){
        int a=20;
        int b=40;
        int c=30;

        int max =a;
        if(b>max)
        {
            max=b;
        }
        if(c>max){
            max =c;
        }
        System.out.println("MAXIMUM is "+max);
    }
}
