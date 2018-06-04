/*
 * lib.prime
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 3/6/18 9:51 AM
 */

package lib;

public class prime
{
    public static void main(String[] args)
    {
        for(int i=0;i<1000;i++)
        {
            int flag=0;
            for(int j=2; j<i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }

    }
}
