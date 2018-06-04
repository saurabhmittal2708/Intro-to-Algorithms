/*
 * L08.Dictionary
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 2/6/18 10:36 PM
 */

package L08;

public interface Dictionary
{
    public void insert(Item item);
    public void delete(Item item);
    public Item search(int key);
    public int hash(int key);
    public int hash(int key, int attempt);
}