/*
 * L09.Simple
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 3/6/18 10:34 AM
 */

package L09;

import java.util.ArrayList;
import java.util.List;

public class Simple implements SubstringSearch
{
    @Override
    public List<Integer> Search(String s, String t)
    {
        List<Integer> finds = new ArrayList<Integer>();
        for(int i=0; i<t.length()-s.length(); i++)
        {
            if(s.equals(t.substring(i, i+s.length())))
            {
                finds.add(i);
            }
        }
        return finds;
    }
}
