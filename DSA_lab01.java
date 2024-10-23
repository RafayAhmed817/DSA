package dsa_lab01;

import java.util.Scanner;

public class DSA_lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find the sum of natural numbers");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0; i<=n; i++){
             sum+=i;
        }
        System.out.println("the sum of n natural numbers is"+sum);
    }
    
}
