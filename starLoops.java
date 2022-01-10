package com.kvstarter;

public class starLoops {

    public static void main(String[] args) {

//   1)--------------------------------------------------
        for (int i=0; i < 4; i++) {
            for (int m = 0; m < 10; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//   2)--------------------------------------------------

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("");
            }
            for (int k = 0; k < (i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//   3)--------------------------------------------------
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//   4)--------------------------------------------------

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





