import java.util.Scanner;

/*
Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.

Given 'N', print the corresponding pattern.

Example:
Input: ‘N’ = 3

Output:

1         1
1 2     2 1
1 2 3 3 2 1
 */
public class Pattern12 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print17(n);
    }

    public static void print17(int n){
        for(int i =1; i <= n; i++){
            for(int j = 1; j <= i;j++){
                System.out.print(j);
            }
            for(int j = 0; j < (2*n-2*i);j++){
                System.out.print(" ");
            }
            for(int j = i; j >0 ;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
