/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package llamar;

//for

import practica.mcm;
import practica.mcd;
import practica.nodivisibles;
import practica.raiz;

//while
import practica.wdigitos;
import practica.wdpares;
import practica.wmultiplo7;
import practica.wpalindromo;

//switch
import practica.scaract;
import practica.sestacion;
import practica.smes;
import practica.ssemaf;

//do while
import practica.doaleato;
import practica.doedad;
import practica.dopot;
import practica.dovocal;

//5 ejercicios dificiles
import practica.hauto;
import practica.hbanco;
import practica.hcontinv;
import practica.hcultivo;
import practica.hdaclima;

public class llamar1 {
        public static void main(String[] args) {
            
           //for
           
           mcd ejercicio1 = new mcd();
           mcm ejercicio2 = new mcm();
           nodivisibles ejercicio3 = new nodivisibles();
           raiz ejercicio4 = new raiz();
           
           //while
           wdigitos ejercicio5 = new wdigitos();
           wdpares ejercicio6 = new wdpares();
           wmultiplo7 ejercicio7 = new wmultiplo7();
           wpalindromo ejercicio8 = new wpalindromo();
           
           //switch
           scaract ejercicio9 = new scaract();
           sestacion ejercicio10 = new sestacion();
           smes ejercicio11 = new smes();
           ssemaf ejercicio12 = new ssemaf();
           
           //do while
           doaleato ejercicio13 = new doaleato();
           dovocal ejercicio14 = new dovocal();
           doedad ejercicio15 = new doedad();
           dopot ejercicio16 = new dopot();
           
           //ejercicios dificiles
           hauto ejercicio17 = new hauto();
           hbanco ejercicio18 = new hbanco();
          hcontinv ejercicio19 = new hcontinv();
           hcultivo ejercicio20 = new hcultivo();
           hdaclima ejercicio21 = new hdaclima();
           
           
            System.out.println("calcular el mcd de dos numeros");
            ejercicio1.mcd();
            
            System.out.println("calcular el mcm de dos numeros");
            ejercicio2.mcm();
            
            System.out.println("calcular numeros no divisibles ni por ni 5 del uno al 100");
            ejercicio3.nodivisible();
        
            System.out.println("calcular la raiz entera de un numero");
            ejercicio4.raiz();
            
            
            System.out.println("calcular el cuantos digitos tiene un numero");
            ejercicio5.wdigitos();
            
            System.out.println("calcular la suma de dos digitos pares");
            ejercicio6.wdpares();
            
            System.out.println("ingrese numeros hasta llegar a un multiplo de 7");
            ejercicio7.multiplo();
            
            System.out.println("calcular si un numero es palindromo o no");
            ejercicio8.palindromo();
            
            
            System.out.println("detectar si una letra es vocal o consonante");
            ejercicio9.scaract();
            
            System.out.println("Ingrese un numero de mes para saber su estacion");
            ejercicio10.sestacion();
            
            System.out.println("ingrese un numero del 1-12 para saber el mes");
            ejercicio11.smes();
            
            System.out.println("Simulador de un semaforo");
            ejercicio12.ssemaf();
            
            
            System.out.println("suma numeros hasta alcanzar un total minimo");
            ejercicio13.doaleato();
            
            System.out.println("ingrese letras hasta que se repota una vocal");
            ejercicio14.dovocal();
            
            System.out.println("ingrese edades para calcular cuantos son mayor de edad ");
            ejercicio15.doedad();
            
            System.out.println("Tabla de potencia del dops hasta llegar al 1000");
            ejercicio16.dopot();
            
           
            
            System.out.println("compañia de autos");
            ejercicio17.hauto();
            
            System.out.println("Evaluación de desempeño de vendedores");
            ejercicio18.hbanco();
            
            System.out.println("Control de inventario en tienda de electrónica");
            ejercicio19.hcontinv();
        
            System.out.println("Optimización de riego en cultivo");
            ejercicio20.hcultivo();
            
            System.out.println("Análisis de datos climáticos");
            ejercicio21.hdaclima();
        

          
           
           
       
           
           
           
        }

    
    
}
