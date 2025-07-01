import java.util.*;
class DFSIterative
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter no:of vertices:");
        int n=sc.nextInt();
        System.out.println("Enter no:of edges:");
        int m=sc.nextInt();
        int edges[][]=new int[m][2];
        System.out.println("Enter edges:");
        for(int i=0;i<m;i++)
        {
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int i=0;i<m;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Stack<Integer>st=new Stack<>();
        st.add(0);
        boolean visited[]=new boolean[n];
        visited[0]=true;
        System.out.print("DFS TRAVERSAL: ");
        while(!st.isEmpty())
        {
            int curr=st.pop();
            System.out.print(curr+" ");
            for(int x:adj.get(curr))
            {
                if(!visited[x])
                {
                    st.push(x);
                    visited[x]=true;
                }
            }
        }
    }
}