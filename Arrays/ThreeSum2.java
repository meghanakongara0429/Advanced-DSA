import java.util.*;
class ThreeSum2
{
     public static void threeSum(int[] nums,int target) {
        int n=nums.length;
       
        List<List<Integer>>res=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            HashSet<Integer>hm=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int nt=target-(nums[i]+nums[j]);
                if(hm.contains(nt))
                {
                    List<Integer>l=Arrays.asList(nums[i],nums[j],nt);
                    Collections.sort(l);
                    if(!res.contains(l))res.add(l);
                }
                else hm.add(nums[j]);
              
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