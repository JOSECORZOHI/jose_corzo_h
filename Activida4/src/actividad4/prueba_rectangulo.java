/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

import java.util.Scanner;

/**
 *
 * @author joseg
 */
public class prueba_rectangulo {
    public static void main(String arg[]){
        Scanner acceso = new Scanner(System.in);
        Rectangulo Rectangulo1= new Rectangulo();
        System.out.print("digite la longitud=");
        double longuitud=acceso.nextDouble();
        System.out.print("digite el ancho=");
        double ancho=acceso.nextDouble();
        Rectangulo1.setLonguitud(longuitud);
        Rectangulo1.setAncho(ancho);
        System.out.print("el area del rectangulo es:"+Rectangulo1.Area());
        System.out.print("el perimetro es:"+Rectangulo1.Perimetro());
        
        
        
    }
    
}
