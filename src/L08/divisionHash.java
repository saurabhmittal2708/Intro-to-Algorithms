/*
 * L08.divisionHash
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 3/6/18 9:53 AM
 */

package L08;

public class divisionHash extends chaining
{

    public divisionHash(int maxSize)
    {
        super(maxSize);
    }

    @Override
    public int hash(int key)
    {
        return key%getMaxSize();
    }
    public int hash(int key, int attempt)
    {
        return hash(key);
    }
}
