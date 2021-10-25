/*
Given an array of meeting time intervals consisting of start and end times [s1, e1], [s2, e2], ... , determine if a person could attend all meetings.

For example,
Given [ [0, 30], [5, 10], [15, 20] ],
return false.
*/

import java.util.Arrays;
import java.util.PriorityQueue;

public class Interval {
    int start;
    int end;
    Interval(){start=0; end=0;}
    Interval(int s, int e){
        start=s;
        end=e;
    }
}

public class MeetingRoomsII {
    public int meetingRooms(Interval[] interval){
        /*
        METHOD:
        1. Sort the array according to the starting time
        2. Add the intervals in a minheap, according to the increasing ending time
        3. For a meeting to be in the same room, the starting time of the first meeting should be greater than equal to 
        the end time in the minheap
        4. If not, increment the number of meetings
        */
        if(interval==null || interval.length==0) return 0;
        
        Arrays.sort(interval, (a,b)-> a.start- b.start);
        PriorityQueue<Interval> priorityQueue= new PriorityQueue<>((a,b)-> a.end- b.end);
        priorityQueue.add(interval[0]);

        for(int i=0; i<interval.length; i++){
            Interval curr= interval[i];
            Interval earlyEnd= priorityQueue.remove();
            if(curr.start >= earlyEnd){
                earlyEnd.end= curr.end;
            }
            else{
                priorityQueue.add(interval[i]);
            }
            priorityQueue.add(earlyEnd);
        }
        return priorityQueue.size();
    }
}
