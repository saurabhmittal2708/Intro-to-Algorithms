/*
 * L01_Java.twoDpeak
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 23/5/18 3:12 PM
 */

package L01_Java;
import java.util.*;

class twoDpeak
{
    public static void main(String[] args)
    {
       // int[][] testArray={{1,2,3},{4,11,6},{7,8,9}};
       int[][] testArray=randomArray();
        printArray(testArray);
        System.out.println(peak(testArray));
        
    }

    public static int peak(int[][] array)
    {
        int row=array.length;
        //int col=array[0].length;
        int mid=row/2;
        if(row==1)
        {
            return array[0][globalmax(array[0])];
        }

        int midmax=globalmax(array[mid]);
        try {
            if(array[mid+1][midmax]>= array[mid][midmax])
            {
                return peak(Arrays.copyOfRange(array, mid+1, row));
            }
        } catch (Exception Outerbound) {
            }

        try {
            if(array[mid-1][midmax] >= array[mid][midmax])
            {
                return peak(Arrays.copyOfRange(array, 0, mid));
            }
        } catch (Exception Innerbound) {
            }
        
        return array[mid][midmax];
    }

    public static int globalmax(int[] array)
    {
        int max=0;
        for(int i=0;i<array.length; i++)
        {
            if(array[i]>array[max])
            {
                max=i;
            }
        }
        return max;
    }

    public static void printArray(int[][] array)
    {
        for(int i=0; i<array.length;i++)
        {
            for(int j=0; j<array[0].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] randomArray()
    {
        int[][] randArray={{0,0,0},{0,0,0},{0,0,0}};
        Random rand= new Random();
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                randArray[i][j]=rand.nextInt(9);
            }
        }
        return randArray;

    }
}