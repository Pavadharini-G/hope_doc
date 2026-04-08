import java.util.*;
public class closest {
    public static void main(String[] args) {
        //obtaining array and target values
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("enter the target value:");
        int target=sc.nextInt();
        int result=Closest(arr,target);
        System.out.println("The closest value is "+result);
        sc.close();
    }
    public static int Closest(int[] arr,int target)
    {
        TreeSet<Integer> Tset=new TreeSet<>();
        for(int i:arr) // adding the values to treeset
        {
            Tset.add(i);
        }
        Integer h=Tset.higher(target); //nearest largest value - Integer must be used becoz Tset is used.
        Integer l=Tset.lower(target); //nearest lower value
        if(l==null)
        {
            return h;
        }
        else if(h==null)
        {
            return l;
        }
        int diff1=java.lang.Math.abs(target-l);
        int diff2=java.lang.Math.abs(h-target);
        if(diff1<=diff2)
        {
            return l;
        }
        else
        {
            return h;
        }
    }
}
