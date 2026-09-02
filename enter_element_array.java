// import java.util.*;
// public class enter_element_array {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int [] wow=new int[n];
//         for (int i = 0; i < n; i++) {
//             wow[i]=sc.nextInt();
//         }
//         System.out.println("enter a and b");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int [] arr=new int[n+1];
//         int count=0;
//         for (int i = 0; i < n+1; i++) {
//             if(i==a)
//             {
//              arr[i]=b;
//              System.out.print(" "+arr[i]);
//             }
//             if(i>a) 
//                 {
//                     arr[i]=wow[count];
//                     System.out.print(" "+arr[i]);
//                     count++;
//             }
//             else
//                 {
//                     arr[i]=wow[count];
//                     System.out.print(" "+arr[i]);
//                     count++;
//                 }
//         }
//         // for (int i = 0; i < n+1; i++) {
//         //     System.out.print(" "+arr[i]);
//         }
//     }

import java.util.*;
public class enter_element_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] wow=new int[n];
        for (int i = 0; i < n; i++) {
            wow[i]=sc.nextInt();
        }
        System.out.println("enter a ");
        int a=sc.nextInt();
        int [] arr=new int[n-1];
        int count=0;
        for (int i = 0; i < n-1; i++) {
                if(i==a)
                {
                    count++;
                }
                else
                    {
                    arr[i]=wow[count];
                    System.out.print(" "+arr[i]);
                    count++;
                }
        }
        // for (int i = 0; i < n+1; i++) {
        //     System.out.print(" "+arr[i]);
        }
    }




