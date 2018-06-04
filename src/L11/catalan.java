/*
 * L11.catalan
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 8:11 PM
 * Last modified on 3/6/18 8:11 PM
 */

package L11;

class catalan
{
    static Integer[] table= new Integer[20];
    public static void main(String[] args)
    {
        table[0]=1;
        for(int i=0; i<20; i++)
            System.out.println(catalan(i));
    }
    public static int catalan(int n)
    {
        if(n==0)
        {
            return 1;
        }

        int cn=0;
        for(int k=0; k<n;k++)
        {
            cn+= table[k]*table[n-k-1];
        }
        table[n]=cn;
        return cn;
    }
}
