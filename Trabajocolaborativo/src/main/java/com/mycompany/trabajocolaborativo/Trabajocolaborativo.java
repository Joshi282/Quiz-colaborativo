/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajocolaborativo;

 import java.util.Scanner;
/**
 *
 * @author almi0
 */
public class Trabajocolaborativo {

    public Trabajocolaborativo() {
    }
    

  public void ejercicio(){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Primer numero: ");
      int a = sc.nextInt();
      System.out.print("segundo numero:");
      int b = sc.nextInt();
      int resultado;
      if(a == b){
      resultado = a * b;
      } else if (a > b){
         resultado = a - b;
         
      } else{
          resultado = a + b;
          
      }
      
      System.out.println("Resultado: " + resultado);
      
    }
    
    }
