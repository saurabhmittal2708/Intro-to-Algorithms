/*
 * L07.countingTest
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 1/6/18 12:54 PM
 */

package L07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class countingTest
{
    private int[] testArray={4,5,1,7,9,0};


    @Test
    void countingSortTest()
    {
        assertTrue(counting.isSorted(counting.countingSort(testArray, 10)));
    }
}