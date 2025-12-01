/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;
import java.time.*;
/**
 *
 * @author dylan
 */
public class Cliente extends Persona{
    private String Direccion;
    private double totalC=0;//total acumulado (todas las compras)
    private int descuentoDispo;
    private LocalDate  fechaR;
    
    public Cliente(){}
    
    public Cliente(int id, String nombre, String telefono, String correo){
        super(id,nombre,telefono,correo);
        this.Direccion = "";
        this.totalC = 0;
        this.descuentoDispo = 0;
        this.fechaR = null;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public void setTotalC(double totalC){
        this.totalC = totalC;
    }
    public void setFechaR(LocalDate fechaR){
        this.fechaR = fechaR;
    }
    public void setDecuento(int desc){
        this.descuentoDispo=desc;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public double getTotalC(){
        return totalC;
    }
    
    public LocalDate getFechaR(){
        return fechaR;
    }
    public int getDescuento(){
        return descuentoDispo;
    }
}
