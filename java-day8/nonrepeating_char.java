import java.util.*;
public class nonrepeating_char {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word:");
        String str=sc.next();
        int len=str.length();
        
        for(int i=0;i<len;i++)
        {
            char ch1=str.charAt(i);
            int c=0;
            for(int j=i+1;j<len;j++)
            {
                char ch2=str.charAt(j);
                if(ch2==ch1)
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println(ch1);
                i=len;
            }
        }
        sc.close();
    }   
}
