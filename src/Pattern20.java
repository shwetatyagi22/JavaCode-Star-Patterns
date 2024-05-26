import java.util.Scanner;

/*
Sam is curious about symmetric patterns, so he decided to create one.

For every value of ‘N’, return the symmetry as shown in the example.

Example:
Input: ‘N’ = 3

Output:
*         *
* *     * *
* * * * * *
* *     * *
*         *
 */
public class Pattern20 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        anotherApproach20(n);
    }

    public static void print20(int n){
        int in = 2;
        for(int i =0; i < (2*n-1); i++){

            if( i >=n){
                for(int j = 0; j < (2*n - i-1);j++){
                    System.out.print("*");
                }
                for(int j = 0; j < in;j++){
                    System.out.print(" ");
                }
                for(int j = 0; j < (2*n - i-1);j++){
                    System.out.print("*");
                }
                in = in+2;
            }else{
                for(int j = 0; j <= i;j++){
                    System.out.print("*");
                }
                for(int j = 0; j < 2*(n-i-1);j++){
                    System.out.print(" ");
                }
                for(int j = 0; j <= i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void anotherApproach20(int n){
        int space = 2*n -2;
        for(int i = 1; i<=(2*n-1); i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j = 0; j < stars; j++ ){
                System.out.print("*");
            }
            for(int j = 0; j < space; j++ ){
                System.out.print(" ");
            }
            for(int j = 0; j < stars; j++ ){
                System.out.print("*");
            }
            System.out.println();
            if(i < n) space= space -2;
            else space = space+2;
        }
    }
}
