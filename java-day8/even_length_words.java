import java.util.*;
public class even_length_words {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        int c=0;
        //boolean word=false;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<l;i++)
        {
            
            char ch=str.charAt(i);
            sb.append(ch);
            if(ch!=' ' && ch!='\n' && ch!='\t')
            {
                c++;
            }
            else
            {
                if(c>0 && c%2==0)
                {    
                    System.out.print(sb);                   
                }
                sb.setLength(0);
                c=0;
            }
        }
        if (c > 0 && c % 2 == 0) {
            System.out.print(sb);
        }
        sc.close();
    }
}
