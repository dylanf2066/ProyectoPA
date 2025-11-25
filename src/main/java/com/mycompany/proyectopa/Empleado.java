/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;

/**
 *
 * @author dylan
 */
public class Empleado extends Persona{
    private String usuario;
    private String password;
    private String puesto;
    
    public Empleado(int id, String nombre, int telefono, String correo){
        super(id,nombre,telefono,correo);
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    
    public String getUsuario(){
        return usuario;
    }
    public String getContraseña(){
        return password;
    }
    public String getPuesto(){
        return puesto;
    }
}
