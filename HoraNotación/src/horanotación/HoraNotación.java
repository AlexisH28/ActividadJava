/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horanotación;

import java.util.Scanner;

/**
 *
 * @author Alexis Hernandez
 */
public class HoraNotación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Estimado Usuario");
        System.out.println("Ingresar la hora en formato de 24 horas (ejemplo: 13:45)--> ");
        String hora24 = teclado.nextLine();
        
        int hora = Integer.parseInt(hora24.substring(0,2));
        
        String minutos = hora24.substring(3);
        
        String periodo = (hora < 12) ? "am" : "pm";
        
        hora = (hora == 0) ? 12 : (hora > 12) ? hora - 12 : hora;
         
        System.out.println("La hora en formato (notación) de 12 horas es: " + hora + ":" + minutos + " " + periodo);         
    }    
}
