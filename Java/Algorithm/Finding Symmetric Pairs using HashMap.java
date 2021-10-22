Description :
Consider you are given an array of pairs, and you have to print all the symmetric pairs. 
Pair (a, b) and pair (c, d) are called symmetric pairs, if a is equal to d and b is equal to c.

Input : The input will be in the below format :
The first line will be ‘n’ indicating the size of the input array, i.e., the number of pairs in the array.
The next ‘n’ lines indicate the ‘n’ pairs.
Each line will be two space-separated integers, indicating the first and the second element of the pair.

Output : The output should be in the following format :

Print all the first pairs of the symmetric pairs, each in a new line.
Every line should be a space-separated two integers, indicating a symmetric pair.
  
Note : 
1️⃣ If a pair is symmetric, then print the pair that appears first in the array.
2️⃣ If there are no symmetric pairs, then print ‘No Symmetric pair’.
3️⃣ If the array is empty, then consider that there are no symmetric pairs in the array.


Input-1 :
4
1 2
3 4
2 1
4 3

Output-1 :
1 2
3 4

Input-2:
3 
1 2 
2 3 
3 4

Output-2:
No Symmetric pair

SOLUTION : 
import java.util.*;

class Source {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // Write your code here
       if(n==0)
        {
            System.out.println("No Symmetric pair");
        }
        else{
            HashMap<Integer,Integer> h = new HashMap<>();
            boolean flag = false;
            for(int i=0;i<n;i++){
                int first1 = arr[i][0];
                int second1 = arr[i][1];
                Integer first2 = h.get(second1);
                if(first2!=null && first1==first2){
                    System.out.println(second1+" "+first1);
                    flag = true;
                }
                else
                    h.put(first1,second1);
            }
            if(!flag){
                System.out.println("No Symmetric pair");
            }
        }

    }
}
