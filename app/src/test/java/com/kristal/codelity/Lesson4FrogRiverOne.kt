package com.kristal.codelity

import org.junit.Assert
import org.junit.Test

/**
 * Created by Dwi_Ari on 11/13/17.
 */

class Lesson4FrogRiverOne {
    @Test
    fun analysis() {
        Assert.assertEquals(solution(5, arrayOf(1, 3, 1, 4, 2, 3, 5, 4)), 6)
    }

    fun solution(X: Int, A: Array<Int>): Int {
        var step = 0
        val leavesDrop = BooleanArray(X + 1)
        A.indices.forEach {
            if (A[it] <= X && !leavesDrop[A[it]]) {
                leavesDrop[A[it]] = true
                if (++step == X)
                    return it
            }
        }

        return -1
    }
}
