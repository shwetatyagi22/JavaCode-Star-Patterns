import java.util.Scanner;

/*
Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

For every value of ‘N’, print the field if the trees are represented by ‘*’.

Example:
Input: ‘N’ = 3

Output:
* * *
* *
*
 */
public class Pattern5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print5(n);
    }
    public static void print5(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("* ");
            }
            for(int j = n-i; j < n; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
