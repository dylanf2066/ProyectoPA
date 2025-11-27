/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;

/**
 *
 * @author bellitodylan
 */
public class ItemVenta {
    private int cantidad;
    Producto producto = new Producto();
    
    public ItemVenta(){
        
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void CalcularSubTotal(){
         double subtotal=0;
         if(!producto.ActivarOferta())
            subtotal+= producto.getNormalPrecio();
        else
            subtotal = producto.getOfertaPrecio();
    }
}
