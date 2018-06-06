/*
 * L10.doubleProbing
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L10;

import java.util.Random;

public class doubleProbing extends openAddressHash
{
    Random rng= new Random();
    private int a;
    private int b;

    private int a2;
    private int b2;

    public doubleProbing(int maxSize)
    {
        super(maxSize);
        a = rng.nextInt(100)+1;
        b = rng.nextInt(100)+1;
        a2 = rng.nextInt(100)+1;
        b2 = rng.nextInt(100)+1;
    }

    @Override
    public int hash(int key)
    {
        int p=37;                                                              //(prime) p> |table|
        return ((a*key+b)%p)%this.getMaxSize();
    }

    private int hash2(int key)
    {
        int p=43;
        return ((a2*key+b2)%p)%this.getMaxSize();
    }
    @Override
    public int hash(int key, int attempt)
    {
        return (hash(key)+attempt*hash2(key))%this.getMaxSize();
    }
}
