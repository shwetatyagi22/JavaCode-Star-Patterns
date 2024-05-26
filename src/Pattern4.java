import java.util.Scanner;

/*
Problem statement
Sam is making a Triangular painting for a maths project.

An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers representing the row number.

For every value of ‘N’, help sam to print the corresponding Triangle.

Example:
Input: ‘N’ = 3

Output:
1
2 2
3 3 3
 */
public class Pattern4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print4(n);
    }
    public static void print4(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
