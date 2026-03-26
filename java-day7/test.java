import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");      
        String str=sc.nextLine();
        if(str==null || str.isEmpty())
        {
            sc.close();
            System.out.println("0");
        }
        int c=0;
        boolean isWord=false;
        for(int i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            if(ch!=' '&&ch!='-' &&ch!='\n'&&ch!='\t')
            {
                if(!isWord)
                {
                    c++;
                    isWord=true;
                }
            }
            else
            {
                isWord=false;
            }
        }
        sc.close();
        System.out.println(c);
    }
}
