/*
 * L09.karpRabinV2
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 3/6/18 1:12 PM
 */

package L09;

public class karpRabinV2 extends karpRabin
{
    public karpRabinV2()
    {
    }

    @Override
    public int hash(String s)
    {
        int hash=0;
        try
        {
            hash+=(int)s.charAt(0);
        } catch (Exception e)
        { }

        try
        {
            hash+=(int)s.charAt(s.length()/2);
        } catch (Exception e)
        { }

        try
        {
            hash+=(int)s.charAt(s.length()-1);
        } catch (Exception e)
        { }

        return hash;
    }
}
