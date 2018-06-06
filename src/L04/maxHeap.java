/*
 * L04.maxHeap
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L04;
import java.util.Random;
class maxHeap
{
    public static void main(String[] args)
    {
        Integer a[]=new Integer[]{0,0,0,0,0,0};
        Random rn= new Random();
        for(int i=0; i<6;i++)
        {
            a[i]=rn.nextInt(9);
        }

        printArray(a);
        heapSort(a);
        printArray(a);


    }

    public static void heapSort(Integer[] array)
    {
        int heapSize=array.length-1;
        int len=array.length-1;
        buildMaxHeap(array);
        //printArray(array);
        //System.out.println("^after buildMaxHeap");
        while(heapSize>0)
        {
            array[0]+=array[len];
            array[len]=array[0]-array[len];
            array[0]=array[0]-array[len];
            //printArray(array);
            //System.out.println("^after swapping");
            heapSize--;
            len--;
            maxHeapify(array, 1, heapSize);
            //printArray(array);
            //System.out.println("^after maxHeapify(one loop complete)");
        }
        return;
    }

    public static void buildMaxHeap(Integer[] array)
    {
        int len=array.length;
        for(int i=len/2-1;i>=0; i--)
        {
            maxHeapify(array, i+1);
        }
        return;

    }


    public static void maxHeapify(Integer[] heap, int position)
    {
        int heapsize=heap.length;
        int left=2*position;
        int right=2*position+1;
        int largest=position;
        try {
            if((heap[left-1]> heap[position-1]))
            {
                largest=left;
            }
            else
            {
                  largest=position;
            }
        } catch (Exception left_child_does_not_exist) {
        }
        
        try {
            if(heap[right-1]> heap[largest-1] & right-1 <= heapsize)
            {
                largest=right;
            }
        } catch (Exception right_child_does_not_exist) {
        }
        
        if(largest != position)
        {
            heap[largest-1]+=heap[position-1];
            heap[position-1]=heap[largest-1]-heap[position-1];
            heap[largest-1]=heap[largest-1]-heap[position-1];
            maxHeapify(heap, largest);
            
        }
        return;

    }

    public static void maxHeapify(Integer[] heap, int position, int heapSize)
    {
        int left=2*position;
        int right=2*position+1;
        int largest=position;
        try {
            if((heap[left-1]> heap[position-1]) & left-1 <= heapSize)
            {
                largest=left;
            }
            else
            {
                  largest=position;
            }
        } catch (Exception left_child_does_not_exist) {
        }
        
        try {
            if(heap[right-1]> heap[largest-1] & right-1 <= heapSize)
            {
                largest=right;
            }
        } catch (Exception right_child_does_not_exist) {
        }
        
        if(largest != position)
        {
            heap[largest-1]+=heap[position-1];
            heap[position-1]=heap[largest-1]-heap[position-1];
            heap[largest-1]=heap[largest-1]-heap[position-1];
            maxHeapify(heap, largest, heapSize);
            //printArray(heap);
            //System.out.println("in maxHeapify");
            return;
        }
        //printArray(heap);        
        //System.out.println("in maxHeapify");
        return;

    }

    public static void printArray(Integer[] array)
    {
        for(int i=0; i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        return;
    }

    public static void printHeap(Integer[] a)
    {
        StringBuilder sb = new StringBuilder();
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<a.length;j++)
            {
                if(j>max)
                {
                    max=j;
                }
            }

        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<a.length;j++)
            {
                for(int k=0;(k<max/((int)Math.pow(2, i)));k++)
                {
                    sb.append(" ");
                }
            sb.append(a[j+(int)Math.pow(2,i)-1]+" ");
            }
            sb.append("\n");

        }
        System.out.println(sb.toString());

    }
    


}