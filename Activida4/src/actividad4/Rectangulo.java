/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;

/**
 *
 * @author joseg
 */
public class Rectangulo {
    private double longuitud;
    private double ancho;
    public Rectangulo(){
        this.longuitud=0;
        this.ancho=0;       
    }
    public double getLonguitud(){
        return this.longuitud;
    }
    public double getAncho(){
        return this.ancho;
    }
    public void setLonguitud(double longuitud){
        this.longuitud=longuitud;
    }
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    public double Area(){
        return(this.ancho * this.longuitud);
    }
    public double Perimetro(){
        return((this.ancho + this.longuitud)*2);
    }
    

    
}
