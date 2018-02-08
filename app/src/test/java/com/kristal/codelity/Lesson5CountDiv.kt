package com.kristal.codelity

import org.junit.Assert
import org.junit.Test

/**
 * Created by Dwi_Ari on 11/13/17.
 */

/**
 * Write a function:
 *
 * class Solution { public int solution(int A, int B, int K); }
 *
 * that, given three integers A, B and K, returns the number of integers within the range [A .. B] that are divisible by K, i.e.:
 *
 * { i : A ≤ i ≤ B, i mod K = 0 }
 *
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 *
 * Assume that:
 *
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 * Complexity:
 *
 * expected worst-case time complexity is O(1);
 * expected worst-case space complexity is O(1).
 */

class Lesson5CountDiv {
    @Test
    fun analysis(){
        Assert.assertEquals(solution(6,11,2), 3)
        Assert.assertEquals(solution(6,12,2), 4)
        Assert.assertEquals(solution(7,11,2), 2)
    }

    fun solution(A: Int, B: Int, K: Int): Int {
        return (A..B)
                .firstOrNull { it % K == 0 }
                ?.let { (B - it) / K + 1 }
                ?: 0
    }
}
