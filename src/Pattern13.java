import java.util.Scanner;
/*
Problem statement
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Number Triangle.

Example:
Input: ‘N’ = 3

Output:

1
2 3
4 5 6
 */
public class Pattern13 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print10_Another_Solution(n);
    }
    public static void print10(int n){
        int s = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int a = j +s;
                System.out.print(a+" ");
                if(j == i){
                    s = a;
                }
            }

            System.out.println();
        }
    }
    public static void print10_Another_Solution(int n){
        int s = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                s++;
                System.out.print(s+" ");
            }

            System.out.println();
        }
    }
}
