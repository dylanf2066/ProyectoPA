/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;

/**
 *
 * @author dylan
 */
public class Ventas {
    private int ID;
    private String Fecha;
    private String hora;
    private double TotalVenta;
    private int DescuentoAplicado;
    private double Pago;
    private double cambio;
    
    public void CalctularTotal(){}
    public void MostrarResumen(){}
    public void CalcularDescuento(){}
    public int getID(){
        return ID;
    }
    public void setPago(Double Pago){
        this.Pago = Pago;
    }
    public double getPago(){
        return Pago;
    }
    public double getCambio(){
        return cambio;
    }
    public void CalcularCambio(){}
    
}
