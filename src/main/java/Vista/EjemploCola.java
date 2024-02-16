/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Cola.Cola;
import Modelo.Personas;

/**
 *
 * @author juan_p.gutierrez
 */
public class EjemploCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cola<Personas> colaP = new Cola<>();
        colaP.encolar(new Personas("David", "dacastro@uao.edu.co"));
        colaP.encolar(new Personas("Jp", "asd@uao.edu.co"));
        colaP.encolar(new Personas("asd", "uasd@uao.edu.co"));
        
        System.out.println("Elementos en cola "+ colaP.toString());
        for (int i = 0; i < 10; i++) {
            if(!colaP.estaVacia()){
                colaP.desencolar();
                System.out.println("Elementos en cola "+ colaP.toString());
            }else{
                System.out.println("Cola vacia");
            }
        }
       
        
    }
    
}
