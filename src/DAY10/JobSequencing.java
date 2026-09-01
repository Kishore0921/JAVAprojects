package DAY10;
import java.util.*;
public class JobSequencing {
    static class Job{
        String name;
        int deadline;
        int profit;
        Job (String name, int deadline, int profit){
            this.name = name;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args){
        Job[] jobs = {
                new Job("a", 2, 100),
                new Job("b", 1, 50),
        };
    }
}
