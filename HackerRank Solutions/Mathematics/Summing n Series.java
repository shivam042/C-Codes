import java.util.*;
public class Solution
{
    static long calculate(long n)
    {
        return (n*n)%1000000007;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            long num=sc.nextLong();
            num=num%1000000007;
           // System.out.println("num: "+num);
            long a=calculate(num);
            
                System.out.println(a);
        }
    }
}