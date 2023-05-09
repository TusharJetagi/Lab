package Thread;


	class Thread__1 extends Thread
	{
	    public void run()
	    {
	        System.out.println("Welcome");
	    }
	}
	
	class Thread__2 extends Thread 
	{
	    public void run() 
	    {
	            System.out.println("Good morning");
	    }
	}
	
	public class Que_3  
	{
	    public static void main(String[] args) 
	    {
	        Thread1 t1= new Thread1();
	        t1.setPriority(8);
	        
	        Thread2 t2= new Thread2();
	        t2.setPriority(5);
	        
	        t1.start();
	        t2.start();
	        
	        
	        System.out.println(t1.getPriority());
	        System.out.println(t2.getPriority());
	    }
	}

