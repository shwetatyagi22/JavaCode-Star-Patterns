import java.util.Scanner;

/*
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.

Example:
Input: ‘N’ = 3

Output:

1 2 3
1 2
1
 */
public class Pattern6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print6(n);
    }
    public static void print6(int n){
        for(int i =0; i< n;i++){
            for(int j = 1; j <= n -i; j++){
                System.out.print(j+" ");
            }
            for(int j = n-1; j <n; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
