import java.util.*;
public class fibonacci {
     
    public static void fibon(int a)
    {
        int n1=1,n2=0,c=0;
        for (int i = 0; i < a; i++) {
            System.out.println(c);
             c=n1+n2;
             n1=n2;
             n2=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter a:-"+sc.nextInt());
        fibon(a);
        sc.close();
    }
}


