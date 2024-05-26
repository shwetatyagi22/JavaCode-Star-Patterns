import java.util.Scanner;

/*Problem statement
Sam is researching on Alpha-Triangles. So, he needs to create them for different integers ‘N’.

An Alpha-Triangle is represented by the triangular pattern of alphabets in reverse order.

For every value of ‘N’, help sam to print the corresponding Alpha-Triangle.

        Example:
Input: ‘N’ = 3

Output:
C
BC
ABC
*/
public class Pattern18 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print15(n);
    }

    public static void print15(int n){

        for(int i =0; i < n; i++){
            char ch = 'A';
            for(int j = (n-i-1); j < n;j++){
                System.out.print((char)(((int)ch)+j));
            }
            for(int j = 0; j < (n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
