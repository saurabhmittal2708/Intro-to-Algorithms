/*
 * L08.chaining
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L08;

import java.util.Arrays;

abstract class chaining implements Dictionary
{
    private node[] table;

    public int getMaxSize()
    {
        return maxSize;
    }

    private int maxSize;

    public chaining(int maxSize)
    {
        this.table = new node[maxSize];
        this.maxSize=maxSize;
    }

    @Override
    public void insert(Item item)
    {

        int hash=hash(item.getKey());

        if(hash<0 | hash> maxSize-1)
        {
            System.out.println("Hashed key out of bounds. maxSize= "+this.maxSize);
            return;
        }
        if(table[hash]==null)
        {
            table[hash]=new node(item.value);
            return;
        }

        node keyNode= table[hash];
        while(keyNode.getNext() != null)
        {
            keyNode=keyNode.getNext();
        }
        keyNode.setNext(new node(item.value));
    }

    @Override
    public Item search(int key)
    {
        int hash=hash(key);
        if(hash<0 | hash> maxSize-1)
        {
            return null;
        }

        if(this.table[hash]==null)
        {
            return null;
        }

        return new Item(key, this.table[hash].getNodVal());
    }

    @Override
    public void delete(Item item)
    {
        int hash= hash(item.getKey());
        if(hash<0 | hash> maxSize-1)
        {
            return;
        }
        if(table[hash]==null)
        {
            return;
        }

        if(table[hash].getNext()==null)
        {
            if(table[hash].getNodVal().equals(item.value))
            {
                table[hash]=null;
                return;
            }
            return;
        }
        node keyNode= table[hash];
        node prevNode=null;
        while((!keyNode.getNodVal().equals(item.value)) & keyNode.getNext()!=null)
        {
            prevNode=keyNode;
            keyNode=keyNode.getNext();
        }

        if(!keyNode.getNodVal().equals(item.value))
        {
            return;
        }

        if(prevNode==null)
        {
            table[hash]=keyNode.getNext();
            return;
        }

        prevNode.setNext(keyNode.getNext());
    }

    @Override
    public String toString()
    {
        return "chaining{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}

class node
{
    private String nodVal;
    private node next;

    public node(String nodVal, node next)
    {
        this.nodVal = nodVal;
        this.next = next;
    }

    public node(String nodVal)
    {
        this.nodVal = nodVal;
        next=null;
    }

    public String getNodVal()
    {
        return nodVal;
    }

    public void setNodVal(String nodVal)
    {
        this.nodVal = nodVal;
    }

    public node getNext()
    {
        return next;
    }

    public void setNext(node next)
    {
        this.next = next;
    }

    @Override
    public String toString()
    {
        return "node{" +
                "nodVal='" + nodVal + '\'' +
                ", next=" + next +
                '}';
    }
}
