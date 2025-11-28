/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopa;
import java.util.*;
import java.time.*;
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
           Empleado Admin = new Empleado(28941, "Admin","911","Correo@gmail");
           Admin.setPassword("12345");
           Admin.setPuesto("Administrador");
           
           
           Empleado Vendedor = new Empleado(789,"Juanito","45612312","juanito@correo");
           Vendedor.setUsuario("JuanitoPerez");
           Vendedor.setPassword("contrasena");
           Vendedor.setPuesto("Vendedor");
           
           
           
           
           ArrayList<Empleado> Empleados = new ArrayList<>();
           ArrayList<Cliente> Clientes = new ArrayList<>();
           ArrayList<Proveedor> Proveedores = new ArrayList<>();
           ArrayList<Producto> Productos = new ArrayList<>();
           ArrayList<Ventas> Venta= new ArrayList<>();
           
           Empleados.add(Vendedor);
           
           
           String nameUser, password,nombre,correo,puesto,confpassword,catego,tel,direccion,empresa,descrip;
           int cont=0, indiceVendedor=0,indiceCliente=0,opc=0,id,opcInt=0,stock,ActOferta=0,indiceProveedor=0,indiceProd=0;
           long codBar=0;
           boolean ExistVendedor=false,ExistNameUser=false,ExistPasswordUser=false,LLamarAdmin=false,LLamarVendedor=false,ExistID=false;
           boolean ExistClien=false,ExistProveedor=false,ExistCodBar=false;
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
                                    tel = leer.nextLine();
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
                                Producto Articulo = new Producto();
                                Articulo.setID(id);
                                System.out.println("Ingresa el nombre del producto:");
                                nombre = leer.nextLine();
                                Articulo.setNombre(nombre);
                                do{
                                    System.out.println("Ingrese la cantidad para inventario: ");
                                    stock = leer.nextInt();
                                    leer.nextLine();
                                    Articulo.setStock(stock);
                                if(stock>0){
                                    do{
                                        System.out.println("Ingrese el precio del producto");
                                        prec=leer.nextDouble();  
                                        if(prec<0){
                                            System.out.println("Precio Invalido intente nuevamente:");
                                        }
                                    }while(prec<0);   
                                    Articulo.setNormalPrecio(prec);
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
                                        Articulo.setOfertaPrecio(precOFER);
                                        //Dylan acomodale aqui el que guarde la fecha
                                        
                                        System.out.println("Ingrese la fecha de inicio de oferta");
                                        System.out.println("Ingrese la fecha de fin de oferta");
                                        //set de fechas
                                        
                                    }else if(ActOferta==2){
                                        System.out.println("Producto sin oferta activa");
                                    }else{
                                        System.out.println("Opcion Invalida");
                                    }
                                    
                                    System.out.println("Ingrese la categoria");
                                    catego = leer.nextLine();
                                    Articulo.setCategoria(catego);
                                    //Dylaaaaaaaaaaaaaaaaaan aca le modificas
                                    System.out.println("Ingresa la fecha de caducidad");
                                    //set de la fecha
                                    System.out.println("Ingresa la descripcion");
                                    descrip = leer.nextLine();
                                    Articulo.setDescripcion(descrip);
                                    System.out.println("Ingresa el codigo de barras: ");
                                    codBar = leer.nextLong();
                                    ExistCodBar = false;
                                    for(int i =0;i<Productos.size()&&!ExistCodBar;i++){
                                        if(Productos.get(i).getCodigoBarras()==codBar){
                                            ExistCodBar=true;
                                        }
                                    }
                                    if(ExistCodBar){
                                        System.out.println("Codigo de barras en uso");
                                    }else{
                                        Articulo.setCodigoBarras(codBar);
                                    }
                                    System.out.println("Producto Registrado");
                                    
                                }else{
                                    System.out.println("Cantidad Invalida.\n Intente otra vez");
                                }   
                                }while(stock<=0); 
                            }else{
                                System.out.println("ID ya en uso");
                            }
                            break;
                        case 6:
                            if(!Productos.isEmpty()){
                                System.out.println("Editar Producto");
                                System.out.println("Ingrese el ID del producto: ");
                                id = leer.nextInt();
                                ExistID=false;
                                indiceProd=0;
                                for(int i=0;i<Productos.size()&&!ExistID;i++){
                                    if(Productos.get(i).getID()==id){
                                        ExistID=true;
                                        indiceProd=i;
                                    }
                                }
                                if(ExistID){
                                    int modif=0;
                                    do{
                                        System.out.println("Seleccione la opcion: ");
                                        System.out.println("1- Nombre");
                                        System.out.println("2- Descripcion");
                                        System.out.println("3- Precio");
                                        System.out.println("4- Precio para oferta");
                                        System.out.println("5- Fecha de inicio para oferta");
                                        System.out.println("6- Fecha de fin para oferta");
                                        System.out.println("7- Cantidad para inventario");
                                        System.out.println("8- Fecha de Caducidad");
                                        System.out.println("9- Codigo de barras");
                                        System.out.println("10- Categoria ");
                                        System.out.println("11- Finalizar");
                                        modif = leer.nextInt();
                                        leer.nextLine();
                                        switch(modif){
                                            case 1:
                                                System.out.println("Ingrese el nuevo nombre: ");
                                                nombre = leer.nextLine();
                                                Productos.get(indiceProd).setNombre(nombre);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la descripcion: ");
                                                descrip = leer.nextLine();
                                                Productos.get(indiceProd).setDescripcion(descrip);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el precio base ");
                                                prec = leer.nextDouble();
                                                if(prec>0){
                                                    Productos.get(indiceProd).setNormalPrecio(prec);
                                                    System.out.println("Operacion Exitosa!");
                                                }else{
                                                    System.out.println("Precio no valido");
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Ingrese el precio para la oferta: ");
                                                precOFER = leer.nextDouble();
                                                if(precOFER>0){
                                                    Productos.get(indiceProd).setOfertaPrecio(precOFER);
                                                    System.out.println("Operacion Exitosa!");
                                                }else{
                                                    System.out.println("Precio no Valido");
                                                }
                                                break;
                                            case 5:
                                                System.out.println("Ingrese la fecha de inicio para la oferta");
                                                break;
                                            case 6:
                                                System.out.println("Ingrese la fecha de fin para la oferta");
                                                break;
                                            case 7:
                                                System.out.println("Ingrese la Cantidad para Inventario");
                                                stock = leer.nextInt();
                                                if(stock>0){
                                                    Productos.get(indiceProd).setStock(stock);
                                                    System.out.println("Operacion Exitosa!");
                                                }else{
                                                    System.out.println("Cantidad Invalida");
                                                }
                                                break;
                                            case 8:
                                                System.out.println("Ingrese la fecha de caducidad: ");
                                                break;
                                            case 9:
                                                System.out.println("Ingrese el codigo de barras");
                                                codBar = leer.nextLong();
                                                ExistCodBar=false;
                                                for(int i=0;i<Productos.size()&&!ExistCodBar;i++){
                                                    if(Productos.get(i).getCodigoBarras()==codBar){
                                                        ExistCodBar=true;
                                                    }
                                                }
                                                if(ExistCodBar){
                                                    System.out.println("Codigo de barras en uso");
                                                }else{
                                                    Productos.get(indiceProd).setCodigoBarras(codBar);
                                                    System.out.println("Operacion Exitosa!");
                                                }
                                                break;
                                            case 10:
                                                System.out.println("Ingrese la categoria: ");
                                                catego = leer.nextLine();
                                                Productos.get(indiceProd).setCategoria(catego);
                                                System.out.println("Operacion realizada!");
                                                break;
                                            case 11:
                                                System.out.println("Operacion Finalizada");
                                                break;
                                            default:
                                                System.out.println("Opcion invalida");
                                                
                                        }
                                    }while(modif!=11);
                                }else{
                                    System.out.println("ID no registrado");
                                }
                            }else{
                            }
                            
                            break;
                        case 7:
                            if(!Productos.isEmpty()){
                                System.out.println("Mostrar Productos");
                                for(Producto p: Productos){
                                    p.MostrarInfoProd();
                                }
                            }else{
                                System.out.println("No hay productos registrados");
                            }
                            
                            
                            break;
                        case 8:
                            if(!Productos.isEmpty()){
                                System.out.println("Borrar Producto");
                                System.out.println("Ingrese el ID del producto");
                                id = leer.nextInt();
                                ExistID=false;
                                for(int i=0;i<Productos.size()&&!ExistID;i++){
                                    if(Productos.get(i).getID()==id){
                                        ExistID=true;
                                        System.out.println("El producto a eliminar es: "+Productos.remove(i).getNombre());
                                    }
                                }
                                if(!ExistID){
                                    System.out.println("ID no encontrado");
                                }
                            }else{
                                System.out.println("No hay productos registrados");
                            }
                            
                            
                            break;
                        case 9:
                            System.out.println("Registrar Proveedores");
                            break;
                        case 10:
                            if(!Proveedores.isEmpty()){
                                System.out.println("Editar Proveedor");
                                System.out.println("Ingrese el ID del proveedor: ");
                                id = leer.nextInt();
                                leer.nextLine();
                                ExistProveedor=false;
                                indiceProveedor=0;
                                for(int i=0;i<Proveedores.size()&&!ExistProveedor;i++){
                                    if(Proveedores.get(i).getId()==id){
                                        ExistProveedor=true;
                                        indiceProveedor = i;
                                    }
                                }
                                if(ExistProveedor){
                                    int opcion=0;
                                    do{
                                        System.out.println("Seleccione la opcion: ");
                                        System.out.println("1- Nombre");
                                        System.out.println("2- Telefono");
                                        System.out.println("3- Correo");
                                        System.out.println("4- Empresa");
                                        System.out.println("5- Direccion");
                                        System.out.println("6- Tipo de producto");
                                        System.out.println("7- Descripcion");
                                        System.out.println("8- Finalizar");
                                        opcion = leer.nextInt();
                                        switch(opcion){
                                            case 1:
                                                System.out.println("Ingrese el nuevo nombre: ");
                                                nombre = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setNombre(nombre);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 2:
                                                System.out.println("ingrese el nuevo Telefono: ");
                                                tel = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setTelefono(tel);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el nuevo Correo");
                                                correo = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setCorreo(correo);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 4:
                                                System.out.println("Ingrese la nueva empresa: ");
                                                empresa = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setNombreEmpresa(empresa);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 5:
                                                System.out.println("Ingrese la nueva Direccion: ");
                                                direccion = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setDireccion(direccion);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 6:
                                                System.out.println("Ingrese el nuevo tipo de Productos: ");
                                                catego = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setTipoProducto(catego);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 7:
                                                System.out.println("Operacion Finalizada");
                                                break;
                                            default:
                                                System.out.println("Opcion Invalida;");
                                        }
                                    }while(opcion!=8);
                                }else{
                                    System.out.println("ID no registrado");
                                }
                                
                            }else{
                                System.out.println("No hay proveedores registrados");
                            }
                            
                            break;
                        case 11:
                            if(!Proveedores.isEmpty()){
                                System.out.println("Mostrar Proveedores");
                                for(Proveedor p: Proveedores){
                                    System.out.println("Nombre: "+p.getNombre());
                                    System.out.println("ID: "+p.getId());
                                    System.out.println("Telefono: "+p.getTelefono());
                                    System.out.println("Correo: "+p.getCorreo());
                                    System.out.println("Nombre de la Empresa: "+p.getNombreEmpresa());
                                    System.out.println("Tipo de Producto: "+p.getTipoProducto());
                                    System.out.println("Direccion: "+p.getDireccion());
                                    System.out.println("----------------------------------");
                                }
                            }else{
                                System.out.println("No hay Proveedores Registrados");
                            }
                            
                            break;
                        case 12:
                            if(!Proveedores.isEmpty()){
                                System.out.println("Borrar Proveedor");
                                System.out.println("Ingrese el ID: ");
                                id = leer.nextInt();
                                leer.nextLine();
                                ExistProveedor=false;
                                for(int i=0;i<Proveedores.size()&&!ExistProveedor;i++){
                                    if(Proveedores.get(i).getId()==id){
                                        ExistProveedor=true;
                                        System.out.println("Se elimino el Proveedor: "+Proveedores.remove(i).getNombre());
                                    }
                                }
                                if(!ExistProveedor){
                                    System.out.println("ID no encontrado");
                                }
                            }
                            break;
                        case 13:
                            if(!Proveedores.isEmpty()){
                                System.out.println("Consultar un Proveedor");
                                System.out.println("Ingresa el ID: ");
                                id = leer.nextInt();
                                leer.nextLine();
                                ExistProveedor=false;
                                for(int i=0;i<Proveedores.size()&&!ExistProveedor;i++){
                                    if(Proveedores.get(i).getId()==id){
                                        ExistProveedor=true;
                                        System.out.println("Nombre: "+Proveedores.get(i).getNombre());
                                        System.out.println("ID: "+Proveedores.get(i).getId());
                                        System.out.println("Telefono: "+Proveedores.get(i).getTelefono());
                                        System.out.println("Correo: "+Proveedores.get(i).getCorreo());
                                        System.out.println("Empresa: "+Proveedores.get(i).getNombreEmpresa());
                                        System.out.println("Direccion: "+Proveedores.get(i).getDireccion());
                                        System.out.println("Tipo de Producto: "+Proveedores.get(i).getTipoProducto());
                                    }
                                }
                            }else{
                                System.out.println("No hay proveedores Registrados");
                            }
                            
                            break;
                        case 14:
                            System.out.println("Registrar Clientes");
                            break;
                        case 15:
                            int eleccion=0;
                            if(!Clientes.isEmpty()){
                                System.out.println("Editar Cliente");
                                System.out.println("Ingresa el ID del Cliente:");
                                id = leer.nextInt();
                                leer.nextLine();
                                ExistClien=false;
                                indiceCliente=0;
                                for(int i=0;i<Clientes.size()&&!ExistClien;i++){
                                    if(Clientes.get(i).getId()==id){
                                        ExistClien=true;
                                        indiceCliente=i;
                                    }
                                }
                                if(ExistClien){
                                    do{
                                        System.out.println("Seleccione una opcion para modificar");
                                        System.out.println("1- Nombre");
                                        System.out.println("2- Correo");
                                        System.out.println("3- Telefono");
                                        System.out.println("4- Direccion:");
                                        System.out.println("5- Terminar");
                                        eleccion = leer.nextInt();
                                        leer.nextLine();
                                        switch(eleccion){
                                            case 1:
                                                System.out.println("Ingrese el Nuevo Nombre:");
                                                nombre = leer.nextLine();
                                                Clientes.get(indiceCliente).setNombre(nombre);
                                                System.out.println("Modificacion Exitosa!");
                                                break;
                                            case 2:
                                                System.out.println("Ingrese el Nuevo Correo:");
                                                correo = leer.nextLine();
                                                Clientes.get(indiceCliente).setCorreo(correo);
                                                System.out.println("Modificacion Exitosa!");
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el Nuevo Telefono:");
                                                tel = leer.nextLine();
                                                Clientes.get(indiceCliente).setTelefono(tel);
                                                System.out.println("Modificacion Exitosa!");
                                                break;
                                            case 4:
                                                System.out.println("Ingrese la Nueva Direccion:");
                                                direccion = leer.nextLine();
                                                Clientes.get(indiceCliente).setDireccion(direccion);
                                                System.out.println("Modificacion Exitosa!");
                                                break;
                                            case 5:
                                                System.out.println("Modificaciones Terminadas");
                                                break;
                                            default:
                                                System.out.println("Opcion Invalida");
                                        }
                                    }while(eleccion!=5);
                                }else{
                                    System.out.println("ID no encontrado");
                                }
                            }else{
                                System.out.println("No hay Clientes Registrados: ");
                            }
                            
                            break;
                        case 16:
                            if(!Clientes.isEmpty()){
                                System.out.println("Mostrar Clientes");
                                for(int i=0;i<Clientes.size();i++){
                                    System.out.println("ID del cliente: "+Clientes.get(i).getId());
                                    System.out.println("Nombre: "+Clientes.get(i).getNombre());
                                    System.out.println("Telefono: "+Clientes.get(i).getTelefono());
                                    System.out.println("Correo: "+Clientes.get(i).getCorreo());
                                    System.out.println("Direccion: "+Clientes.get(i).getDireccion());
                                    System.out.println("Total de Compras: "+Clientes.get(i).getTotalC());
                                    System.out.println("Fecha de Registro: "+Clientes.get(i).getFechaR());
                                    System.out.println("------------------------------------------------");
                                }
                            }else{
                                System.out.println("No hay Clientes Registrados");
                            }
                            break;
                        case 17:
                            if(!Clientes.isEmpty()){
                                System.out.println("Borrar Cliente");
                                System.out.println("Ingrese el ID del Cliente: ");
                                id = leer.nextInt();
                                leer.nextLine();
                                ExistClien=false;
                                for(int i=0;i<Clientes.size()&&!ExistClien;i++){
                                    if(Clientes.get(i).getId()==id){
                                        System.out.println("Se elimino el cliente: "+Clientes.remove(i).getNombre());
                                        ExistClien=true;
                                    }
                                }
                                if(!ExistClien){
                                    System.out.println("ID no registrado");
                                }
                                
                            }else{
                                System.out.println("No hay Clientes Registrados");
                            }
                            
                            
                            break;
                        case 18:
                            if(!Clientes.isEmpty()){
                                System.out.println("Consultar Cliente");
                                System.out.println("Ingrese el ID del cliente");
                                id = leer.nextInt();
                                ExistClien=false;
                                for(int i=0;i<Clientes.size()&&!ExistClien;i++){
                                    if(Clientes.get(i).getId()==id){
                                        System.out.println("ID del cliente: "+Clientes.get(i).getId());
                                        System.out.println("Nombre: "+Clientes.get(i).getNombre());
                                        System.out.println("Telefono: "+Clientes.get(i).getTelefono());
                                        System.out.println("Correo: "+Clientes.get(i).getCorreo());
                                        System.out.println("Direccion: "+Clientes.get(i).getDireccion());
                                        System.out.println("Total de Compras: "+Clientes.get(i).getTotalC());
                                        System.out.println("Fecha de Registro: "+Clientes.get(i).getFechaR());
                                        ExistClien=true;
                                        
                                    }
                                }
                                if(!ExistClien){
                                    System.out.println("ID no encontrado");
                                }
                            }else{
                                System.out.println("No Hay Clientes Registrados");
                            }
                            
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
                                if(!Venta.isEmpty()){
                                    for(Ventas v:Venta){
                                       v.MostrarResumen();
                                    }
                                }else
                                    System.out.println("No se ha registrado ninguna venta");
                            break;    
                        case 3:
                            System.out.println("Registrar Productos");
                            int repet=0;
                            do{
                                
                                System.out.println("Desea Registrar otro Producto? 1-SI 2-NO");
                                repet = leer.nextInt();
                            }while(repet!=2);
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
                                if(!Productos.isEmpty()){
                                    for(Producto producto:Productos)
                                        producto.MostrarInfoProd();
                                }
                            break;
                        case 8:
                            if(!Proveedores.isEmpty()){
                                System.out.println("Consultar Proveedor");
                                System.out.println("Ingrese el ID del proveedor");
                                id = leer.nextInt();
                                leer.nextLine();
                                ExistID=false;
                                indiceProveedor=0;
                                for(int i=0;i<Proveedores.size()&&!ExistID;i++){
                                    if(Proveedores.get(i).getId()==id){
                                        ExistID=true;
                                        indiceProveedor=i;
                                    }
                                }
                                if(ExistID){
                                    System.out.println("Datos del proveedor: ");
                                    System.out.println("Nombre:"+Proveedores.get(indiceProveedor).getNombre());
                                    
                                    System.out.println("Telefono: "+Proveedores.get(indiceProveedor).getTelefono());
                                    
                                    System.out.println("Correo: "+Proveedores.get(indiceProveedor).getCorreo());
                                   
                                    System.out.println("Nombre de la empresa: "+Proveedores.get(indiceProveedor).getNombreEmpresa());
                                    
                                    System.out.println("Ingrese la direccion: "+Proveedores.get(indiceProveedor).getDireccion());
                                    
                                    System.out.println("Tipo de Producto: "+Proveedores.get(indiceProveedor).getTipoProducto());
                                   
                                    
                                }else{
                                    System.out.println("ID no registrado");
                                }
                                
                            }
                            
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
