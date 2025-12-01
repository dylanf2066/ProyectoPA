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
public class Producto {
    private int ID;
    private String Nombre;
    private String Descripcion;//
    private double Precio;
    private double PrecioOferta;
    private LocalDate InicioOferta;//= LocalDate.now();
    private LocalDate FinOferta;//=LocalDate.now();
    private int Stock;
    private LocalDate Caducidad;
    private String Categoria;
    private long CodigoBarras;//
    private boolean Activ;//
    private Proveedor Provee;
    
    
    public void ReducirStock(int cantidad){
        Stock-=cantidad;
    }
    
    public boolean DesactivarOferta(){
        return Activ=false;
    }
    
    public boolean ActivarOferta(){
        return Activ = true;
    }
    
    public void MostrarInfoProd(){
        System.out.println("PRODUCTO");
        System.out.println(ID +" : "+ Nombre);
        System.out.println("Codigo: "+CodigoBarras);
        System.out.println("Caducidad: " + Caducidad);
        if((InicioOferta!=null) && (InicioOferta.isAfter(LocalDate.now())) && (FinOferta!=null)&&(FinOferta.isBefore(LocalDate.now())) ){
        System.out.println("Descripcion: "+Descripcion);
        System.out.println("Precio: "+Precio);
        System.out.println("Cantidad en Almacen: "+Stock);
        System.out.println("Proveedor Asignado: "+Provee.getNombre());
        if(Activ){
            System.out.println("Precio de oferta"+PrecioOferta);
            System.out.println("Inicio de oferta: "+InicioOferta);
            System.out.println("Fin de oferta: "+FinOferta);
            System.out.println("Precio: "+ PrecioOferta );
        }
        System.out.println("Precio: "+ Precio);
    }
    
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
    public void setIncOfer(int y, int m, int d){
        this.InicioOferta = LocalDate.of(y,m,d);
    }
    public LocalDate getIncOfer(){
        return InicioOferta;
    }
    public void setFinOfer(int y, int m,int d){
        this.FinOferta = LocalDate.of(y,m,d);
    }
    public LocalDate getFinOfer(){
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
    public void setCaducidad(int y,int m,int d){
        this.Caducidad = LocalDate.of(y, m, d);
    }
    public LocalDate getCaducidad(){
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
    
    
    public void setProveedor(Proveedor p){
        this.Provee=p;
    }
    public Proveedor getProveedor(){
        return this.Provee;
    }
}
