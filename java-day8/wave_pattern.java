/* i/p: viratkohli => v r t o l  => o/p: vrtoliakhl
                       i a k h l
*/
import java.util.*;
public class wave_pattern 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i+=2)
        {
            ans.append(str.charAt(i));
        }
        for(int j=1;j<str.length();j+=2)
        {
            ans.append(str.charAt(j));
        }
        sc.close();
        System.out.println(ans);
    }
}
