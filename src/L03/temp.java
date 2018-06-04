/*
 * L03.temp
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 2:30 PM
 * Last modified on 23/5/18 12:26 PM
 */

package L03;
import java.util.*;
class temp
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        ArrayList<Integer> array2=new ArrayList<Integer>();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        array2.add(4);
        try {
            System.out.println(array.subList(5,5));
            
        } catch (Exception e) {
           
        }
        try {
            array2.addAll(new ArrayList(array.subList(2,3)));
            System.out.println(array2);

        } catch (Exception e) {
            
        }
        
    }
}