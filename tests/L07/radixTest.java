/*
 * L07.radixTest
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 2/6/18 4:38 PM
 */

package L07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radixTest
{

    @Test
    void radixSort()
    {
        Integer[] array=new Integer[8];
        array[0]=510; array[1]=4; array[2]=12; array[3]=418; array[4]=132; array[5]=785; array[6]=25; array[7]=7;
        assertTrue(radix.isSorted(radix.radixSort(array,3)));
    }

    @Test
    void nSd()
    {
        assertEquals(0,radix.nSd(532,4));
        assertEquals(2,radix.nSd(532,1));
        assertEquals(3,radix.nSd(532,2));
        assertEquals(5,radix.nSd(532,3));

    }
}