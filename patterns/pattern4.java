public class pattern4 {
    public static void main(String[] args)
    {
        int n=5;//no. of rows
        for(int i=0;i<n;i++)
       {
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=2*(n-i)-1;j++)
        {
            System.out.print("*");
        }
        
        System.out.println();
       }
    }
}
