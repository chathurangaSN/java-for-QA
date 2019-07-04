package com.sachee;

import java.util.Scanner;

public class MultipleTable {
    public void sleepMethod(){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        MultipleTable multipleTable = new MultipleTable();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=scanner.nextInt();

        System.out.print("\t\t");
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 0; i < n+2 ; i++) {
            System.out.print("----");
        }

        System.out.println();
        for (int i = 1; i <=n ; i++) {
            multipleTable.sleepMethod();
            System.out.print(i+"\t|");
            for (int j = 1; j <=n ; j++) {
                System.out.print("\t"+j*i);
            }
            System.out.println();
        }
    }

}
