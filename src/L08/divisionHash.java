/*
 * L08.divisionHash
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
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
