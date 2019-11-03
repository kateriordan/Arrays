import java.util.Random;

public class Arrays
{
    int sum = 0;
    double average = 0;
    long product = 1;
    public int[] randomNumbers (int size)
    {
        size = size;
        Random sam = new Random ();
        int [] array = new int [size];

        for (int x=0; x<size; x++)
        {
            array[x] = sam.nextInt (100+1);
        }
        return array;
    }

    public void displayArray (int[] arr)
    {
        for (int x=0; x<arr.length; x++)
        {
            System.out.println (arr[x]);
        }
        System.out.println ("Done.");
    }

    public int calculateSum (int[] arr)
    {
        int sum = 0;
        for (int x=0; x<arr.length; x++)
        {
            sum = sum + arr[x] ;
        }
        return sum;
    }

    public double calculateAverage (int[] arr)
    {
        double average = (double) calculateSum (arr) / arr.length;
        return average;
    }

    public long calculateProduct (int[] arr)
    {
        for (int x=0; x<arr.length; x++)
        {
            product = arr[x] * product;
        }
        return product;
    }
    
        public void swap (int [] arr, int one, int two)
    {
        int temp = arr [one];
        arr [one] = arr [two];
        arr [two] = temp;
    }

    public void sortAscending (int [] arr)
    {
        int num = 0;
        for (int x=0; x<arr.length-1; x++)
        {
            for (int y=num; y<arr.length; y++)
            {
                int minimum = arr [num];
                if (arr[y] < minimum)
                {
                    minimum = arr [y];
                    swap (arr, num, y);
                }
            }

            num = num + 1;
        }
        displayArray (arr);
        System.out.println("The array has been sorted.");
    }
}

