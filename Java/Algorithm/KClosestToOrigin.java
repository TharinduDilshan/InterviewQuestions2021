/*
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

EXAMPLE:

Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].

*/

import java.util.PriorityQueue;

public class KClosestToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        /*
        METHOD:
        1. Use MaxHeap as we want the "closest" points 
        2. Add the points in the heap according to the eucledian distance
        3. Remove the root when the size exceeds K
        */

        //Add in heap acc to euclidean distance
        PriorityQueue<int[]> maxHeap= new PriorityQueue<>((a,b)->(b[0]*b[0] + b[1]*b[1]) -(a[0]*a[0] + a[1]*a[1] ));
        for(int i[]:points){
            maxHeap.add(i);
            if(maxHeap.size()>K)
                maxHeap.remove();
        }

        int[][] result= new int[K][2];
        while(K-- >0){
            result[K]= maxHeap.remove();
        }
        return result;
    }
}
