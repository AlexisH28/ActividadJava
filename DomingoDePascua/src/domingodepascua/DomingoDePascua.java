/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingodepascua;

import java.util.Scanner;

/**
 *
 * @author Alexis Hernandez
 */
public class DomingoDePascua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Estimado Usuario");
        System.out.println("Ingresar el año para lograr calcular el Domingo de Pascua");
        int year = teclado.nextInt();
        
        int A = year % 19;
        int B = year % 4;
        int C = year % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E;
        
        if (N <= 31) {
            System.out.println("El Domingo de Pascua para el año " + year + " es el " + N + " de marzo.");
        } else {
            int dayInApril = N - 31;
            System.out.println("El Domingo de Pascua para el año " + year + " es el " + dayInApril + " de abril.");
        }
    }    
}
