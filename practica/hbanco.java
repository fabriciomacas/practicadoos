/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

//EVALUACION DESEMPEÑO DE VENDEDORES

import java.util.Random;


 
public class hbanco {
               

 public static void hbanco () {
        final int NUM_VENDEDORES = 30;
        final int DIAS_DEL_MES = 30;

        Random rand = new Random();

        for (int vendedor = 1; vendedor <= NUM_VENDEDORES; vendedor++) {
            int diasExcelentes = 0;
            int diasMillonarios = 0;
            int diasBajoRendimiento = 0;

            for (int dia = 1; dia <= DIAS_DEL_MES; dia++) {
                int venta = rand.nextInt(1000) + 1; 

                if (venta > 900) {
                    diasMillonarios++;
                    diasExcelentes++; 
                } else if (venta > 500) {
                    diasExcelentes++;
                } else if (venta < 100) {
                    diasBajoRendimiento++;
                }
            }

            System.out.printf(" Vendedor #%02d\n", vendedor);
            System.out.println(" - Días excelentes:       " + diasExcelentes);
            System.out.println(" - Días millonarios:      " + diasMillonarios);
            System.out.println(" - Días bajo rendimiento: " + diasBajoRendimiento);
            System.out.println("----------------------------------");
        }
    
    
 }
}
