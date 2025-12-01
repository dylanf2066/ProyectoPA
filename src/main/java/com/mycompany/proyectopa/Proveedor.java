/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;
import java.util.*;
/**
 *
 * @author dylan
 */
public class Proveedor extends Persona{
    private String  nomEmpresa;
    private String  direccion;
    private String  tipoProducto;
    private ArrayList<Producto> Productos;
    
    public Proveedor(int id, String nombre, String telefono, String correo){
        super(id,nombre,telefono,correo);
    }
    
    public void setNombreEmpresa(String nomEmpresa){
        this.nomEmpresa = nomEmpresa;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setTipoProducto(String tipoProducto){
        this.tipoProducto = tipoProducto;
    }
    
    public String getNombreEmpresa(){
        return nomEmpresa;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTipoProducto(){
        return tipoProducto;
    }
    public void setProducto(Producto p){
        this.Productos.add(p);
    }       
    public void getProductos(){
        if(!Productos.isEmpty()){
            for(Producto p:Productos){
                System.out.println("ID:"+p.getID());
                System.out.println("Nombre: "+p.getNombre());
                System.out.println("Precio: "+p.getNormalPrecio());
                System.out.println("Precio de Oferta: "+p.getOfertaPrecio());
                System.out.println("Inicio de Oferta: "+p.getIncOfer());
                System.out.println("Fin de Oferta: "+p.getFinOfer());
                System.out.println("Categoria: "+p.getCategoria());
                System.out.println("Descripcion: "+p.getDescripcion());
                System.out.println("Cantidad en Almacen: "+p.getStock());
                System.out.println("Caducidad: "+p.getCaducidad());
                System.out.println("Codigo de Barras: "+p.getCodigoBarras());
                System.out.println("------------------------------------------------");
            }
        }
    }
    public ArrayList<Producto> getLista(){
        return Productos;
    }
    @Override
    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println("Empresa: "+nomEmpresa);
        System.out.println("Direccion: "+direccion);
        System.out.println("Tipo de Productos: "+tipoProducto);
    }
}
