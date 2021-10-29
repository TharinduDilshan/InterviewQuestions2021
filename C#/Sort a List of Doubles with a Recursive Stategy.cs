//Sort a list of Doubles using a recursive stategy
//Input: (39.50, 90.04, 2.5, 1.9, 150.5, 28.9, 208.8, 90.04)
//Output: (1.9, 2.5, 28.9, 39.50, 90.04, 90.04, 150.5, 208.8)

public class Sort_a_List_of_Doubles_with_a_Recursive_Stategy
{
            using System.Collections.Generic;
        
            // In order to do the sorting, we'll be using Quick Sort, a well known recursive algorithm that uses divide and conquer strategy
            

            //The first method is responsible for the recursion. It receives the list to be sorte, it's start and it's end. When all recursive calls stop, the list will be sorted.
            public void Sort(List<double> list, int start=0, int end=0)
            {
                end = end == 0 ? list.Count - 1 : end; //Here, we check if end's value is the default 0 and, if it is, we change it to be the last position of the list
                if (start < end)
                {
                    //Here we check if end if greater than start.
                    int partition =
                        Partition(list, start,
                            end); //Here the list is partitioned in two, with the chosen point to partition being already sorted.
                    Sort(list, start,
                        partition -
                        1); //Here we call the method in a recursive way, to the first half of the partitioned list
                    Sort(list, partition + 1,
                        end); //Here we call the method in a recursive way, to the second half of the partitioned list
                }
            }
                
            //The second method is responsible for partitioning the list. Using a position as pivot, it will return the point of partition. All the elements on the left of the pivot will be lesser than it and all elements to the right will be greater.      
            public int Partition(List<double> list, int start, int end)
            {
                double pivot=list[(start+end)/2]; //There are many ways to pick a pivot, here we'll use the middle position value.
                int i=(start-1); //Here we take the position previous to start as the index of the smaller element
                for(int j=start;j<=end-1;j++){ //We'll use this loop to run through the list
                    if(list[j]<pivot){ //Here we check if the current value is lesser than pivot
                        i++; //If the previous condition is true, we increment i.                    
                        double aux=list[i]; //Using a auxiliary variable, we save the smaller element
                        list[i]=list[j]; //Here we change the previous smaller element with the current element
                        list[j]=aux; //And then we change the current element to be the smaller, picked sooner
                    }
                }
                double aux2=list[i+1]; //Using another auxiliary variable, we save the next smallest element
                list[i+1]=list[end]; //Then we swap the next element with the element on the end of the list
                list[end]=aux2;
                return i+1; //And return the index of the next smallest element.
            }

            //In order to run the solution, we call the first method passing a list. We'll be using the previous mentioned input.
            var list = new List<double>(){39.50, 90.04, 2.5, 1.9, 150.5, 28.9, 208.8, 90.04};
            Sort(list);
}


