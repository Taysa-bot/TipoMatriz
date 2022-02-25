/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

import java.util.Scanner;

/**
 *
 * @author 20181094010025
 */
public class Q5 {

//    matriz.length; linha
//    matriz[0].length; coluna
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("OBS: As matrizes tem que ser de mesma ordem");
        System.out.println("Informe a dimensão de colunas e linhas");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        int matriz[][] = new int[linha][coluna];
        int matriz2[][] = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Informe o elemento da posição " + "[" + i + "]" + "[" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Informe o elemento da posição " + "[" + i + "]" + "[" + j + "]");
                matriz2[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i] [j]+matriz2[i] [j]+"\t");    ;
                 
            }
            System.out.println("");
        }
    }

}
