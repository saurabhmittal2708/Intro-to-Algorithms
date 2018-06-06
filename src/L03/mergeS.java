/*
 * L03.mergeS
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L03;
import java.util.*;
class mergeS
{
    public static void main(String[] args)
    {
        int[] array={0,5,1,8,9};


        System.out.println(mergeSort(toAL(array)));



    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> array)
    {
        if(array.size()==1)
        {
            return array;
        }
        int mid=array.size()/2;
        int len=array.size();
       return merge(mergeSort(new ArrayList(array.subList(0,mid))) ,mergeSort(new ArrayList(array.subList(mid, len))));




    }

    public static ArrayList<Integer> toAL(int[] iarray)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<iarray.length; i++)
        {
            al.add(iarray[i]);
        }
        return al;
    }


    public static ArrayList<Integer> merge(ArrayList<Integer> array1, ArrayList<Integer> array2)
    {
        ArrayList<Integer> mergeArray= new ArrayList<Integer>();
        int i=0, j=0;
        for(;i<array1.size() & j<array2.size();)
        {
            if(array1.get(i)<array2.get(j))
            {
                mergeArray.add(array1.get(i));
                i++;
            }
            else
            {
                mergeArray.add(array2.get(j));
                j++;
            }
        }
        try {
            //System.out.println(array1.get(i));
            mergeArray.addAll(new ArrayList(array1.subList(i, array1.size())));
            //printArrayList(new ArrayList(array1.subList(i, array1.size())));
        } catch (Exception Array1_Used) {
            //System.out.println("Array1 used");
        }

        try {
            //System.out.println(array2.get(j));
            mergeArray.addAll(new ArrayList(array2.subList(j, array2.size())));
           // printArrayList(new ArrayList(array2.subList(j, array2.size())));
        } catch (Exception Array2_Used) {
            //System.out.println("Array2 used");
        }

        return mergeArray;
    }

    public static void printArrayList(ArrayList<Integer> array)
    {
        Iterator itr=array.iterator();  
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");  
        }
        System.out.println();
    }
}