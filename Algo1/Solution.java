// Mohamed Nefzi
// Proposition Algo 1
package com.algo1;

import java.lang.Math;

public class Solution{

 public int[] solution(int N, int A[]) {
   
    // Declaration and initialization of variables
    
    int result [] = new int[N];
    int maximum = Integer.MIN_VALUE;
    int limit = 0;

   /* Scroll through table A 
    * and  modifying the values of Result elements and the limit value */
    for (int K = 0; K < A.length; K++)
    {

        if (A[K] >= 1 && A[K] <= N)
        {
            if (result[A[K] - 1] < limit) {
                result[A[K] - 1] = limit + 1;
            } else {
                result[A[K] - 1]++;
            }

            if (result[A[K] - 1] > maximum)
            {
                maximum = result[A[K] - 1];
            }
        }
        else
            limit = maximum;

    }
    /* Scroll through table Result
     * compare the values with the limit value */ 
    for (int i = 0; i < result.length; i++)
        result[i] = Math.max(limit, result[i]);

    return result;
}
}

