package Thread;


class Thread_1 extends Thread
{
    public void run()
    {
       System.out.println("Good morning");
    }
}

class Thread_2 extends Thread 
{
    public void run() 
    {
    	 try 
         {
             Thread.sleep(200);
         }
         catch (Exception e) 
         {
        	 System.out.println(e);
         }
            System.out.println("Welcome");
    }
}

public class Que_2 
{
	public static void main(String[] args) 
	{
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
    }
}
