package Quiz3;

import java.io.*;

public class TriangleException extends Exception {
	
	private double a;
	
	public TriangleException(double a){
	     
		this.a = a;
		
	   }
	public double getA()
	   {
	      return a;
	   }

}