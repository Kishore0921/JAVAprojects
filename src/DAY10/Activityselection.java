package DAY10;
import java.util.*;
import java.util.*;

class Activity{
    int start;
    int end;

    Activity(int start, int end){
        this.start=start;
        this.end=end;
    }
}

public class Activitys selection {
    public static void main(String[] args){

        Activity[] activities= {

                new Activity(1,3),
                new Activity(2,4),
                new Activity(3,5),
                new Activity(6,8)
        };

        Arrays.sort(
                activities,
                Comparator.comparing(a ->a.end)
        );

        int lastEnd=0;
        for(Activity activity:activities){
            if(activity.start>=lastEnd){

                if(activity.start>=lastEnd){

                    System.out.println(
                            activity.start +"-"+
                                    activity.end
                    );

                    lastEnd=activity.end;
                }
            }
        }
    }
}