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

    public static void AccionesAdmin(Scanner lectorLocal){
    System.out.println("Soy el admin ");
    
    }
    public static void AccionesVendedor(Scanner lectorLocal){
        System.out.println("Soy el vendedor");
    }
    public static void MostrarMenuAdmin(){
        System.out.println("Seleccione la operacion: ");
        System.out.println("1-  Registrar Empleados");
        System.out.println("2-  Editar Empleado");
        System.out.println("3-  Borrar Empleado");
        System.out.println("4-  Mostrar Empleados");
        System.out.println("5-  Registrar Productos");
        System.out.println("6-  Editar Producto");
        System.out.println("7-  Mostrar Productos");
        System.out.println("8-  Borrar Producto");
        System.out.println("9-  Registrar Proveedores");
        System.out.println("10- Editar Proveedor");
        System.out.println("11- Mostrar Proveedores");
        System.out.println("12- Borrar Proveedor");
        System.out.println("13- Consultar un Proveedor");
        System.out.println("14- Registrar Clientes");
        System.out.println("15- Editar Cliente");
        System.out.println("16- Mostrar Clientes");
        System.out.println("17- Borrar Cliente");
        System.out.println("18- Consultar Cliente");
        System.out.println("19 - Salir");
    }
    public static void MostrarMenuEmpleado(){
        System.out.println("Seleccione una opcion: ");
        System.out.println("1- Realizar Venta");
        System.out.println("2- Mostrar Ventas realizadas");
        System.out.println("3- Registrar Productos");
        System.out.println("4- Editar Productos");
        System.out.println("5- Registrar Clientes");
        System.out.println("6- Editar Cliente");
        System.out.println("7- Consultar Producto");
        System.out.println("8- Consultar Proveedor");
        System.out.println("9- Salir");
    }
    //cuando se llama a registrar pruducto debemos pasarle el scanner
    /*public static void RegistrarProducto(Scanner lectorLocal){
        String nom;
        ArrayList<Producto> Productos = new ArrayList<>();
        boolean ExistProd=false;
        int id,stock;
        System.out.println("-----------------------------------");
        System.out.println("Registrar Producto:");
        System.out.println("Ingrese el ID para el producto: ");
        id = lectorLocal.nextInt();
        for(int i=0;i<Productos.size()&&!ExistProd;i++){
            if(Productos.get(i).getID()==id){
                ExistProd=true;
            }
        }
        if(ExistProd){
            System.out.println("ID en uso");
        }else{
            System.out.println("Ingresa el nombre del producto:");
            nom = lectorLocal.nextLine();
            do{
                System.out.println("Ingrese la cantidad para inventario: ");
                stock = lectorLocal.nextInt();
                if(stock>0){
                    
                }else{
                    System.out.println("Cantidad Invalida.\n Intente otra vez");
                }   
            }while(stock<=0);   
        }
            
        }
        
    }*/
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           Empleado Admin = new Empleado(28941, "Admin",911,"Correo@gmail");
           Admin.setPassword("12345");
           Admin.setPuesto("Administrador");
           
           
           Empleado Vendedor = new Empleado(789,"Juanito",45612312,"juanito@correo");
           Vendedor.setUsuario("JuanitoPerez");
           Vendedor.setPassword("contrasena");
           Vendedor.setPuesto("Vendedor");
           
           
           
           
           ArrayList<Empleado> Empleados = new ArrayList<>();
           ArrayList<Cliente> Clientes = new ArrayList<>();
           ArrayList<Proveedor> Proveedores = new ArrayList<>();
           ArrayList<Producto> Productos = new ArrayList<>();
           
           Empleados.add(Vendedor);
           
           
           String nameUser, password,nombre,correo,puesto,confpassword,catego;
           int cont=0, indiceVendedor=0,opc=0,id,tel,opcInt=0,stock,ActOferta=0;
           boolean ExistVendedor=false,ExistNameUser=false,ExistPasswordUser=false,LLamarAdmin=false,LLamarVendedor=false,ExistID=false;
           double prec,precOFER;
           //do{
            System.out.println("Introduzca su Nombre de Usuario");
            nameUser = leer.nextLine();
            System.out.println("Introduzca su Password");
            password = leer.nextLine();
            
            if(Admin.getNombre().equals(nameUser)&&Admin.getContraseña().equals(password)){
                LLamarAdmin=true;
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
                    LLamarVendedor=true;
                }
            }
            
            if(LLamarAdmin){
                do{
                    opc=0;
                    MostrarMenuAdmin();
                    opc = leer.nextInt();
                    switch(opc){
                        case 1:
                            System.out.println("Registrar Empleados");
                            do{
                                System.out.println("Ingrese el ID para el empleado");
                                id = leer.nextInt();
                                leer.nextLine();
                                ExistID=false;
                                for(int i=0;i<Empleados.size()&&!ExistID;i++){
                                    if(Empleados.get(i).getId()==id){
                                        ExistID=true;
                                    }
                                }
                                if(ExistID){
                                    System.out.println("ID ya asigando");
                                }else{
                                    System.out.println("Ingrese Nombre:");
                                    nombre = leer.nextLine();
                                    System.out.println("Ingrese Telefono:");
                                    tel = leer.nextInt();
                                    leer.nextLine();
                                    //verificar que un telefono no se repita
                                    System.out.println("Ingrese Correo:");
                                    correo = leer.nextLine();
                                    //que un correo no se repita
                                    System.out.println("Ingrese el nombre de Usuario");
                                    nameUser = leer.nextLine();
                                    //que un usuario no se repita
                                    System.out.println("Ingrese el puesto:");
                                    puesto = leer.nextLine();
                                    System.out.println("Ingrese el password: ");
                                    password = leer.nextLine();
                                    System.out.println("Confirme password:");
                                    confpassword = leer.nextLine();
                                    if(password.equals(confpassword)){
                                        //se registra cliente
                                        Empleado trabajador = new Empleado(id,nombre,tel,correo);
                                        trabajador.setUsuario(nameUser);
                                        trabajador.setPuesto(puesto);
                                        trabajador.setPassword(password);
                                        Empleados.add(trabajador);
                                    }else{
                                        System.out.println("Contraseña invalida");
                                    }
                                }
                                System.out.println("Desea agregar otro empleado. 1-Si 2-No");
                                opcInt = leer.nextInt();
                            }while(opcInt!=2);
                            break;
                        case 2:
                            if(!Empleados.isEmpty()){
                                System.out.println("Editar Empleado");
                            }else{
                                System.out.println("No hay empleados registrados");
                            }
                            break;
                        case 3:
                            if(!Empleados.isEmpty()){
                                System.out.println("Borrar Empleado");
                            }else{
                                System.out.println("No hay empleados registrados");
                            }
                            System.out.println("Borrar Empleado");
                            break;
                        case 4:
                            if(!Empleados.isEmpty()){
                                System.out.println("Mostrar Empleados");
                            }else{
                                System.out.println("No hay empleados registrados");
                            }
                            break;
                        case 5:
                            System.out.println("Registrar Productos");
                            System.out.println("Ingrese el id para el producto: ");
                            id = leer.nextInt();
                            leer.nextLine();
                            ExistID=false;
                            if(!Productos.isEmpty()){
                                for(int i=0; i<Productos.size()&&!ExistID;i++){
                                    if(Productos.get(i).getID()==id){
                                        ExistID = true;
                                    }
                                }
                            }
                            if(!ExistID){
                                System.out.println("Ingresa el nombre del producto:");
                                nombre = leer.nextLine();
                                do{
                                    System.out.println("Ingrese la cantidad para inventario: ");
                                    stock = leer.nextInt();
                                    leer.nextLine();
                                if(stock>0){
                                    do{
                                        System.out.println("Ingrese el precio del producto");
                                        prec=leer.nextDouble();  
                                        if(prec<0){
                                            System.out.println("Precio Invalido intente nuevamente:");
                                        }
                                    }while(prec<0);        
                                    System.out.println("Su producto tendra una oferta activa? 1-Si 2-No ");
                                    ActOferta = leer.nextInt();
                                    
                                    if(ActOferta==1){
                                        do{
                                            System.out.println("Ingrese el precio para su oferta:");
                                            precOFER=leer.nextDouble();
                                            if(precOFER<=0){
                                                System.out.println("Precio Invalido intente nuevamente:");
                                            }
                                        }while(precOFER<=0);
                                        
                                        //Dylan acomodale aqui el que guarde la fecha
                                        
                                        System.out.println("Ingrese la fecha de inicio de oferta");
                                        System.out.println("Ingrese la fecha de fin de oferta");
                                    }else if(ActOferta==2){
                                        System.out.println("Producto sin oferta activa");
                                    }else{
                                        System.out.println("Opcion Invalida");
                                    }
                                    
                                    System.out.println("Ingrese la categoria");
                                    catego = leer.nextLine();
                                    //Dylaaaaaaaaaaaaaaaaaan aca le modificas
                                    System.out.println("Ingresa la fecha de caducidad");
                                    
                                    System.out.println("Ingresa la descripcion");
                                    //leer string
                                    
                                }else{
                                    System.out.println("Cantidad Invalida.\n Intente otra vez");
                                }   
                                }while(stock<=0); 
                            }else{
                                System.out.println("ID ya en uso");
                            }
                            break;
                        case 6:
                            System.out.println("Editar Producto");
                            break;
                        case 7:
                            System.out.println("Mostrar Productos");
                            break;
                        case 8:
                            System.out.println("Borrar Producto");
                            break;
                        case 9:
                            System.out.println("Registrar Proveedores");
                            break;
                        case 10:
                            System.out.println("Editar Proveedor");
                            break;
                        case 11:
                            System.out.println("Mostrar Proveedores");
                            break;
                        case 12:
                            System.out.println("Borrar Proveedor");
                            break;
                        case 13:
                            System.out.println("Consultar un Proveedor");
                            break;
                        case 14:
                            System.out.println("Registrar Clientes");
                            break;
                        case 15:
                            System.out.println("Editar Cliente");
                            break;
                        case 16:
                            System.out.println("Mostrar Clientes");
                            break;
                        case 17:
                            System.out.println("Borrar Cliente");
                            break;
                        case 18:
                            System.out.println("Consultar Cliente");
                            break;
                        case 19:
                            System.out.println("Sesion Cerrada");
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }
                }while(opc!=19);
            }else if(LLamarVendedor){
                do{
                    opc=0;
                    MostrarMenuEmpleado();
                    opc = leer.nextInt();
                    switch(opc){
                        case 1:
                            System.out.println("Realizar Venta");
                            break;
                        case 2:
                            System.out.println("Mostrar Ventas realizadas");
                            break;
                        case 3:
                            System.out.println("Registrar Productos");
                            break;
                        case 4:
                            System.out.println("Editar Productos");
                            break;
                        case 5:
                            System.out.println("Registrar Clientes");
                            break;
                        case 6:
                            System.out.println("Editar Cliente");
                            break;
                        case 7:
                            System.out.println("Consultar Producto");
                            break;
                        case 8:
                            System.out.println("Consultar Proveedor");
                            break;
                        case 9:
                            System.out.println("Sesion Cerrada");
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                    }
                }while(opc!=9);
            }
           //}while();
           
           
    }
}
