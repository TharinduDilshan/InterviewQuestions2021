using System;

namespace bubbleSort
{
    public class Program
    {
        //Write C# code to perform a bubble sort on an array
        static void Main(string[] args)
        {
            Console.WriteLine("How large should the array be? Enter an integer: ");
            int size = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter max number for values? Enter an integer: ");
            int maxNum = int.Parse(Console.ReadLine());
            bubbleSort(createRandomArray(size, maxNum));
        }

        static private int[] createRandomArray(int size, int maxNum)   //function for creating a random array
        {
            int arraySize = size;   //sets the size of the array to the number the user chose
            int[] arrayData = new int[arraySize];   //creates the array with the size made above
            int min = 1;    //sets min number to 1
            int max = maxNum;     //sets max number to what the user specified

            Random randNum = new Random();  //initialises the random class
            for (int k = 0; k < arrayData.Length; k++)  //for the length of the array
            {
                arrayData[k] = randNum.Next(min, max);  //generates a random number between 1 and 100 for each position in the array. for example size 4: 3,87,14,8
            }

             return (arrayData);     //returns the new array
        }

        static private void bubbleSort(int[] arrayData) //bubble sort procedure
        {
            int temp; 
            string displayArray = string.Join(",", arrayData);
            Console.WriteLine("Unsorted array is " + displayArray);


            for (int i = 0; i < arrayData.Length - 1; i++) //loop will repeat as many times as length of array -1
            {
                for (int j = 0; j < arrayData.Length - 1; j++) //loop will repeat as many times as length of array -1
                {
                
                    if (arrayData[j] > arrayData[j + 1])    //if first number is larger than second number
                    {
                        
                        temp = arrayData[j];    //sets temp to the first (larger) number
                        arrayData[j] = arrayData[j + 1];     //sets the first number to the second (smaller) number
                        arrayData[j + 1] = temp;    //sets the second number to the temp number (first number) which comletes the swap
                    }
                }
            }
            displayArray = string.Join(",", arrayData);
            Console.WriteLine("The sorted array is " + displayArray);     //shows the (hopefully) sorted array
        }
    }
}
