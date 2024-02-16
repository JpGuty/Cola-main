/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Cola.Base;

/**
 *
 * @author juan_p.gutierrez
 */
public class Personas extends Base{
    
    private String nombrePersona;
    
    private String nombreCorreo;

    public Personas() {
    }

    public Personas(String nombrePersona, String nombreCorreo) {
        this.nombrePersona = nombrePersona;
        this.nombreCorreo = nombreCorreo;
    }

        
    
    /**
     * Get the value of nombreCorreo
     *
     * @return the value of nombreCorreo
     */
    public String getNombreCorreo() {
        return nombreCorreo;
    }

    /**
     * Set the value of nombreCorreo
     *
     * @param nombreCorreo new value of nombreCorreo
     */
    public void setNombreCorreo(String nombreCorreo) {
        this.nombreCorreo = nombreCorreo;
    }

    /**
     * Get the value of nombrePersona
     *
     * @return the value of nombrePersona
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Set the value of nombrePersona
     *
     * @param nombrePersona new value of nombrePersona
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public Base copy() {
        return new Personas(nombrePersona, nombreCorreo);
    }

    @Override
    public String toString() {
        return "Personas{" + "nombrePersona=" + nombrePersona + ", nombreCorreo=" + nombreCorreo + '}';
    }

    
}
