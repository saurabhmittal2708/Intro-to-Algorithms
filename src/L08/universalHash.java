/*
 * L08.universalHash
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 3/6/18 9:49 AM
 */

package L08;

import java.util.Random;

public class universalHash extends chaining
{
    private Random rng= new Random();
    private int a= rng.nextInt(100)+1;
    private int b= rng.nextInt(100)+1;
    universalHash(int maxSize)
    {
        super(maxSize);
    }

    @Override
    public int hash(int key)
    {
        int p=37;                                                              //(prime) p> |table|
        return ((a*key+b)%p)%this.getMaxSize();
    }

    @Override
    public int hash(int key, int attempt)
    {
        return hash(key);
    }
}
