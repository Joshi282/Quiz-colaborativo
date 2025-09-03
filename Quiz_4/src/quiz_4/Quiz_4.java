/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_4;

/**
 *
 * @author josha
 */
import java.util.Scanner;
public class Quiz_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Ingresa un número: ");
        int numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }
    }
    
}
