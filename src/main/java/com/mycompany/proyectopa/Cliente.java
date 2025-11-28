/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;

/**
 *
 * @author dylan
 */
public class Cliente extends Persona{
    private String Direccion;
    private int totalC;//diego lo cambio de double a entero
    private int descuentoDispo;
    private String  fechaR;
    
    public Cliente(int id, String nombre, String telefono, String correo){
        super(id,nombre,telefono,correo);
        this.Direccion = "";
        this.totalC = 0;
        this.descuentoDispo = 0;
        this.fechaR = "";
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public void setTotalC(int totalC){
        this.totalC = totalC;
    }
    public void setFechaR(String fechaR){
        this.fechaR = fechaR;
    }
    public void setDecuento(int desc){
        this.descuentoDispo=desc;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public int getTotalC(){
        return totalC;
    }
    
    public String getFechaR(){
        return fechaR;
    }
    public int getDescuento(){
        return descuentoDispo;
    }
}
