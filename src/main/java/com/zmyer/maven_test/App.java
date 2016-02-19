package com.zmyer.maven_test;

/**
 * Hello world!
 *
 */
public class App 
{
	private final int count = 1000;
	private int index = 0;
	public class RunOne implements Runnable
	{

		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i< App.this.count; i++)
			{
				
			}
		}
		
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
