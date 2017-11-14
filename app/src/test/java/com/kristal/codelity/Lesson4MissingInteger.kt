package com.kristal.codelity

/**
 * Created by Dwi_Ari on 11/13/17.
 */

import org.junit.Assert
import org.junit.Test
import java.util.*

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Assume that:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * Complexity:
 *
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
class Lesson4MissingInteger {
    @Test
    fun analysis() {
        Assert.assertEquals(solution(arrayOf(1, 3, 6, 4, 1, 2)), 5)
        Assert.assertEquals(solution(arrayOf(1, 2, 3)), 4)
        Assert.assertEquals(solution(arrayOf(-1, -3)), 1)
    }

    fun solution(A: Array<Int>): Int {
        Arrays.sort(A)

        var index = 1
        A.forEach {
            if (it == index) {
                index++
            } else if (it > index) {
                return index
            }
        }
        return index
    }
}
