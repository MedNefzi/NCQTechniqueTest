// Mohamed Nefzi
// Proposition Algo 2
package com.algo2;

import java.lang.Math;

class Solution {

    public int[] solution(int[] A, int[] B) {
        
        // Declaration and initialization of variables
        int[] results = new int[A.length];
        int max = 0;
        // determine the max
        for (int i = 0; i < A.length; i++) {
            max = Math.max(A[i], max);
        }
        
        int[] AUX = new int[max + 1];
        
        // initial setting of AUX 
        AUX[0] =1;
        AUX[1] =1;

        for(int i=2; i<= max; i++){
            AUX[i] = (AUX[i-1] + AUX[i-2]) % ((int)Math.pow(2, 30));
        }

      /* Scroll through table Result
     	* by assigning to each element the value of AUX[A[i]] modulo 2^B[i]*/ 
        for(int i=0; i<A.length; i++){
            results[i] = AUX[A[i]] % ((int)Math.pow(2, B[i]));
        }
        
        return results;
    }
}

