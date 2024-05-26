import java.util.Scanner;
/*
roblem Statement: Given an integer N, print the following pattern :

* * * * * *
* *     * *
*         *
*         *
* *     * *
* * * * * *
Here, N = 3.
 */
public class Pattern19 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print15(n);
    }

    public static void print15(int n){

        for(int i =0; i < n; i++){
            for(int j = 0; j < n-i;j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*(i);j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0; i < n; i++){
            for(int j = 0; j <= i;j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
