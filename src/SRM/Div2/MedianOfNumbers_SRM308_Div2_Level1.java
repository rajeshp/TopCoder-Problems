package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/28/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MedianOfNumbers_SRM308_Div2_Level1 {

    public int findMedian(int[] numbers)
    {

        if(numbers!=null)
        {

            if(numbers.length%2!=0)
            {
                quickSort(numbers,0,numbers.length-1);
                return numbers[numbers.length/2];

            }
            else
                return -1;


        }

        return -1;
    }

   static void quickSort(int[] arr, int start, int end)
    {
        if(start>=end) return ;

        int p = (start+end)/2;

        //swap pivot and right element
        swap(arr,p,end);

        for(int i=0;i<p;i++)
        {
            if(arr[i]>arr[end])
            {
                swap(arr,i,end);
            }
        }

        swap(arr,end,p);

        //swap(arr,0,p);

        for(int i=p+1;i<=end;i++)
        {
           if(arr[i]<arr[p])
           {
               swap(arr,p,i);
               p++;
           }
        }

        if(arr[p]>arr[end])
            swap(arr,p,end);

        quickSort(arr,0,p-1);
        quickSort(arr,p+1,end);

    }

   static void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args)
    {
        /*int[] arr = new int[]{1, 4, 2, 5, 7};
        int[] arr1 = new int[]{1,5,7,6,9,-13,15,2,17,13, 4, 2, 5, 7,12,-12,3,5,3,5,7};

        quickSort(arr1,0,arr1.length-1);

        for(int i=0;i<arr1.length;i++)
        System.out.print(arr1[i]+" ");*/

      int[] input1 = new int[]{1, 4, 2, 5, 7};
      int[] input2 = new int[]{1, 5, 8, 3};
      int[] input3 = new int[]{7};
      int[] input4 = new int[]{7, 12};
      int[] input5 = new int[]{66, 53, 47, 86, 18, 21, 97, 92, 15};
      int[] input6 = new int[]{32, 54, 27, 4, 69, 96, 73, 1, 100, 15, 21};



        MedianOfNumbers_SRM308_Div2_Level1 obj = new MedianOfNumbers_SRM308_Div2_Level1();

      int case1 = obj.findMedian(input1);
      int case2 = obj.findMedian(input2);
      int case3 = obj.findMedian(input3);
      int case4 = obj.findMedian(input4);
      int case5 = obj.findMedian(input5);
      int case6 = obj.findMedian(input6);

      System.out.println(case1);
      System.out.println(case2);
      System.out.println(case3);
      System.out.println(case4);
      System.out.println(case5);
      System.out.println(case6);


    }

}
