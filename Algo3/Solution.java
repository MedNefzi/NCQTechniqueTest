// Mohamed Nefzi
// Proposition Algo 3
package com.algo3;

import java.lang.Math;

public class Solution{

  public int solution(int[] A) {
	
	// If array A does not contain any element
	if (A.length == 0) 
		return 0;
	// If array A contain only one element
    	if (A.length == 1) 
    		return A[0];
    	// If array A contains many element
        // Declaration and initialization of variables
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
	
	/* Scroll through the array to calculate sum 
	 * of elements and to replace element values 
	 * with absolute values of each element */
	 
        for (int i = 0; i < A.length; i++) {
            int value = Math.abs(A[i]);
            if (maximum < value)
                maximum = value;
            sum += value;
            A[i] = value;
        }
	// Declaration and initialization of counts array 
        int counts []= new int[maximum + 1];
        for (int i = 0; i < A.length; i++) {
            counts[A[i]]++;
        }
	// Declaration and initialization of AUX array 
        int AUX[]= new int[sum + 1];
        for (int i = 1; i < AUX.length; i++) {
            AUX[i] = -1;
        }
        /* Scroll through the two tables AUX &  Counts 
        * and  modifying the values of AUX elements */
        for (int i = 1; i < counts.length; i++) {
            for (int j = 0; j < AUX.length; j++) {
                if (AUX[j] >= 0) {
                    AUX[j] = counts[i];
                } else if (j - i >= 0 && AUX[j - i] > 0) {
                    AUX[j] = AUX[j - i] - 1;
                }
            }
        }
        // Declaration and initialization of result variable
        int result = sum;
        for (int i = 0; i < AUX.length / 2 + 1; i++) {
            if (AUX[i] >= 0 && result > Math.abs(sum - 2 * i)) {
                result = Math.abs(sum - 2 * i);
            }
        }
        return result;
    }
}

