/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopa;
import java.util.*;
/**
 *
 * @author equipo dylan diego
 */



public class ProyectoPA {

    public static void AccionesAdmin(){
    System.out.println("Soy el admin loco");
    
    }
    public static void AccionesVendedor(){
        System.out.println("Soy el vendedor");
    }
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           Empleado Admin = new Empleado(28941, "Admin",911,"Correo@gmail");
           Admin.setPassword("12345");
           Admin.setPuesto("Administrador");
           
           
           Empleado Vendedor = new Empleado(789,"Juanito",45612312,"juanito@correo");
           Vendedor.setUsuario("JuanitoPistolas");
           Vendedor.setPassword("sexo");
           Vendedor.setPuesto("Vendedor");
           
           
           
           
           ArrayList<Empleado> Empleados = new ArrayList<>();
           ArrayList<Cliente> Clientes = new ArrayList<>();
           ArrayList<Proveedor> Proveedores = new ArrayList<>();
           ArrayList<Producto> Productos = new ArrayList<>();
           
           Empleados.add(Vendedor);
           
           
           String nameUser, password;
           int cont=0, indiceVendedor=0;
           boolean ExistVendedor=false,ExistNameUser=false,ExistPasswordUser=false;
           //do{
            System.out.println("Introduzca su Nombre de Usuario");
            nameUser = leer.nextLine();
            System.out.println("Introduzca su Password");
            password = leer.nextLine();
            
            if(Admin.getNombre().equals(nameUser)&&Admin.getContraseña().equals(password)){
                AccionesAdmin();
            }else{
                //realizar busqueda dentro de los empleados
                cont=0;
                ExistVendedor=false;
                while(cont<Empleados.size()&&!ExistVendedor){
                    if(Empleados.get(cont).getUsuario().equals(nameUser)){
                        ExistNameUser=true;
                        if(Empleados.get(cont).getContraseña().equals(password)){
                            ExistPasswordUser=true;
                        }
                    }
                    cont++;
                }
                if(!ExistNameUser){
                    System.out.println("Nombre de usuario incorrecto");
                }else if(ExistNameUser&&!ExistPasswordUser){
                    System.out.println("Contrasena Incorrecta");
                }else if(ExistNameUser&&ExistPasswordUser){
                    AccionesVendedor();
                }
            }
           //}while();
           
           
    }
}
