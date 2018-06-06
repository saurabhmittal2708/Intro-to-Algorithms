/*
 * lib.sorting
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
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
