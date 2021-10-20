// Return the nth fibonacci number

public static int get_n_fibonacci(int n)  
{  
    int num = n - 1; //Need to decrement by 1 since we are starting from 0  
    int[] fib = new int[num + 1];  
    fib[0]= 0;  
    fib[1]= 1;  
    for (int i = 2; i <= num;i++)  
    {  
       fib[i] = fib[i - 2] + fib[i - 1];  
    }  
    return Fib[num];  
} 