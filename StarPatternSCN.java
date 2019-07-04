package com.sachee;


import java.util.Scanner;
public class StarPatternSCN {
    public static void main(String[] args) {
        StarPattern starPattern = new StarPattern();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=scanner.nextInt();

        int m = n-1;
        for (int i = 0; i < n ; i++) {
            for (int j = n; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("*");
            }
            for (int l = 0; l< i ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = m; k >i ; k--) {
                System.out.print("*");
            }
            for (int l = m; l >i+1 ; l--) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}

