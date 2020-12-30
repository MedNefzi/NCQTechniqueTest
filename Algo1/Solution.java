// Mohamed Nefzi
//Algo 1
package com.algo1;

import java.lang.Math;

public class Solution{

 public int[] solution(int N, int A[]) {
   
    int result [] = new int[N];
    int maximum = 0;
    int resetLimit = 0;

    for (int K = 0; K < A.length; K++)
    {

        if (A[K] >= 1 && A[K] <= N)
        {
            if (result[A[K] - 1] < resetLimit) {
                result[A[K] - 1] = resetLimit + 1;
            } else {
                result[A[K] - 1]++;
            }

            if (result[A[K] - 1] > maximum)
            {
                maximum = result[A[K] - 1];
            }
        }
        else
            resetLimit = maximum;

    }

    for (int i = 0; i < result.length; i++)
        result[i] = Math.max(resetLimit, result[i]);

    return result;
}
}

