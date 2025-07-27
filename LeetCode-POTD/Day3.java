import java.util.Scanner;

class Day3 {
      public static int countHillValley(int[] nums) {
  int a[]=new int[nums.length];
        a[0]=nums[0];
        int m=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            a[m++]=nums[i];
        }
        int c=0;
        for(int i=1;i<m-1;i++)
        {
            if((a[i-1]>a[i] && a[i+1]>a[i])||(a[i-1]<a[i] && a[i+1]<a[i]))
            c++;
        }
        return c;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values in the array:");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println(countHillValley(a));
        sc.close();

    }
}