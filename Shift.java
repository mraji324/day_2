import java.util.*;
public class Shift
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         System.out.println(a<<1);
         System.out.println(b>>1);
         System.out.println(a<<b);
         System.out.println(a>>b);
    }
}