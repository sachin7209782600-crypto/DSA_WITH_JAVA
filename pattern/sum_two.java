import java.util.*;
public class sum_two {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:-");
        int a=sc.nextInt();
        System.out.println("enter b:-");
        int b=sc.nextInt();
        int ans=sum(a,b);
        System.out.println("sum of two number is :-"+ans);
        sc.close();
    }
}
