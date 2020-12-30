// Mohamed Nefzi
// Algo1
package com.algo1;

import java.util.Scanner;
import java.lang.Math;
import com.algo1.Solution;

public class Test { 
public static void main(String[] args){
	// This reads the input provided by user using keyboard
	Scanner scan = new Scanner(System.in);
	// Variable declarations
	int N,M;
	int A [], result [];
	// read the number of counters N in [1 .. 100000]
	do {
	  System.out.print("Enter number of counter(s) N = ");
	  // This method reads the number provided using keyboard
	   N = scan.nextInt();
	}
	while ((N<1) | (N>100000));
	// read the size of the Table A M in [1 .. 100000]
	do {
	  System.out.print("Enter size M = ");
	  // This method reads the number provided using keyboard
	   M = scan.nextInt();
	}
	while ((M<1) | (M>100000));
	// Initialization and array A filling
	A = new int[M];
	for (int i = 0; i <M ; i++)
		do {
		  System.out.print("Enter A["+i+"] = ");
		  // This method reads the number provided using keyboard
		   A[i] = scan.nextInt();
		}
		while (( A[i]<1) | ( A[i]>N+1));
	
	// Closing Scanner 
        scan.close();
        // Call solution method from Solution Class
	Solution mySolution = new Solution();
	result = mySolution.solution(N,A);
	
	// Results
	System.out.println("----------- N = "+N+" and M = "+M+" ------------- ");
	System.out.print("( ");
	for (int i = 0; i <N-1 ; i++)
		System.out.print(result [i]+ ", ");
	System.out.println(result [N-1]+")");
        
	}
}
