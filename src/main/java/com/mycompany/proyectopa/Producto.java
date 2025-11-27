/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;

/**
 *
 * @author dylan
 */
public class Producto {
    private int ID;
    private String Nombre;
    private String Descripcion;//
    private double Precio;
    private double PrecioOferta;
    private String InicioOferta;
    private String FinOferta;
    private int Stock;
    private String Caducidad;
    private String Categoria;
    private long CodigoBarras;//
    private boolean Activ;//
    
    
    
    
    public void ReducirStock(){}
    
    public void DesactivarOferta(){}
    
    public void ActivarOferta(){}
    
    public void MostrarInfoProd(){}
    
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    public String getDescripcion(){
        return Descripcion;
    }
    public void setNormalPrecio(Double Precio){
        this.Precio = Precio;
    }
    public double getNormalPrecio(){
        return Precio;
    }
    public void setOfertaPrecio(Double PrecioOferta){
        this.PrecioOferta = PrecioOferta;
    }
    public double getOfertaPrecio(){
        return PrecioOferta;
    }
    public void setIncOfer(String IncioOferta){
        this.InicioOferta = InicioOferta;
    }
    public String getIncOfer(){
        return InicioOferta;
    }
    public void setFinOfer(String FinOferta){
        this.FinOferta = FinOferta;
    }
    public String getFinOfer(){
        return FinOferta;
    }
    public void setActivOfer(Boolean Activ){
        this.Activ = Activ;
    }
    public boolean getActivOfer(){
        return Activ;
    }
    public void setStock(int Stock){
        this.Stock = Stock;
    }
    public int getStock(){
        return Stock;
    }
    public void setCaducidad(String Caducidad){
        this.Caducidad = Caducidad;
    }
    public String getCaducidad(){
        return Caducidad;
    }
    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }
    public String getCategoria(){
        return Categoria;
    }
    public void setCodigoBarras(long CodigoBarras){
        this.CodigoBarras = CodigoBarras;
    }
    public long getCodigoBarras(){
        return CodigoBarras;
    }
}
