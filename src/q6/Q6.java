/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.util.Scanner;

/**
 *
 * @author 20181094010025
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Informe o elemento da posição " + "[" + i + "]" + "[" + j + "}");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("");
        }
        System.out.println("Diagonal da Matriz : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        int cont = 0, cont2 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    if (matriz[i][j] == 1) {
                        cont++;
                    }
                } else if (i != j) {
                    if (matriz[i][j] == 0) {
                        cont2++;
                    }
                }

            }
        }
        if (cont == 4 && cont2 == 12) {
            System.out.println("Matriz identidade");
        } else {
            System.out.println("Matriz não é identidade");
        }
        System.out.println("Matriz transposta");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[j] [i]+"\t");
            }
            System.out.println("");
                    
        }
    }
}
