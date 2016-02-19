package com.zmyer.maven_test;

/**
 * Hello world!
 *
 */
public class App 
{
	public static class RunOne implements Runnable
	{

		private final int count = 1000;
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i< count; i++)
			{
				System.out.println("asdaf");
			}
		}
		
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        App app = new App();
        RunOne one = new RunOne();
        Thread thread = new Thread(new RunOne());
        thread.setDaemon(false);
        
        thread.start();
        
    }
}
