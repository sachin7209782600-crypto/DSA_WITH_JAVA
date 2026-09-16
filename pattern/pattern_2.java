import java.util.*;
public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int num=sc.nextInt();
        // for (int i = 0; i < num; i++) {
        //     for (int j = 0; j < num; j++) {
        //         if(i==j)
        //         {
        //             System.out.print("* ");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(" ");
//   *      
//    *     
//     *    
//      *   
//       *  


// int val=num;
// for (int i = 0; i <num; i++) {
//     for (int j =0 ; j <= num; j++) {
//         if(val==j)
//         {
//             System.out.print("* ");
//         }
//         else
//         {
//             System.out.print(" ");
//         }
//     }
//     val--;
//     System.out.println(" ");
// }
//      *  
//     *   
//    *    
//   *     
//  *   

// or if(i+j==6)

    int mid=num/2;
            int val=1;
            for (int i = 0; i < mid; i++) {
                for (int j = 0; j < mid-i; j++) {
                   System.out.print("* ");
                }
                for (int j = 0; j < val; j++) {
                   System.out.print("  ");
                }
                for (int j = 0; j < mid-i; j++) {
                    System.out.print("* ");
                }
                val+=2;
                System.out.println(" ");
            }
            val-=2;
            for (int i = 0; i < mid; i++) {
                for (int j = 0; j <i+2; j++) {
                   System.out.print("* ");
                }
                for (int j = 0; j < val; j++) {
                   System.out.print(" ");
                }
                for (int j = 0; j < i+2; j++) {
                    System.out.print(" *");
                }
                val-=2;
                System.out.println(" ");
            }

        }
    }

