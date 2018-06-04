/*
 * L01_Java.oneDPeak_Bisection
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 23/5/18 12:25 PM
 */

/**
 * 1dPeak_Bisection
 */
package L01_Java;

import java.util.*;
public class oneDPeak_Bisection {

    public static void main(String[] args)
    {
        int[] numbers={1,5,7,6,9,4,3};
        System.out.println(peakfinder(numbers));
    }

    public static int peakfinder(int[] numbers) {
        
        int peak=numbers[0];
        int len=numbers.length;
        int mid=len/2;
        int flag=0;
        //System.out.println(numbers[mid]);
        if(numbers.length==1)
        {
            peak=numbers[0];
            return peak;
        }

        try {
            if(numbers[mid]>= numbers[mid-1] & numbers[mid]>= numbers[mid+1])
            {
                peak=numbers[mid];
                return peak;
            }
        } catch (Exception e) {
        }

        try {
            if(numbers[mid] <= numbers[mid+1]){
                flag=1;
                peak=peakfinder(Arrays.copyOfRange(numbers, mid+1, numbers.length));
                return peak;
                //System.out.println(peak);
            }
            
        } catch (Exception Outerbound) {
            try {
                if(numbers[mid] <= numbers[mid-1]){
                    flag=1;
                    peak=peakfinder(Arrays.copyOfRange(numbers, 0, mid));
                    return peak;
                   // System.out.println(peak);
                }
            } catch (Exception OuterInnerbound) {
                peak=mid;
                return peak;
               // System.out.println(peak);
            }
            
        }

        try {
            if(numbers[mid] <= numbers[mid-1]){
                flag=1;
                peak=peakfinder(Arrays.copyOfRange(numbers, 0, mid));
                return peak;
                //System.out.println(peak);
            }
            
        } catch (Exception Innerbound) {
            try {
                if(numbers[mid] <= numbers[mid+1]){
                    flag=1;
                    peak=peakfinder(Arrays.copyOfRange(numbers, mid+1, numbers.length));
                    return peak;
                    //System.out.println(peak);
                }
            } catch (Exception InnerOuterbound) {
                peak=mid;
                return peak;
                //System.out.println(peak);
            }
            
        }
        if(flag==0)
        {
            peak=mid;
            return peak;
            //System.out.println(peak);
        }


        return peak;
        
    }
}