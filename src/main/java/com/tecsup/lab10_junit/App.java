
package com.tecsup.lab10_junit;


public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App app = new App();	
		int sum = app.sumar(4,5);		
		int res = app.restar(4,5);
		
		
	    System.out.println( sum);
	    System.out.println(res);
	    
	}

	public  int restar(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public  int sumar(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}