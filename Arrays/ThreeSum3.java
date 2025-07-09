import java.util.*;
class ThreeSum3
{
     public static void threeSum(int[] arr,int target) {
        int n=arr.length;
       Arrays.sort(arr);
        List<List<Integer>>res=new ArrayList<>();
       for(int i=0;i<n-2;i++)
       {
            while(i>0 && arr[i]==arr[i-1])continue;
            int left=i+1,right=n-1;
            while(left<right)
            {
                int sum=arr[left]+arr[right]+arr[i];
                if(sum==target)
                {
                  
                    List<Integer>l=Arrays.asList(arr[i],arr[left],arr[right]);
                    res.add(l);
                      while(left<right && arr[left]==arr[left+1])left++;
                    while(left<right && arr[right]==arr[right])right--;
                    left++;
                    right--;
                }
                else if(sum<target)
                left++;
                else
                right--;
            }
       }
        
        for(List<Integer>i:res)
       {
            for(Integer x:i)
            System.out.print(x+" ");
            System.out.println();
       }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
         System.out.println("Enter target value:");
        int target=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
      threeSum(a,target);
      
    
    }
}