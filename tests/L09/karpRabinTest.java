/*
 * L09.karpRabinTest
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 3/6/18 1:13 PM
 */

package L09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class karpRabinTest
{
    karpRabin testClass= new karpRabin();

    @Test
    void search()
    {
        assertTrue(testClass.Search("A", "BCDEFGHI").isEmpty());
    }

    @Test
    void hash()
    {
        System.out.println(testClass.hash("Saurabh"));
        assertNotEquals(testClass.hash("Saurabh"), testClass.hash("Mittal"));
    }
}