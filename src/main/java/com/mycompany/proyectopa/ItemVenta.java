/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;

import java.time.LocalDate;

/**
 *
 * @author bellitodylan
 */
public class ItemVenta {
    private int cantidad;
    private Producto producto = new Producto();
    private double subtotal=0;
    
    public ItemVenta(){
        
    }
    
    public ItemVenta(Producto producto, int cantidad){
        this.cantidad = cantidad;
        this.producto = producto;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setProducto(Producto producto){
        this.producto = producto;
    }
    
    public Producto getProducto(){
        return producto;
    }
    
    
    public double CalcularSubTotal(){
        
         if((producto.getIncOfer()!=null)&&(producto.getIncOfer().isAfter(LocalDate.now())) && (producto.getFinOfer()!=null)&&(producto.getFinOfer().isBefore(LocalDate.now())) )
            subtotal = producto.getOfertaPrecio()*cantidad; 
        else
           subtotal = producto.getNormalPrecio()*cantidad;
        
         return subtotal;
    }
}
