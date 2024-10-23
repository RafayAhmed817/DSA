
package dsa_lab01;

import java.util.Scanner;

public class DSA_lab01_task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//    Q# Find the sum of n natural numbers in 2d Array
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int sum = 0;
        
        
        int arr[][] = new int[rows][columns];
        
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt(); 
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += arr[i][j]; 
            }
        }
        
        System.out.println("Sum of all elements: " + sum);
        
        sc.close(); 
    }
}
