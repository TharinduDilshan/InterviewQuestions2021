
import java.util.Scanner;

import heavy.threads;
import java.util.Scanner;
public class Threads {

	public static void main (String args[]) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		myThread1 t1=new myThread1();      //creating a object of class myThread1
		myThread2 t2=new myThread2();
		myThread3 t3=new myThread3();
		t1.run();                          //invoking run method in class muThread1
		t1.sleep(4000);                    //putting for sleep 4 sec
		t2.run();
		t2.sleep(2000);
		t3.run();
		
	}
	
	
}
class myThread1 extends Thread
{
	public void run()
	{
		
	    System.out.println("enter any number");
	    Scanner sc = new Scanner(System.in);
		int  a=sc.nextInt();
		int k=fib(a);
		System.out.println(k);
	   
	}
	public static int fib(int n)
    {
		if (n <= 1)
		{
			return n;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
    }	
}
class myThread2 extends Thread
{
	public void run()
	{
		for(int i=100;i<=150;i++)
    	{
    		System.out.println(i);
    	}
	}
}
class myThread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
    	{
    		System.out.println(i);
    	}
	}
}
