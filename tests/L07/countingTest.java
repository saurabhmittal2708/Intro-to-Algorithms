/*
 * L07.countingTest
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
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