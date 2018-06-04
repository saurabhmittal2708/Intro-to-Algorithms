/*
 * L07.radix
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 2/6/18 4:31 PM
 */

package L07;

import lib.sorting;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class radix extends sorting
{

    public static void main(String[] args)
    {

    }

    public static List<Integer> radixSort(Integer[] array, int d)
    {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for(int i=0; i<10; i++)
        {
            lists.add(new ArrayList<Integer>());
        }

        for(int i=0; i<array.length; i++)
        {
            lists.get(nSd(array[i], d)).add(array[i]);
        }

        List<Integer> sorted=new ArrayList<Integer>();
        if(d==1)
        {
            for(int i=0; i<10; i++)
            {
                if(!lists.get(i).isEmpty())
                {
                    sorted.addAll(lists.get(i));
                }
            }
            return sorted;
        }

        for(int i=0; i<10; i++)
        {
            lists.set(i,radixSort(lists.get(i).toArray(new Integer[0]), d-1));
            if(!lists.get(i).isEmpty())
            {
                sorted.addAll(lists.get(i));
            }
        }
        return sorted;


    }

    public static int nSd(int num, int n)
    {

        if(num<0)
        {
            System.out.println("number is negative");
            return 0;
        }

        if(n<1)
        {
            System.out.println("Error nSd: n<1");
            return 0;
        }

        n=(int)pow(10,n-1);

        return (num/n)%10;
    }
}
