// Mohamed Nefzi
// Algo1
package com.algo2;

import java.util.Scanner;
import java.lang.Math;

public class Test { 

public static void main(String[] args){

	// This reads the input provided by user using keyboard
	Scanner scan = new Scanner(System.in);
	// Variable declarations
	int L;
	int A [], B [], result [];
	// read L in [1 .. 50000]
	do {
	  System.out.print("Enter L = ");
	  // This method reads the number provided using keyboard
	   L = scan.nextInt();
	}
	while ((L<1) | (L>50000));
	
	// Initialization and array A filling
	A = new int[L];
	for (int i = 0; i <L ; i++)
		do {
		  System.out.print("Enter A["+i+"] = ");
		  // This method reads the number provided using keyboard
		   A[i] = scan.nextInt();
		}
		while (( A[i]<1) | ( A[i]>L));
	
	// Initialization and array A filling
	B = new int[L];
	for (int i = 0; i <L ; i++)
		do {
		  System.out.print("Enter B["+i+"] = ");
		  // This method reads the number provided using keyboard
		   B[i] = scan.nextInt();
		}
		while (( B[i]<1) | ( B[i]>30));
		
	// Closing Scanner 
        scan.close();
        
        // Call solution method from Solution Class
	Solution mySolution = new Solution();
	result = mySolution.solution(A,B);
	
	// Results
	System.out.println("----------- L = "+L+" ------------- ");
	System.out.print("( ");
	for (int i = 0; i <L-1 ; i++)
		System.out.print(result [i]+ ", ");
	System.out.println(result [L-1]+")");
        
	}
}
