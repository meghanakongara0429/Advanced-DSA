import java.util.*;
class ThreeSum1
{
     public static void threeSum(int[] nums,int target) {
        int n=nums.length;
       
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
        
            for(int j=0;j<n-1;j++)
            {
                for(int k=0;k<n-2;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==target && i!=j && i!=k && j!=k)
                    {
                        List<Integer>l=new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);

                        Collections.sort(l);
                        if(!res.contains(l))
                        res.add(l);
                    }
                }
            }
        }
        // System.out.println(res.size());
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