/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.t1p1;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHT1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Pablo Serrano Hernández A01410753 (IMT)
        System.out.println("Calculadora de Promedios");
        //variables
        Scanner teclado =new Scanner (System.in);
        String mat, res;
        double c1,c2,c3,c4,c5,prom;
        
        //Ejecucion
        System.out.println("Ingrese la matricula del alumno");
        mat= teclado.nextLine();
        
        System.out.println("Ingrese sus calificaciones Parciales");
        c1 = teclado.nextDouble();
        c2 = teclado.nextDouble();
        c3 = teclado.nextDouble();
        c4 =teclado.nextDouble();
        c5 =teclado.nextDouble();
        
        // Calculos
        prom = (c1+c2+c3+c4+c5)/5;
        if (prom<7.0) {
            res = "Reprobado";
        } else {
            res= "Aprobado";
        }
      //Resultados
        System.out.println ("El promedio de "+ mat+ " es de " + prom);
        System.out.println("El estudiante  esta "+ res);
    }
    
}
