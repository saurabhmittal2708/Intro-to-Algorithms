/*
 * L10.linearProbing
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L10;

import java.util.Random;

public class linearProbing extends openAddressHash
{
    Random rng= new Random();
    private int a;
    private int b;

    public linearProbing(int maxSize)
    {
        super(maxSize);
        a = rng.nextInt(100)+1;
        b = rng.nextInt(100)+1;
    }

    @Override
    public int hash(int key, int attempt)
    {
        return (hash(key)+attempt)%this.getMaxSize();
    }

    public int hash(int key)
    {
        int p=37;                                                              //(prime) p> |table|
        return ((a*key+b)%p)%this.getMaxSize();
    }
}
