// Mohamed Nefzi
// Algo1
package com.algo3;

import java.util.Scanner;
import java.lang.Math;
import com.algo3.Solution;

public class Test { 

public static void main(String[] args){

	// This reads the input provided by user using keyboard
	Scanner scan = new Scanner(System.in);
	// Variable declarations
	int N, result;
	int A [];
	// read N in [1 .. 20000]
	do {
	  System.out.print("Enter N = ");
	  // This method reads the number provided using keyboard
	   N = scan.nextInt();
	}
	while ((N<1) | (N>20000));
	
	// Initialization and array A filling
	A = new int[N];
	for (int i = 0; i <N ; i++)
		do {
		  System.out.print("Enter A["+i+"] = ");
		  // This method reads the number provided using keyboard
		   A[i] = scan.nextInt();
		}
		while (( A[i]<-100) | ( A[i]>100));
	
	// Closing Scanner 
        scan.close();
        // Call solution method from Solution Class
	Solution mySolution = new Solution();
	result = mySolution.solution(A);
	
	// Results
	System.out.println("----------- N = "+N+" ------------- ");
	System.out.println("The minimum possible value is "+ result);
        
	}
}
