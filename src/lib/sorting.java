/*
 * lib.sorting
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 1/6/18 12:54 PM
 */

package lib;

import java.util.List;

public class sorting
{
    public static boolean isSorted(List<Integer> array)
    {
        if(array.isEmpty())
            return true;
        for(int i=1; i<array.size(); i++)
        {
            if(array.get(i-1)>array.get(i))
                return false;
        }
        return true;
    }
}
