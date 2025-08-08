import java.util.ArrayList;
import java.util.Scanner;

class JobSequencing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<int[]>jobs=new ArrayList<>();
        int maxd=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            int d=sc.nextInt();
            jobs.add(new int[]{p,d});
            maxd=Math.max(maxd,d);
        }
        jobs.sort((a,b)->Integer.compare(b[0],a[0]));
        boolean slots[]=new boolean[maxd+1];
        int ans=0;
        for(int job[]:jobs)
        {
            for(int t=job[1];t>0;t--)
            {
                if(!slots[t])
                {
                    slots[t]=true;
                    ans+=job[0];
                    break;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
