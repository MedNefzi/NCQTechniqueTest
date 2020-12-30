// Mohamed Nefzi
//Algo 1
package com.algo3;

import java.lang.Math;

public class Solution{

  public int solution(int[] A) {

	if (A.length == 0) return 0;
    	if (A.length == 1) return A[0];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            int value = Math.abs(A[i]);
            if (max < value)
                max = value;
            sum += value;
            A[i] = value;
        }

        int counts []= new int[max + 1];
        for (int i = 0; i < A.length; i++) {
            counts[A[i]]++;
        }

        int AUX[]= new int[sum + 1];
        for (int i = 1; i < AUX.length; i++) {
            AUX[i] = -1;
        }
        for (int i = 1; i < counts.length; i++) {
            for (int j = 0; j < AUX.length; j++) {
                if (AUX[j] >= 0) {
                    AUX[j] = counts[i];
                } else if (j - i >= 0 && AUX[j - i] > 0) {
                    AUX[j] = AUX[j - i] - 1;
                }
            }
        }
        int result = sum;
        for (int i = 0; i < AUX.length / 2 + 1; i++) {
            if (AUX[i] >= 0 && result > Math.abs(sum - 2 * i)) {
                result = Math.abs(sum - 2 * i);
            }
        }
        return result;
    }
}

