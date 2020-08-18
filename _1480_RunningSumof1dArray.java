import java.util.Scanner;
class Solution {
    static public int[] runningSum(int[] nums) 
    {
        int s=nums.length;
        int arr[]=new int[s];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++)
                arr[i]=arr[i-1]+nums[i];
         return arr ;
    }
  /*  public static void main(String args[])
    {
        //System.out.println();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<num.length;i++)
            num[i]=sc.nextInt();
        int hold[]=runningSum(num);
        for(int i=0;i<num.length;i++)
            System.out.println(hold[i]);
    }*/
}
