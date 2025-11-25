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
    private double totalC;
    private boolean descuentoDispo;
    private String  fechaR;
    
    public Cliente(int id, String nombre, int telefono, String correo, String Direccion, double totalC,boolean descuentoDispo, String fechaR){
        super(id,nombre,telefono,correo);
        this.Direccion = Direccion;
        this.totalC = totalC;
        this.descuentoDispo = descuentoDispo;
        this.fechaR = fechaR;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public void setTotalC(double totalC){
        this.totalC = totalC;
    }
    public void setFechaR(String fechaR){
        this.fechaR = fechaR;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public double getTotalC(){
        return totalC;
    }
    
    public String getFechaR(){
        return fechaR;
    }
}
