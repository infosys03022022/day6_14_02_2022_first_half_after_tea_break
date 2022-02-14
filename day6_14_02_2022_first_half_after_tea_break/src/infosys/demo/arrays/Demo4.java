package infosys.demo.arrays;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int num[][]=new int[3][3];
		Scanner scan=new Scanner(System.in);
        for(int i=0;i<num.length;i++)
        {
        	for(int j=0;j<num[i].length;j++)
        	{
        		System.out.print("Enter the number");
        	    num[i][j]=scan.nextInt();
        	}
        }
		// The outer loop is storing the data from 2D array to 1D array
      for(int n[] : num) 
       {
    	   // The inner loop is storing the data from 1D array to a single int variable
    	   for(int v : n)
    	   {
    		   System.out.print(v+"\t");
    	   }
    	   System.out.println();
       } 
      System.out.println("-------------------------------");
      for(int i=0;i<num.length;i++)
      {
      	for(int j=0;j<num[i].length;j++)
      	{
      		
      	    System.out.print(num[i][j]+"\t");
      	}
        System.out.println();
      }
    	   
	}

}
