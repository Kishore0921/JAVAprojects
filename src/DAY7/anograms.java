package DAY7;
import java.util.HashMap;
public class anograms {
    public static void main(String[] args){
        String str = "Listen";
        String str1 = "silent";
        System.out.println("Are Anagrams "+ areAnagrams(str, str1));
    }
   public static boolean areAnagrams(String str, String str1){
        if(str.length() != str1.length()){
            return false;
        }
        HashMap<Character, Integer>frequency = new HashMap<>();
        for (int i= 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (!frequency.containsKey(ch)){
                return false;
            }
            frequency.put(ch, frequency.get(ch)-1);
            if(frequency.get(ch) == 0){
                frequency.remove(ch);
            }
        }
        return frequency.isEmpty();
   }
}
