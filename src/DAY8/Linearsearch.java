package DAY8;

public class Linearsearch {
    public static void main(String[] args){
        int[] arr = {10,25,30,7,40,15};
        int t = 40;

        for(int i =0; i<arr.length; i++){
            if (arr[i] == t){
                System.out.println("Found at index " + i);
                return ;
            }
        }
        System.out.println("Not found");
    }
}
