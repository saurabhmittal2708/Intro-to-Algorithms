/*
 * L03.insertion
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L03;

class insertion
{
    public static void main(String[] args)
    {
        int[] array={7,5,4,8,1,3};
      
        printArray(insertionSort(array));
    }

        

        


    public static int[] insertionSort(int[] array)
    {
        int sorted=0;
        for(int i=1;i<array.length;i++)
        {
            for(int j=sorted; j>=0; j--)
            {
                if(array[j]> array[j+1])
                {
                    array[j+1]+=array[j];
                    array[j]=array[j+1]-array[j];
                    array[j+1]=array[j+1]-array[j];
                }
                else{
                    break;
                }
            }
            printArray(array);
            sorted++;
        }
        return array;
    }

    public static void printArray(int[] array)
    {
        for(int i=0; i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        return;
    }
}