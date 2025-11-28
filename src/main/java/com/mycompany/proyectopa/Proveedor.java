/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;

/**
 *
 * @author dylan
 */
public class Proveedor extends Persona{
    private String  nomEmpresa;
    private String  direccion;
    private String  tipoProducto;
    
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
            
}
