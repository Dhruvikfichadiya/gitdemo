package org.example;
public class Main {
    public static void main(String[] args) {
        int i, j;


// "*" Star Pattern

//        right angle Triangle

//        for ( i = 1; i <= 6; i++) {
//            for( j = 1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

//        reverse of right angle triangle pattern

//        for (i=1;i<=5;i++){
//            for (j = 5;j>=i; j--){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

//        Pyramid pattern
        int k;
        for (i = 1 ;i <= 6; i++){
            for (j=5; j >= i; j--){
                System.out.print(" ");
            }
            for (k=1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}