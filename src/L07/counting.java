/*
 * L07.counting
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L07;

import lib.sorting;

import java.util.ArrayList;
import java.util.List;

public class counting extends sorting
{
    public static void main(String[] args)
    {
        int[] testArray={4,5,1,7,9,0};
        System.out.println(countingSort(testArray, 10).toString());

    }

    public static List<Integer> countingSort(int[] array, int k)           //array[0..n} <=k
    {
        List<List<Integer>> sorted =new ArrayList<List<Integer>>();
        for(int i=0; i<k; i++)
        {
            sorted.add(new ArrayList<Integer>());
        }
        for(int i=0; i<array.length; i++)
        {
            sorted.get(array[i]).add(array[i]);
        }

        List<Integer> counted= new ArrayList<Integer>();
        for(int i=0; i<k; i++)
        {
            if(!sorted.get(i).isEmpty())
                counted.addAll(sorted.get(i));
        }
        return counted;

    }
}
