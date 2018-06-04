/*
 * L01_Java.oneDpeakV2
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 23/5/18 3:14 PM
 */

/**
 * 1dPeak_Bisection
 */
package L01_Java;

import java.util.*;
public class oneDpeakV2 {

    public static void main(String[] args)
    {
       //int[] numbers={1,2,3,4,5,6,7};
        //System.out.println(peakfinder(numbers));
       
        System.out.println(testSuite.test());

    }

    public static int peakfinder(int[] numbers) {
        
        int peak=numbers[0];
        int len=numbers.length;
        int mid=len/2;
        //System.out.println(numbers[mid]);
        /*if(numbers.length==1)
        {
            peak=numbers[0];
            return peak;
         }*/
      
        try {
            if(numbers[mid] <= numbers[mid+1]){
                peak=peakfinder(Arrays.copyOfRange(numbers, mid+1, numbers.length));
                return peak;
                //System.out.println(peak);
            }
            
        } catch (Exception Outerbound) {  
        }

        try {
            if(numbers[mid] <= numbers[mid-1]){
                peak=peakfinder(Arrays.copyOfRange(numbers, 0, mid));
                return peak;
                //System.out.println(peak);
            }
            
        } catch (Exception Innerbound) {
        }
        
        peak=numbers[mid];
        return peak;
        //System.out.println(peak);
        
    }

}

class testSuite
{

    public static String conv(int[] array)
    {
        String result="";
        for(int i=0;i<array.length;i++)
        {
            result+=array[i];
        }
        return result;
    }

    public static int test()
    {
        int i=1;
        if(!ascendingEven(i))
        {
            return 1;
        }

        if(!ascendingOdd(i))
        return 2;

        if(!descendingEven(i))
        return 3;

        if(!descendingOdd(i))
        return 4;

        if(!middleOdd(i))
        return 5;

        if(!middleEven(i))
        return 6;

        if(!randomTest(i))
        return 7;

        return 0;

    }

    private static boolean ascendingOdd(int verbose)
    {
        int[] testArray={1,2,3,4,5,6,7};
        if(oneDpeakV2.peakfinder(testArray)==7)
        {
            return true;
        }
        if(verbose==1)
        {
            System.out.println("testArray= "+conv(testArray)+" result is "+oneDpeakV2.peakfinder(testArray));
        }
        return false;
    }

    private static boolean ascendingEven(int verbose)
    {
        int[] testArray={1,2,3,4,5,6,7,8};
        if(oneDpeakV2.peakfinder(testArray)==8)
        {
            return true;
        }
        if(verbose==1)
        {
            System.out.println("testArray= "+conv(testArray)+" result is "+oneDpeakV2.peakfinder(testArray));
        }
        
        return false;
    }

    private static boolean descendingOdd(int verbose)
    {
        int[] testArray={7,6,5,4,3,2,1};
        if(oneDpeakV2.peakfinder(testArray)==7)
        {
            return true;
        }
        if(verbose==1)
        {
            System.out.println("testArray= "+conv(testArray)+" result is "+oneDpeakV2.peakfinder(testArray));
        }
        return false;
    }

    private static boolean descendingEven(int verbose)
    {
        int[] testArray={8,7,6,5,4,3,2,1};
        if(oneDpeakV2.peakfinder(testArray)==8)
        {
            return true;
        }
        if(verbose==1)
        {
            System.out.println("testArray= "+conv(testArray)+" result is "+oneDpeakV2.peakfinder(testArray));
        }
        return false;
    }

    private static boolean middleOdd(int verbose)
    {
        int[] testArray={1,2,3,4,3,2,1};
        if(oneDpeakV2.peakfinder(testArray)==4)
        {
            return true;
        }
        if(verbose==1)
        {
            System.out.println("testArray= "+conv(testArray)+" result is "+oneDpeakV2.peakfinder(testArray));
        }
        return false;
    }

    private static boolean middleEven(int verbose)
    {
        int[] testArray={1,2,3,4,3,2,1,0};
        if(oneDpeakV2.peakfinder(testArray)!=4)
        {
            return false;
        }
        if(verbose==1)
        {
            System.out.println("testArray= "+conv(testArray)+" result is "+oneDpeakV2.peakfinder(testArray));
        }
        int[] testArray2={0,1,2,3,4,3,2,1};
        if(oneDpeakV2.peakfinder(testArray2)!=4)
        {
            return false;
        }
        if(verbose==1)
        {
            System.out.println("testArray= "+conv(testArray)+" result is "+oneDpeakV2.peakfinder(testArray));
        }
        return true;
    }

    private static boolean randomTest(int verbose)
    {
        Random rand = new Random();
        int[] randomArray={0,0,0,0,0,0,0};
        for(int i=0;i<7;i++)
        {
            randomArray[i]=rand.nextInt(9);
        }
        System.out.println(conv(randomArray));
        System.out.println("Result for peak is "+oneDpeakV2.peakfinder(randomArray));
        Scanner in= new Scanner(System.in);
        System.out.println("Is this result correct?");
        int flag=in.nextInt();
        in.close();
        if(flag==0)
        {
            return true;
        }

        if(verbose==1)
        {
            System.out.println("randomArray= "+conv(randomArray)+" result is "+oneDpeakV2.peakfinder(randomArray));
        }
        return false;
        

    }



}