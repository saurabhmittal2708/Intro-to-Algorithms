/*
 * L09.karpRabin
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L09;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class karpRabin implements SubstringSearch
{
    @Override
    public List<Integer> Search(String s, String t)
    {
        int hashS= hash(s);
        List<Integer> finds= new ArrayList<Integer>();
        for(int i=0; i<=t.length()-s.length();i++)
        {
            if(hash(t.substring(i,i+s.length()))==hashS)
            {
                if(s.equals(t.substring(i, i+s.length())))
                {
                    finds.add(i);
                }
            }
        }
        return finds;

    }

    public int hash(String s)
    {
        int hash=0;
        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            hash+=(int)(pow(10*1.0, i*1.0)*(int)c);
        }
        return hash;
    }
}
