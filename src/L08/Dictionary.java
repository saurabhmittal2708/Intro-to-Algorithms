/*
 * L08.Dictionary
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
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