/*
 * L10.openAddressHash
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 3/6/18 10:23 AM
 */

package L10;

import L08.Dictionary;
import L08.Item;

import java.util.Arrays;

public abstract class openAddressHash implements Dictionary
{
    private Item[] table;
    private int maxSize;

    public openAddressHash(int maxSize)
    {
        this.table= new Item[maxSize];
        this.maxSize = maxSize;
    }

    public int getMaxSize()
    {
        return maxSize;
    }

    @Override
    public void insert(Item item)
    {
        for(int j=0; j<this.getMaxSize()-1;j++)
        {
            int hash=hash(item.getKey(), j);
            if(table[hash]==null)
            {
                table[hash]=item;
                return;
            }
            if(table[hash].getValue().equals("null"))
            {
                table[hash]=item;
                return;
            }

        }
        System.out.println("exhausted sequence. Could not insert element");

    }

    @Override
    public void delete(Item item)
    {
        for(int j=0; j<this.getMaxSize()-1;j++)
        {
            int hash=hash(item.getKey(),j);
            if(table[hash]==null)
            {
                return;
            }
            if(table[hash].getValue().equals(item.getValue()) & table[hash].getKey()==item.getKey())
            {
                table[hash].setValue("null");
                return;
            }
        }
    }

    @Override
    public Item search(int key)
    {
        for(int j=0; j<this.getMaxSize()-1; j++)
        {
            int hash=hash(key, j);
            if(table[hash]==null)
            {
                return null;
            }
            if(table[hash].getKey()==key)
            {
                return table[hash];
            }
        }
        //System.out.println("exhausted table. Couldn't find item with key= "+key);
        return null;
    }

    @Override
    public String toString()
    {
        return "openAddressHash{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
