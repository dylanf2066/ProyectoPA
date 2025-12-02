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
    System.out.println("Soy el admin");
    
    }
    public static void AccionesVendedor(Scanner lectorLocal){
        System.out.println("Soy el vendedor");
    }
    //agregar cerrar programa y de salir a cerrar sesion y terminar programa
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
        System.out.println("19 - Cerrar sesion");
        System.out.println("20 - Cerrar Programa");
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
        System.out.println("9- Cerrar sesion");
        System.out.println("10- Cerrar programa");
        
    }
    
    
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           Empleado Admin = new Empleado(28941, "Admin","911","Correo@gmail");
           Admin.setPassword("12345");
           Admin.setPuesto("Administrador");
           
           /*
           Empleado Vendedor = new Empleado(789,"Juanito","45612312","juanito@correo");
           Vendedor.setUsuario("JuanitoPerez");
           Vendedor.setPassword("contrasena");
           Vendedor.setPuesto("Vendedor");
           */
           /*
           Producto Producto1 = new Producto();
           Producto1.setCaducidad(2025, 12, 1);
           Producto1.setNombre("Papel");
           Producto1.setCategoria("Higiene");
           Producto1.setCodigoBarras(12345667);
           Producto1.setDescripcion("ninguna");
           Producto1.setID(1);
           Producto1.setNormalPrecio(68.3);
           Producto1.setStock(35);
           Producto1.setIncOfer(2025, 11, 20);
           Producto1.setFinOfer(2025, 12, 30);
           Producto1.setActivOfer(true);
           
           Producto Producto2 = new Producto();
           Producto2.setCaducidad(2025, 12, 1);
           Producto2.setNombre("Paracetamol");
           Producto2.setCategoria("pastilla");
           Producto2.setCodigoBarras(566323);
           Producto2.setDescripcion("ninguna");
           Producto2.setID(2);
           Producto2.setNormalPrecio(49.3);
           Producto2.setStock(35);
           Producto2.setActivOfer(false);
           
           
           
           
           ItemVenta item1 = new ItemVenta(Producto1, 10);
           ItemVenta item2 = new ItemVenta(Producto2, 2);
           */
           
           
           
           ArrayList<Empleado> Empleados = new ArrayList<>();
           ArrayList<Cliente> Clientes = new ArrayList<>();
           ArrayList<Proveedor> Proveedores = new ArrayList<>();
           ArrayList<Producto> Productos = new ArrayList<>();
           ArrayList<Ventas> Venta= new ArrayList<>();
           ArrayList <ItemVenta> itemsV = new ArrayList<>();
           
           //Empleados.add(Vendedor);
           //Productos.add(Producto1);
           //Productos.add(Producto2);
           
           String nameUser, password,nombre,correo,puesto,confpassword,catego,tel,direccion,empresa,descrip;
           int cont=0, indiceVendedor=0,indiceCliente=0,opc=0,id,opcInt=0,stock,ActOferta=0,indiceProveedor=0,indiceProd=0,indiceGlobalEmpleado=0,y,m,d,IDEmpleado=0,IDProveedor=0,IDCliente=0,IDProducto=0,IDVenta=0;
           long codBar=0;
           boolean ExistVendedor=false,ExistNameUser=false,ExistPasswordUser=false,LLamarAdmin=false,LLamarVendedor=false,ExistID=false;
           boolean ExistClien=false,ExistProveedor=false,ExistCodBar=false,Existe=false,CerrarPrograma=false;
           double prec,precOFER;
           LocalDate DiaHoy = LocalDate.now();
        
           do{
                LLamarAdmin=false;
                ExistNameUser = false;
                ExistPasswordUser = false;
                CerrarPrograma=false;
                System.out.println("Introduzca su Nombre de Usuario");
                nameUser = leer.nextLine();
                System.out.println("Introduzca su Password");
                password = leer.nextLine();
            
            if(Admin.getNombre().equals(nameUser)){
                ExistNameUser=true;
                if(Admin.getContraseña().equals(password)){
                    LLamarAdmin=true;
                    ExistPasswordUser=true;
                }
            }else{
                //realizar busqueda dentro de los empleados
                cont=0;
                ExistVendedor=false;
                while(cont<Empleados.size()&&!ExistVendedor){
                    if(Empleados.get(cont).getUsuario().equals(nameUser)){
                        ExistNameUser=true;
                        if(Empleados.get(cont).getContraseña().equals(password)){
                            ExistPasswordUser=true;
                            indiceGlobalEmpleado=cont;
                        }
                    }
                    cont++;
                }
            }
                if(!ExistNameUser){
                    System.out.println("Nombre de usuario incorrecto");
                }else if(ExistNameUser&&!ExistPasswordUser){
                    System.out.println("Contrasena Incorrecta");
                }else if(ExistNameUser&&ExistPasswordUser){
                    LLamarVendedor=true;
                }
            
            
            if(LLamarAdmin){
                do{
                    opc=0;
                    MostrarMenuAdmin();
                    opc = leer.nextInt();
                    leer.nextLine();
                    switch(opc){
                        case 1:
                            System.out.println("Registrar Empleados");
                            do{
                                id = IDEmpleado+1;
                                //leer.nextLine();
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
                                    do{
                                        do{
                                            System.out.println("Ingrese Telefono:");
                                            tel = leer.nextLine();
                                            if(!(tel.length()==10)){
                                                System.out.println("Telefono invalido");
                                            }
                                        }while(!(tel.length()==10) && (!tel.matches("^\\\\d+$")));
                                        
                                        Existe=false;
                                        for(int i=0;i<Empleados.size()&&!Existe;i++){
                                            if(Empleados.get(i).getTelefono().equals(tel)){
                                                Existe=true;
                                            }
                                        }
                                        if(Existe){
                                            System.out.println("Telefono registrado a otro empleado\n Utilice otro");
                                        }
                                    }while(Existe);
                                    
                                    //verificar que un telefono no se repita
                                    do{
                                        System.out.println("Ingrese Correo:");
                                        correo = leer.nextLine();
                                        Existe=false;
                                        for(int i=0;i<Empleados.size()&&!Existe;i++){
                                            if(Empleados.get(i).getCorreo().equals(correo)){
                                                Existe=true;
                                            }
                                        }
                                        if(Existe){
                                            System.out.println("Correo registrado \n Utilice otro");
                                        }
                                    }while(Existe);
                                    //que un correo no se repita
                                    do{
                                        System.out.println("Ingrese el nombre de Usuario");
                                        nameUser = leer.nextLine();
                                        Existe=false;
                                        for(int i=0;i<Empleados.size()&&!Existe;i++){
                                            if(Empleados.get(i).getUsuario().equals(nameUser)){
                                                Existe=true;
                                            }
                                        }
                                        if(Existe){
                                            System.out.println("Nombre de usuario ya resgitrado\n Utilice otro");
                                        }
                                    }while(Existe);
                                    //que un usuario no se repita
                                    System.out.println("Ingrese el puesto:");
                                    puesto = leer.nextLine();
                                    do{
                                        System.out.println("Ingrese el password: ");
                                        password = leer.nextLine();
                                        System.out.println("Confirme password:");
                                        confpassword = leer.nextLine();
                                        Existe=false;
                                        if(password.equals(confpassword)){
                                            //se registra cliente
                                            Existe=true;
                                            Empleado trabajador = new Empleado(id,nombre,tel,correo);
                                            trabajador.setUsuario(nameUser);
                                            trabajador.setPuesto(puesto);
                                            trabajador.setPassword(password);
                                            Empleados.add(trabajador);
                                        }else{
                                            System.out.println("La contraseña debe ser igual");
                                        }   
                                    }while(!Existe);
                                }
                                System.out.println("Desea agregar otro empleado. 1-Si 2-No");
                                boolean error;
                                do{
                                    error =true;
                                    if(leer.hasNextInt()){
                                        opcInt = leer.nextInt();
                                        leer.nextLine();
                                        if (opcInt >= 1 && opcInt <= 2) { 
                                            error = false;
                                        }
                                    }else{
                                        leer.nextLine();
                                        System.out.println("Ingrese 1 o 2");
                                    }
                                }while(error);
                            }while(opcInt!=2);
                            break;
                        case 2:
                            if(!Empleados.isEmpty()){
                                System.out.println("Editar Empleado");
                                
                                    System.out.println("Ingrese el ID:");
                                    id = leer.nextInt();
                                    leer.nextLine();
                                    Existe=false;
                                    for(int i=0;i<Empleados.size()&&!Existe;i++){
                                        if(Empleados.get(i).getId()==id){
                                            Existe=true;
                                            indiceVendedor=i;
                                        }
                                    }
                                    if(Existe){
                                        do{
                                            System.out.println("Seleccione la opcion:");
                                            System.out.println("1- Nombre");
                                            System.out.println("2- Telefono");
                                            System.out.println("3- Correo");
                                            System.out.println("4- Usuario");
                                            System.out.println("5- Password");
                                            System.out.println("6- Puesto");
                                            System.out.println("7- Finalizar");
                                            opcInt=leer.nextInt();
                                            switch(opcInt){
                                                case 1:
                                                    System.out.println("Ingrese el nuevo Nombre: ");
                                                    leer.nextLine();                                                    
                                                    nombre = leer.nextLine();
                                                    Empleados.get(indiceVendedor).setNombre(nombre);
                                                    System.out.println("Modificacion Exitosa!");
                                                    break;
                                                case 2:
                                                    do{
                                                        do{
                                                            System.out.println("Ingrese Telefono:");
                                                            tel = leer.nextLine();
                                                            if(!(tel.length()==10)){
                                                                System.out.println("Telefono invalido");
                                                            }
                                                        }while(!(tel.length()==10) && (!tel.matches("^\\\\d+$")));
                                                        
                                                        Empleados.get(indiceVendedor).setTelefono("");
                                                        Existe=false;
                                                        for(int i=0;i<Empleados.size()&&!Existe;i++){
                                                            if(Empleados.get(i).getTelefono().equals(tel)){
                                                                Existe = true;
                                                            }
                                                        }
                                                        if(Existe){
                                                            System.out.println("Telefono Duplicado\n Intente nuevamente");
                                                        }else{
                                                            Empleados.get(indiceVendedor).setTelefono(tel);
                                                            System.out.println("Modificacion Exitosa");
                                                        }
                                                    }while(Existe);
                                                    break;
                                                case 3:
                                                    do{
                                                        System.out.println("Ingrese el nuevo Correo");
                                                        leer.nextLine();
                                                        correo = leer.nextLine();
                                                        Empleados.get(indiceProveedor).setCorreo("");
                                                        Existe=false;
                                                        for(int i=0;i<Empleados.size()&&!Existe;i++){
                                                            if(Empleados.get(i).getCorreo().equals(correo)){
                                                                Existe=true;
                                                            }
                                                        }
                                                        if(Existe){
                                                            System.out.println("Correo Duplicado\n Intenete nuevamente");
                                                        }else{
                                                            Empleados.get(indiceVendedor).setCorreo(correo);
                                                            System.out.println("Modificacion Exitosa");
                                                        }
                                                    }while(Existe);
                                                    break;
                                                case 4:
                                                    do{
                                                        System.out.println("Ingrese el nuevo nombre de usuario");
                                                        leer.nextLine();
                                                        nameUser = leer.nextLine();
                                                        Empleados.get(indiceVendedor).setUsuario("");
                                                        Existe=false;
                                                        for(int i=0;i<Empleados.size()&&!Existe;i++){
                                                            if(Empleados.get(i).getUsuario().equals(nameUser)){
                                                                Existe=true;
                                                            }
                                                        }
                                                        if(Existe){
                                                            System.out.println("Nombre de Usuario Duplicado\n Intente nuevamente");
                                                        }else{
                                                            Empleados.get(indiceVendedor).setUsuario(nameUser);
                                                            System.out.println("Modificacion Exitosa");
                                                        }
                                                        
                                                    }while(Existe);
                                                    break;
                                                case 5:
                                                    do{
                                                        System.out.println("Ingrese el nuevo password: ");
                                                        leer.nextLine();
                                                        password = leer.nextLine();
                                                        System.out.println("Confirme password:");
                                                        confpassword = leer.nextLine();
                                                        Existe=false;
                                                        if(password.equals(confpassword)){
                                                            Existe=true;
                                                            Empleados.get(indiceVendedor).setPassword(password);
                                                            System.out.println("Modificacion Exitosa!");
                                                        }else{
                                                            System.out.println("La contraseña debe ser igual");
                                                        }   
                                                    }while(!Existe);
                                                    break;
                                                case 6:
                                                    System.out.println("Ingrese el Nuevo Puesto");
                                                    leer.nextLine();
                                                    puesto = leer.nextLine();
                                                    Empleados.get(indiceVendedor).setPuesto(puesto);
                                                    System.out.println("Modificacion Exitosa");
                                                    break;
                                                case 7:
                                                    System.out.println("Modificaciones terminadas");
                                                    break;
                                                default:
                                                    System.out.println("Opcion Invalida");
                                                    break;
                                            }
                                        }while(opcInt!=7);
                                    }else{
                                        System.out.println("ID no registrado");
                                    }
                                
                            }else{
                                System.out.println("No hay empleados registrados");
                            }
                            break;
                        case 3:
                            if(!Empleados.isEmpty()){
                                System.out.println("Borrar Empleado");
                                System.out.println("Ingrese el Id del empleado: ");
                                id = leer.nextInt();
                                leer.nextLine();
                                Existe=false;
                                for(int i=0;i<Empleados.size()&&!Existe;i++){
                                    if(Empleados.get(i).getId()==id){
                                        Existe=true;
                                        System.out.println("Se elimino el empleado: "+Empleados.remove(i).getNombre());
                                    }
                                }
                                if(!Existe){
                                    System.out.println("ID no registrado");}
                            }else{
                                System.out.println("No hay empleados registrados");
                            }
                            System.out.println("Borrar Empleado");
                            break;
                        case 4:
                            if(!Empleados.isEmpty()){
                                System.out.println("Mostrar Empleados");
                                for(Empleado E: Empleados){
                                    E.MostrarInfo();
                                    
                                    System.out.println("--------------------------");
                                }
                            }else{
                                System.out.println("No hay empleados registrados");
                            }
                            break;
                        case 5:
                            if(Proveedores.isEmpty()){
                                System.out.println("Se necesitan Proveedores Para Registrar Productos");
                            }else{
                                do{
                                    System.out.println("Registrar Productos");

                                    id =IDProducto+1;


                                        Producto Articulo = new Producto();
                                        Articulo.setID(id);
                                        System.out.println("Ingresa el nombre del producto:");
                                        nombre = leer.nextLine();
                                        Articulo.setNombre(nombre);
                                        do{
                                            System.out.println("Ingrese la cantidad para inventario: ");
                                            stock = leer.nextInt();
                                            leer.nextLine();
                                            if(stock>0){
                                                Articulo.setStock(stock);
                                            }else{
                                                System.out.println("Cantidad Invalida\n Introduzca los datos nuevamente");
                                            }
                                        }while(stock<=0);

                                        do{
                                            System.out.println("Ingrese el precio del producto");
                                            prec=leer.nextDouble();  
                                            if(prec<0){
                                                System.out.println("Precio Invalido intente nuevamente:");
                                            }else{
                                                Articulo.setNormalPrecio(prec);
                                            }
                                        }while(prec<0);   

                                        System.out.println("Su producto tendra una oferta activa? 1-Si 2-No ");
                                        boolean error;
                                        do{
                                            error =true;
                                            if(leer.hasNextInt()){
                                                ActOferta = leer.nextInt();
                                                leer.nextLine();
                                                if (ActOferta >= 1 && ActOferta <= 2) { 
                                                    error = false;
                                                }
                                            }else{
                                                leer.nextLine();
                                                System.out.println("Ingrese 1 o 2");
                                            }
                                        }while(error);

                                        if(ActOferta==1){
                                            do{
                                                System.out.println("Ingrese el precio para su oferta:");
                                                precOFER=leer.nextDouble();
                                                if(precOFER<=0){
                                                    System.out.println("Precio Invalido intente nuevamente:");
                                                }else{
                                                    Articulo.setOfertaPrecio(precOFER);
                                                }
                                            }while(precOFER<=0);

                                            do{
                                                Existe=false;
                                                System.out.println("Ingrese la fecha de inicio de oferta");
                                                System.out.println("Año: ");
                                                y = leer.nextInt();
                                                System.out.println("Mes: ");
                                                m = leer.nextInt();
                                                System.out.println("Dia: ");
                                                d = leer.nextInt();
                                                leer.nextLine();
                                                if(y>0&&(m>=1&&m<=12)){//año mayor a 0, mes entre 1 y 12, y dia dentro del rango de dias del mes
                                                    if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                        Articulo.setIncOfer(y, m, d);
                                                        Existe=true;
                                                    }else{
                                                        System.out.println("Fecha Incorrecta");
                                                    }
                                                }else{
                                                    System.out.println("Fecha Incorrecta\n Intente Nuevamente");
                                                }
                                            }while(!Existe);

                                            do{
                                                Existe=false;
                                                System.out.println("Ingrese la fecha de fin de oferta");
                                                System.out.println("Año: ");
                                                y = leer.nextInt();
                                                System.out.println("Mes: ");
                                                m = leer.nextInt();
                                                System.out.println("Dia: ");
                                                d = leer.nextInt();
                                                leer.nextLine();

                                                if(y>0&&(m>=1&&m<=12)){
                                                    if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                        LocalDate fecha = LocalDate.of(y, m, d);
                                                        if(fecha.isAfter(Articulo.getIncOfer())){
                                                            Articulo.setFinOfer(y, m, d);
                                                        }else{
                                                            System.out.println("La fecha debe ser despues de la fecha de activacion!!");
                                                            Existe = true;
                                                        }
                                                    }else{
                                                        System.out.println("Fecha Invalida");
                                                    }
                                                }else{
                                                    System.out.println("Fecha Incorrecta");
                                                }
                                            }while(Existe);
                                            //Activando oferta
                                            Articulo.ActivarOferta();


                                        }else if(ActOferta==2){
                                            //se desctiva por prevencion
                                            Articulo.DesactivarOferta();
                                            System.out.println("Producto sin oferta activa");
                                        }else{
                                            System.out.println("Opcion Invalida");
                                        }

                                        System.out.println("Ingrese la categoria");
                                        catego = leer.nextLine();
                                        Articulo.setCategoria(catego);

                                        do{
                                            Existe=false;
                                            System.out.println("Ingresa la fecha de caducidad");
                                            System.out.println("Año: ");
                                            y = leer.nextInt();
                                            System.out.println("Mes: ");
                                            m = leer.nextInt();
                                            System.out.println("Dia: ");
                                            d = leer.nextInt();
                                            leer.nextLine();
                                            if(y>0&&(m>=1&&m<=12)){
                                                if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                    LocalDate Cadu = LocalDate.of(y, m, d);
                                                    if(Cadu.isAfter(DiaHoy)){
                                                        Articulo.setCaducidad(y,m,d);
                                                        Existe=true;
                                                    }else{
                                                        System.out.println("No puedes registrar productos vencidos");
                                                    }
                                                }else{
                                                    System.out.println("Fecha Invalida");
                                                }
                                            }else{
                                                System.out.println("Fecha Invalida");
                                            }
                                        }while(!Existe);


                                        System.out.println("Ingresa la descripcion");
                                        descrip = leer.nextLine();
                                        Articulo.setDescripcion(descrip);

                                        do{
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
                                        }while(ExistCodBar);

                                        do{
                                            Existe=false;
                                            System.out.println("Ingrese el ID del Proveedor de este Producto: ");
                                            id=leer.nextInt();
                                            leer.nextInt();
                                            for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                                if(Proveedores.get(i).getId()==id){
                                                    Existe=true;
                                                    Articulo.setProveedor(Proveedores.get(i));
                                                    //se agrega el producto a la lista del proveedor
                                                    Proveedores.get(i).setProducto(Articulo);
                                                }
                                            }
                                            if(!Existe){
                                                System.out.println("ID no registrado\nIntente Nuevamente");
                                            }
                                        }while(!Existe);

                                        System.out.println("Producto Registrado");
                                        Productos.add(Articulo);
                                        System.out.println("Desea Agregar otro Producto? 1-Si, 2-No");
                                        
                                        do{
                                            error =true;
                                            if(leer.hasNextInt()){
                                                opcInt = leer.nextInt();
                                                leer.nextLine();
                                                if (opcInt >= 1 && opcInt <= 2) { 
                                                    error = false;
                                                }
                                            }else{
                                                leer.nextLine();
                                                System.out.println("Ingrese 1 o 2");
                                            }
                                        }while(error);
                                        
                                }while(opcInt!=2);
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
                                        System.out.println("11- Activar Oferta");
                                        System.out.println("12- Desactivar Oferta");
                                        System.out.println("13- Cambiar Proveedor Asignado");
                                        System.out.println("14- Terminar Edicion");
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
                                                do{
                                                    System.out.println("Ingrese el precio base ");
                                                    prec = leer.nextDouble();
                                                    if(prec>0){
                                                        Productos.get(indiceProd).setNormalPrecio(prec);
                                                        System.out.println("Operacion Exitosa!");
                                                    }else{
                                                        System.out.println("Precio no valido");
                                                    }
                                                }while(prec<0);    
                                                break;
                                            case 4:
                                                do{
                                                    System.out.println("Ingrese el precio para la oferta: ");
                                                    precOFER = leer.nextDouble();
                                                    if(precOFER>0){
                                                        Productos.get(indiceProd).setOfertaPrecio(precOFER);
                                                        System.out.println("Operacion Exitosa!");
                                                    }else{
                                                        System.out.println("Precio no Valido");
                                                    }
                                                }while(precOFER<0);
                                                break;
                                            case 5:
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese la fecha de inicio para la oferta");
                                                    System.out.println("Año: ");
                                                    y = leer.nextInt();
                                                    System.out.println("Mes: ");
                                                    m = leer.nextInt();
                                                    System.out.println("Dia: ");
                                                    d = leer.nextInt();
                                                    leer.nextLine();
                                                    if(y>0&&(m>=1&&m<=12)){
                                                        if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                            Productos.get(indiceProd).setIncOfer(y, m, d);
                                                            System.out.println("Operacion Exitosa");
                                                            Existe=true;
                                                        }else{
                                                            System.out.println("Fecha Invalida");
                                                        }
                                                    }else{
                                                        System.out.println("Fecha incorrecta");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 6:
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese la fecha de fin para la oferta");
                                                    System.out.println("Año: ");
                                                    y = leer.nextInt();
                                                    System.out.println("Mes: ");
                                                    m = leer.nextInt();
                                                    System.out.println("Dia: ");
                                                    d = leer.nextInt();
                                                    leer.nextLine();
                                                    if(y>0&&(m>=1&&m<=12)){
                                                        if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                            LocalDate fecha = LocalDate.of(y, m, d);
                                                            if(Productos.get(indiceVendedor).getIncOfer().isBefore(fecha)){
                                                                Productos.get(indiceVendedor).setFinOfer(y, m, d);
                                                                System.out.println("Operacion Exitosa!");
                                                                Existe=true;
                                                            }else{
                                                                System.out.println("La fecha debe ser despues de la fecha de activacion");
                                                            }
                                                        }else{
                                                            System.out.println("Fecha Invalida");
                                                        }
                                                    }else{
                                                        System.out.println("Fecha Invalida");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 7:
                                                do{ 
                                                    Existe=false;
                                                    System.out.println("Ingrese la Cantidad para Inventario");
                                                    stock = leer.nextInt();
                                                    if(stock>0){
                                                        Productos.get(indiceProd).setStock(stock);
                                                        Existe=true;
                                                        System.out.println("Operacion Exitosa!");
                                                    }else{
                                                        System.out.println("Cantidad Invalida");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 8:
                                                do{ 
                                                    Existe=false;
                                                    System.out.println("Ingrese la fecha de caducidad: ");
                                                    System.out.println("Año: ");
                                                    y = leer.nextInt();
                                                    System.out.println("Mes: ");
                                                    m = leer.nextInt();
                                                    System.out.println("Dia: ");
                                                    d = leer.nextInt();
                                                    leer.nextLine();
                                                    if(y>0&&(m>=1&&m<=12)){
                                                        if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                            LocalDate fecha = LocalDate.of(y, m, d);
                                                            if(fecha.isAfter(DiaHoy)){
                                                                Productos.get(indiceProd).setCaducidad(y, m, d);
                                                                Existe=true;
                                                            }else{
                                                                System.out.println("No puedes registrar fechas vencidas");
                                                            }
                                                        }else{
                                                            System.out.println("Fecha Invalida");
                                                        }
                                                    }else{
                                                        System.out.println("Fecha Invalida");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 9:
                                                System.out.println("Ingrese el codigo de barras");
                                                codBar = leer.nextLong();
                                                Productos.get(indiceProd).setCodigoBarras(0);
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
                                                System.out.println("Oferta Activada para "+Productos.get(indiceProd).getNombre());
                                                Productos.get(indiceProd).ActivarOferta();
                                                break;
                                            case 12:
                                                System.out.println("Oferta desactivada para: "+Productos.get(indiceProd).getNombre());
                                                Productos.get(indiceProd).DesactivarOferta();
                                                break;
                                            case 13:
                                                System.out.println("Cambiar Proveedor");
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingresa el ID del Nuevo Proveedor para "+Productos.get(indiceProd).getNombre());
                                                    id = leer.nextInt();
                                                    leer.nextInt();
                                                    for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                                        if(Proveedores.get(i).getId()==id){
                                                            Existe=true;
                                                            Productos.get(indiceProd).setProveedor(Proveedores.get(i));
                                                            System.out.println("El Proveedor "+Proveedores.get(i).getNombre()+" se Asigno a "+Productos.get(indiceProd).getNombre());
                                                        }
                                                    }
                                                    if(!Existe){
                                                        System.out.println("ID no registrado Intente Nuevamente");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 14:
                                                System.out.println("Operacion Finalizada");
                                                break;
                                            default:
                                                System.out.println("Opcion invalida");
                                                
                                        }
                                    }while(modif!=14);
                                }else{
                                    System.out.println("ID no registrado");
                                }
                            }else{
                                System.out.println("No hay Productos Registrados");
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
                            do{
                                System.out.println("Registrar Proveedores");
                                id = IDProveedor+1;
                                System.out.println("Ingrese el nombre: ");
                                nombre = leer.nextLine();
                                System.out.println("Ingresa el nombre de la empresa:");
                                empresa = leer.nextLine();
                                do{
                                    Existe=false;
                                    System.out.println("Ingrese el correo:");
                                    correo = leer.nextLine();
                                    for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                        if(Proveedores.get(i).getCorreo().equals(correo)){
                                            Existe=true;
                                        }
                                    }
                                    if(Existe){
                                        System.out.println("Correo ya registrado\n Intente Nuevamente"); 
                                    }
                                }while(Existe);
                                do{
                                    Existe=false;
                                    do{
                                        System.out.println("Ingrese Telefono:");
                                        tel = leer.nextLine();
                                        if(!(tel.length()==10)){
                                            System.out.println("Telefono invalido");
                                        }
                                    }while(!(tel.length()==10) && (!tel.matches("^\\\\d+$")));

                                    for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                        if(Proveedores.get(i).getTelefono().equals(tel)){
                                            Existe=true;
                                        }
                                    }
                                    if(Existe){
                                        System.out.println("Telefono ya registrado\n Intente nuevamente");
                                    }
                                }while(Existe);
                                do{
                                    Existe=false;
                                    System.out.println("Ingresa la direccion");
                                    direccion = leer.nextLine();
                                    for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                        if(Proveedores.get(i).getDireccion().equals(direccion)){
                                            Existe=true;
                                        }
                                    }
                                    if(Existe){
                                        System.out.println("Alguien mas ya usa esa direccion");
                                    }
                                }while(Existe);
                                System.out.println("Ingrese el Tipo de Producto: ");
                                catego = leer.nextLine();

                                Proveedor Provee = new Proveedor(id,nombre,tel,correo);
                                Provee.setNombreEmpresa(empresa);
                                Provee.setDireccion(direccion);
                                Provee.setTipoProducto(catego);
                                System.out.println("Proveedor Registrado");
                                Proveedores.add(Provee);
                                System.out.println("Desea agregar otro Proveedor? 1-Si 2-No");
                                boolean error;
                                do{
                                    error =true;
                                    if(leer.hasNextInt()){
                                        opcInt = leer.nextInt();
                                        leer.nextLine();
                                        if (opcInt >= 1 && opcInt <= 2) { 
                                            error = false;
                                        }
                                    }else{
                                        leer.nextLine();
                                        System.out.println("Ingrese 1 o 2");
                                    }
                                }while(error);
                            }while(opcInt==1);
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
                                        System.out.println("7- Eliminar un Producto que Surte");
                                        System.out.println("8- Finalizar");
                                        opcion = leer.nextInt();
                                        switch(opcion){
                                            case 1:
                                                System.out.println("Ingrese el nuevo nombre: ");
                                                leer.nextLine();
                                                nombre = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setNombre(nombre);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 2:
                                                do{
                                                    Existe=false;
                                                    do{
                                                        System.out.println("Ingrese Telefono:");
                                                        tel = leer.nextLine();
                                                        if(!(tel.length()==10)){
                                                            System.out.println("Telefono invalido");
                                                        }
                                                    }while(!(tel.length()==10) && (!tel.matches("^\\\\d+$")));
                                                    Proveedores.get(indiceProveedor).setTelefono("");
                                                    for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                                        if(Proveedores.get(i).getTelefono().equals(tel)){
                                                        Existe=true;
                                                        }
                                                    }
                                                    if(!Existe){
                                                        Proveedores.get(indiceProveedor).setTelefono(tel);
                                                        System.out.println("Operacion Exitosa!");
                                                    }else{
                                                        System.out.println("Telefono Asignado a alguien mas\n Use otro");
                                                    }
                                                }while(Existe);
                                                break;
                                            case 3:
                                                do{
                                                    Existe=false;                                                
                                                    System.out.println("Ingrese el nuevo Correo");
                                                    leer.nextLine();
                                                    correo = leer.nextLine();
                                                    for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                                        if(Proveedores.get(i).equals(correo)){
                                                            Existe=true;
                                                        }
                                                    }
                                                    if(!Existe){
                                                        Proveedores.get(indiceProveedor).setCorreo(correo);
                                                        System.out.println("Operacion Exitosa!!");
                                                    }else{
                                                        System.out.println("Correo Asignado a alguien mas\n Use otro");
                                                    }
                                                }while(Existe);
                                                break;
                                            case 4:
                                                System.out.println("Ingrese la nueva empresa: ");
                                                leer.nextLine();
                                                empresa = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setNombreEmpresa(empresa);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 5:
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese la nueva Direccion: ");
                                                    leer.nextLine();
                                                    direccion = leer.nextLine();
                                                    for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                                        if(Proveedores.get(i).getDireccion().equals(direccion)){
                                                            Existe=true;
                                                        }
                                                    }
                                                    if(Existe){
                                                        System.out.println("Direccion Asignada a alguien mas\nUse otra");
                                                    }else{
                                                        Proveedores.get(indiceProveedor).setDireccion(direccion);
                                                    }
                                                    Proveedores.get(indiceProveedor).setDireccion(direccion);
                                                    System.out.println("Operacion Exitosa!");
                                                }while(Existe);
                                                break;
                                            case 6:
                                                System.out.println("Ingrese el nuevo tipo de Productos: ");
                                                leer.nextLine();
                                                catego = leer.nextLine();
                                                Proveedores.get(indiceProveedor).setTipoProducto(catego);
                                                System.out.println("Operacion Exitosa!");
                                                break;
                                            case 7:
                                                System.out.println("Eliminar Producto");
                                                if(!Proveedores.get(indiceProveedor).getLista().isEmpty()){
                                                    do{
                                                        Existe=false;
                                                        System.out.println("Ingresa el ID del producto a eliminar");
                                                        id = leer.nextInt();
                                                        for(int i=0;i<Proveedores.get(indiceProveedor).getLista().size()&&!Existe;i++){
                                                                if(Proveedores.get(indiceProveedor).getLista().get(i).getID()==id){
                                                                    Existe=true;
                                                                    System.out.println("El producto "+Proveedores.get(indiceProveedor).getLista().remove(i).getNombre()+" se borro del Proveedor "+Proveedores.get(indiceProveedor).getNombre());
                                                                }
                                                        }
                                                        if(!Existe){
                                                            System.out.println("ID no encontrado intente nuevamente");
                                                        }
                                                    }while(!Existe);
                                                }else{
                                                    System.out.println(Proveedores.get(indiceProveedor).getNombre()+" NO tiene productos asignados");
                                                }
                                                break;
                                            case 8:
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
                                    p.MostrarInfo();
                                    
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
                            }else{
                                System.out.println("No hay Proveedores Registrados");
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
                                        Proveedores.get(i).MostrarInfo();
                                        
                                        System.out.println("Productos que Surte: ");
                                        Proveedores.get(indiceProveedor).getProductos();
                                    }
                                }
                            }else{
                                System.out.println("No hay proveedores Registrados");
                            }
                            break;
                        case 14:
                            do{
                                System.out.println("Registrar Clientes");
                                id = IDCliente+1;
                                System.out.println("Ingresa el Nombre: ");
                                nombre = leer.nextLine();
                                do{
                                    do{
                                        System.out.println("Ingrese Telefono:");
                                        tel = leer.nextLine();
                                        if(!(tel.length()==10)){
                                            System.out.println("Telefono invalido");
                                        }
                                    }while(!(tel.length()==10) && (!tel.matches("^\\\\d+$")));
                                    Existe=false;
                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                        if(Clientes.get(i).getTelefono().equals(tel)){
                                            Existe=true;
                                        }
                                    }
                                    if(Existe){
                                        System.out.println("Telefono Asignado a alguien mas\nIntente Otra Vez");
                                    }
                                }while(Existe);
                                do{
                                    Existe=false;
                                    System.out.println("Ingrese el correo: ");
                                    correo = leer.nextLine();
                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                        if(Clientes.get(i).getCorreo().equals(correo)){
                                            Existe=true;
                                        }
                                    }
                                    if(Existe){
                                        System.out.println("Correo Asiganado a alguien mas\nIntente Otra Vez");
                                    }
                                }while(Existe);
                                do{
                                    Existe=false;
                                    System.out.println("Ingrese la Direccion:");
                                    direccion = leer.nextLine();
                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                        if(Clientes.get(i).getDireccion().equals(direccion)){
                                            Existe=true;
                                        }
                                    }
                                    if(Existe){
                                        System.out.println("Direccion Asiganada a alguien mas\nintente Otra Vez");
                                    }
                                }while(Existe);

                                    Cliente clien = new Cliente(id,nombre,tel,correo);
                                    clien.setDireccion(direccion);
                                    clien.setFechaR(DiaHoy);
                                    Clientes.add(clien);
                                    System.out.println("Cliente Registrado Exitosamente!");
                                    System.out.println("Desea Registrar Otro Cliente? 1-Si 2-No");
                                    boolean error;
                                    do{
                                        error =true;
                                        if(leer.hasNextInt()){
                                            opcInt = leer.nextInt();
                                            leer.nextLine();
                                            if (opcInt >= 1 && opcInt <= 2) { 
                                                error = false;
                                            }
                                        }else{
                                            leer.nextLine();
                                            System.out.println("Ingrese 1 o 2");
                                        }
                                    }while(error);
                            }while(opcInt==1);
                                
                                
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
                                            case 2://agregar verificacion
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese el Nuevo Correo:");
                                                    correo = leer.nextLine();
                                                    Clientes.get(indiceCliente).setCorreo("");
                                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                                        if(Clientes.get(i).getCorreo().equals(correo)){
                                                            Existe=true;
                                                        }
                                                    }
                                                    if(Existe){
                                                        System.out.println("Correo Asignado a Alguien mas\nIntente nuevamente");
                                                    }else{
                                                        Clientes.get(indiceCliente).setCorreo(correo);
                                                        System.out.println("Modificacion Exitosa!");
                                                    }
                                                }while(Existe=false);
                                                break;
                                            case 3:
                                                do{
                                                    Existe=false;
                                                    do{
                                                        System.out.println("Ingrese Telefono:");
                                                        tel = leer.nextLine();
                                                        if(!(tel.length()==10)){
                                                            System.out.println("Telefono invalido");
                                                        }
                                                    }while(!(tel.length()==10) && (!tel.matches("^\\\\d+$")));
                                                    
                                                    Clientes.get(indiceCliente).setTelefono("");
                                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                                        if(Clientes.get(i).getTelefono().equals(tel)){
                                                            Existe=true;
                                                        }
                                                    }
                                                    if(Existe){
                                                        System.out.println("Telefono Asignado a Alguien mas\nIntente nuevamente");
                                                    }else{
                                                        Clientes.get(indiceCliente).setTelefono(tel);
                                                        System.out.println("Modificacion Exitosa!");
                                                    }
                                                }while(Existe=false);
                                                break;
                                            case 4:
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese la Nueva Direccion:");
                                                    direccion = leer.nextLine();
                                                    Clientes.get(indiceCliente).setDireccion("");
                                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                                        if(Clientes.get(i).getDireccion().equals(direccion)){
                                                            Existe=true;
                                                        }
                                                    }
                                                    if(Existe){
                                                        System.out.println("Direccion Asignada a Alguien mas\nIntente nuevamente");
                                                    }else{
                                                        Clientes.get(indiceCliente).setDireccion(direccion);
                                                        System.out.println("Modificacion Exitosa!");
                                                    }
                                                }while(Existe);
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
                                for(Cliente c:Clientes){
                                    c.MostrarInfo();
                                    System.out.println("---------------------------------");
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
                                        Clientes.get(i).MostrarInfo();
                                        
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
                            
                        case 20:
                            System.out.println("Adios");
                            CerrarPrograma=true;
                        break;
                        
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }
                }while(opc!=19 && opc!=20);
                
            }else if(LLamarVendedor){
                do{
                    opc=0;
                    MostrarMenuEmpleado();
                    opc = leer.nextInt();
                    leer.nextLine();
                    switch(opc){
                        
                        case 1:
                            Ventas venta = new Ventas();
                            double total = 0;
                            Cliente c = new Cliente();
                            
                                    
                            if(!Productos.isEmpty() && !Empleados.isEmpty() && !Clientes.isEmpty() ){
                                System.out.println("Realizar Venta");

                                int IdCliente, IdVendedor;

                                

                                
                                boolean ExistCliente=false;
                                ExistVendedor=false;
                                Cliente clienteEncontrado = null;
                                Empleado empleadoEncontrado = null;

                                do{
                                    
                                    System.out.println("Ingrese ID del cliente");
                                    IdCliente = leer.nextInt();
                                    for(int j=0;j<Clientes.size()&&!ExistCliente;j++){
                                        if(IdCliente==Clientes.get(j).getId()){
                                            ExistCliente=true;
                                            
                                            clienteEncontrado=Clientes.get(j);
                                        }
                                    }
                                }while(!ExistCliente);
                                
                                
                               
                                do{
                                    System.out.println("Ingrese ID del Vendedor");
                                    IdVendedor = leer.nextInt();
                                    for(int i=0;i<Empleados.size()&&!ExistCliente;i++){
                                        if(IdVendedor==Empleados.get(i).getId()){
                                            ExistVendedor=true;
                                            empleadoEncontrado = Empleados.get(i);
                                        }
                                    }
                                } while(!ExistVendedor);
                                
                                
                                if(ExistCliente==true && ExistVendedor==true){
                                    id = IDVenta+1;
                                    venta.setID(id);
                                    venta.setCliente(clienteEncontrado);
                                    venta.setEmpleado(empleadoEncontrado);
                                    
                                    do{

                                    Producto ProductoSeleccionado = new Producto(); 
                                   
                                    boolean error;
                                        do{
                                            error=false;
                                            System.out.println("\n Productos Disponibles:");
                                            
                                            //mostrar todos los productos o cambiar por lector de cod barras
                                            for(Producto p : Productos) {
                                                System.out.println(p.getID() + ". " + p.getNombre() +" - $" + p.getNormalPrecio() + " Stock: " + p.getStock());
                                            }
                                            boolean productoExist=false;
                                           do{
                                                System.out.println("Ingrese el id del producto:");

                                                int idproducto = leer.nextInt();
                                                
                                                for(int i=0;i<Productos.size()&&!productoExist;i++) {
                                                    if(Productos.get(i).getID() == idproducto) {
                                                        ProductoSeleccionado = Productos.get(i);
                                                        productoExist=true;
                                                    }
                                                }
                                           }while(!productoExist);
                                           
                                            if(productoExist){
                                                Existe=false;
                                                do{
                                                    System.out.println("Ingrese la cantidad que desea:");
                                                    int cantidad = leer.nextInt();


                                                    if(ProductoSeleccionado.getStock()>=cantidad && cantidad>0){
                                                        ItemVenta item = new ItemVenta(ProductoSeleccionado, cantidad);
                                                        ProductoSeleccionado.ReducirStock(cantidad);
                                                        venta.AgregarItem(item);
                                                        Existe=true;
                                                        System.out.println("Producto añadido");
                                                    }else{
                                                        System.out.println("Stock insuficiente. Intentelo de nuevo \n");
                                                        error=true;
                                                    }
                                                }while(!Existe);
                                            }else{
                                                System.out.println("Producto no encontrado. Intentelo de nuevo \n");
                                                error=true;
                                            }
                                            
                                        }while(error);
                                        
                                        System.out.println("Desea Registrar Otro Producto? 1-Si 2-No");
                                    
                                        do{
                                            error =true;
                                            if(leer.hasNextInt()){
                                                opcInt = leer.nextInt();
                                                leer.nextLine();
                                                if (opcInt >= 1 && opcInt <= 2) { 
                                                    error = false;
                                                }
                                            }else{
                                                leer.nextLine();
                                                System.out.println("Ingrese 1 o 2");
                                            }
                                        }while(error);
                                        
                                    }while(opc!=2);
                                    
                                    total=venta.CalcularTotal();
                                    clienteEncontrado.setTotalC(clienteEncontrado.getTotalC()+total);
                                    System.out.println("Total a pagar: $"+total);
                                    if(total>0){
                                        double pago;
                                        do{
                                            System.out.println("Ingrese su pago: ");
                                            pago = leer.nextDouble();
                                            if(pago>total){
                                                System.out.println("Su cambio es: "+venta.CalcularCambio());
                                                venta.setPago(pago);
                                            }else if(pago==total){
                                                venta.setPago(pago);
                                            }else if(pago<total){
                                                System.out.println("Transaccion no valida\n Hoy no fio, mañana si");
                                            }
                                        }while(pago<total);
                                    } 
                                    
                                    venta.MostrarResumen();
                                    Venta.add(venta);
                                }else
                                    if(!ExistCliente){
                                        System.out.println("Cliente no encontrado");
                                    }if(!ExistVendedor){
                                        System.out.println("Empleado no encontrado");
                                    }
                                
                                
                            }else
                                System.out.println("Datos insuficientes");
                            break;   
   
                            
                            
                            
                        case 2:
                            System.out.println("Mostrar Ventas realizadas");
                                if(!Venta.isEmpty()){
                                    for(Ventas vent:Venta){
                                       vent.MostrarResumen();
                                    }
                                }else
                                    System.out.println("No se ha registrado ninguna venta");
                            break;   
                        
                        case 3:
                            if(Proveedores.isEmpty()){
                                System.out.println("Se necesitan Proveedores Para Registrar Productos");
                            }else{
                                do{
                                    System.out.println("Registrar Productos");

                                    id = IDProducto+1;


                                        Producto Articulo = new Producto();
                                        Articulo.setID(id);
                                        System.out.println("Ingresa el nombre del producto:");
                                        nombre = leer.nextLine();
                                        Articulo.setNombre(nombre);
                                        do{
                                            System.out.println("Ingrese la cantidad para inventario: ");
                                            stock = leer.nextInt();
                                            leer.nextLine();
                                            if(stock>0){
                                                Articulo.setStock(stock);
                                            }else{
                                                System.out.println("Cantidad Invalida\n Introduzca los datos nuevamente");
                                            }
                                        }while(stock<=0);

                                        do{
                                            System.out.println("Ingrese el precio del producto");
                                            prec=leer.nextDouble();  
                                            if(prec<0){
                                                System.out.println("Precio Invalido intente nuevamente:");
                                            }else{
                                                Articulo.setNormalPrecio(prec);
                                            }
                                        }while(prec<0);   

                                        System.out.println("Su producto tendra una oferta activa? 1-Si 2-No ");
                                        boolean error;
                                        do{
                                            error =true;
                                            if(leer.hasNextInt()){
                                                ActOferta = leer.nextInt();
                                                leer.nextLine();
                                                if (ActOferta >= 1 && ActOferta <= 2) { 
                                                    error = false;
                                                }
                                            }else{
                                                leer.nextLine();
                                                System.out.println("Ingrese 1 o 2");
                                            }
                                        }while(error);

                                        if(ActOferta==1){
                                            do{
                                                System.out.println("Ingrese el precio para su oferta:");
                                                precOFER=leer.nextDouble();
                                                if(precOFER<=0){
                                                    System.out.println("Precio Invalido intente nuevamente:");
                                                }else{
                                                    Articulo.setOfertaPrecio(precOFER);
                                                }
                                            }while(precOFER<=0);

                                            do{
                                                Existe=false;
                                                System.out.println("Ingrese la fecha de inicio de oferta");
                                                System.out.println("Año: ");
                                                y = leer.nextInt();
                                                System.out.println("Mes: ");
                                                m = leer.nextInt();
                                                System.out.println("Dia: ");
                                                d = leer.nextInt();
                                                leer.nextLine();
                                                if(y>0&&(m>=1&&m<=12)){
                                                    if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                        Articulo.setIncOfer(y, m, d);
                                                        Existe=true;
                                                    }else{
                                                        System.out.println("Fecha Invalida");
                                                    }
                                                }else{
                                                    System.out.println("Fecha Incorrecta\n Intente Nuevamente");
                                                }
                                            }while(!Existe);

                                            do{
                                                Existe=false;
                                                System.out.println("Ingrese la fecha de fin de oferta");
                                                System.out.println("Año: ");
                                                y = leer.nextInt();
                                                System.out.println("Mes: ");
                                                m = leer.nextInt();
                                                System.out.println("Dia: ");
                                                d = leer.nextInt();
                                                leer.nextLine();

                                                if(y>0&&(m>0&&m<=12)){
                                                    if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                        LocalDate fecha = LocalDate.of(y, m, d);
                                                        if(fecha.isAfter(Articulo.getIncOfer())){
                                                            Articulo.setFinOfer(y, m, d);
                                                        }else{
                                                            System.out.println("La fecha debe ser despues de la fecha de activacion!!");
                                                            Existe = true;
                                                        }
                                                    }else{
                                                        System.out.println("Fecha Invalida");
                                                    }
                                                }else{
                                                    System.out.println("Fecha Incorrecta");
                                                }
                                            }while(Existe);
                                            //Activando oferta
                                            Articulo.ActivarOferta();


                                        }else if(ActOferta==2){
                                            //se desctiva por prevencion
                                            Articulo.DesactivarOferta();
                                            System.out.println("Producto sin oferta activa");
                                        }else{
                                            System.out.println("Opcion Invalida");
                                        }

                                        System.out.println("Ingrese la categoria");
                                        catego = leer.nextLine();
                                        Articulo.setCategoria(catego);

                                        do{
                                            Existe=false;
                                            System.out.println("Ingresa la fecha de caducidad");
                                            System.out.println("Año: ");
                                            y = leer.nextInt();
                                            System.out.println("Mes: ");
                                            m = leer.nextInt();
                                            System.out.println("Dia: ");
                                            d = leer.nextInt();
                                            leer.nextLine();
                                            if(y>0&&(m>=1&&m<=12)){
                                                if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                    LocalDate Cadu = LocalDate.of(y, m, d);
                                                    if(Cadu.isAfter(DiaHoy)){
                                                        Articulo.setCaducidad(y,m,d);
                                                        Existe=true;
                                                    }else{
                                                        System.out.println("No puedes registrar productos vencidos");
                                                    }
                                                }else{
                                                    System.out.println("Fecha Invalida");
                                                }
                                            }else{
                                                System.out.println("Fecha Invalida");
                                            }
                                        }while(!Existe);


                                        System.out.println("Ingresa la descripcion");
                                        descrip = leer.nextLine();
                                        Articulo.setDescripcion(descrip);

                                        do{
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
                                        }while(ExistCodBar);

                                        do{
                                            Existe=false;
                                            System.out.println("Ingrese el ID del Proveedor de este Producto: ");
                                            id=leer.nextInt();
                                            leer.nextInt();
                                            for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                                if(Proveedores.get(i).getId()==id){
                                                    Existe=true;
                                                    Articulo.setProveedor(Proveedores.get(i));
                                                    //se agrega el producto a la lista del proveedor
                                                    Proveedores.get(i).setProducto(Articulo);
                                                }
                                            }
                                            if(!Existe){
                                                System.out.println("ID no registrado\nIntente Nuevamente");
                                            }
                                        }while(!Existe);

                                        System.out.println("Producto Registrado");
                                        Productos.add(Articulo);
                                        System.out.println("Desea Agregar otro Producto? 1-Si, 2-No");
                                        opcInt = leer.nextInt();
                                        leer.nextLine();
                                }while(opcInt!=2);
                            }
                            break;
                        case 4:
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
                                        System.out.println("11- Activar Oferta");
                                        System.out.println("12- Desactivar Oferta");
                                        System.out.println("13- Cambiar Proveedor Asignado");
                                        System.out.println("14- Terminar Edicion");
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
                                                do{
                                                    System.out.println("Ingrese el precio base ");
                                                    prec = leer.nextDouble();
                                                    if(prec>0){
                                                        Productos.get(indiceProd).setNormalPrecio(prec);
                                                        System.out.println("Operacion Exitosa!");
                                                    }else{
                                                        System.out.println("Precio no valido");
                                                    }
                                                }while(prec<0);    
                                                break;
                                            case 4:
                                                do{
                                                    System.out.println("Ingrese el precio para la oferta: ");
                                                    precOFER = leer.nextDouble();
                                                    if(precOFER>0){
                                                        Productos.get(indiceProd).setOfertaPrecio(precOFER);
                                                        System.out.println("Operacion Exitosa!");
                                                    }else{
                                                        System.out.println("Precio no Valido");
                                                    }
                                                }while(precOFER<0);
                                                break;
                                            case 5:
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese la fecha de inicio para la oferta");
                                                    System.out.println("Año: ");
                                                    y = leer.nextInt();
                                                    System.out.println("Mes: ");
                                                    m = leer.nextInt();
                                                    System.out.println("Dia: ");
                                                    d = leer.nextInt();
                                                    leer.nextLine();
                                                    if(y>0&&(m>=1&&m<=12)){
                                                        if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                            Productos.get(indiceProd).setIncOfer(y, m, d);
                                                            System.out.println("Operacion Exitosa");
                                                            Existe=true;
                                                        }else{
                                                            System.out.println("Fecha Invalida");
                                                        }
                                                    }else{
                                                        System.out.println("Fecha incorrecta");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 6:
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese la fecha de fin para la oferta");
                                                    System.out.println("Año: ");
                                                    y = leer.nextInt();
                                                    System.out.println("Mes: ");
                                                    m = leer.nextInt();
                                                    System.out.println("Dia: ");
                                                    d = leer.nextInt();
                                                    leer.nextLine();
                                                    if(y>0&&(m>=1&&m<=12)){
                                                        if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                            LocalDate fecha = LocalDate.of(y, m, d);
                                                            if(Productos.get(indiceVendedor).getIncOfer().isBefore(fecha)){
                                                                Productos.get(indiceVendedor).setFinOfer(y, m, d);
                                                                System.out.println("Operacion Exitosa!");
                                                                Existe=true;
                                                            }else{
                                                                System.out.println("La fecha debe ser despues de la fecha de activacion");
                                                            }
                                                        }else{
                                                            System.out.println("Fecha Invalida");
                                                        }
                                                    }else{
                                                        System.out.println("Fecha Invalida");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 7:
                                                do{ 
                                                    Existe=false;
                                                    System.out.println("Ingrese la Cantidad para Inventario");
                                                    stock = leer.nextInt();
                                                    if(stock>0){
                                                        Productos.get(indiceProd).setStock(stock);
                                                        Existe=true;
                                                        System.out.println("Operacion Exitosa!");
                                                    }else{
                                                        System.out.println("Cantidad Invalida");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 8:
                                                do{ 
                                                    Existe=false;
                                                    System.out.println("Ingrese la fecha de caducidad: ");
                                                    System.out.println("Año: ");
                                                    y = leer.nextInt();
                                                    System.out.println("Mes: ");
                                                    m = leer.nextInt();
                                                    System.out.println("Dia: ");
                                                    d = leer.nextInt();
                                                    leer.nextLine();
                                                    if(y>0&&(m>0&&m<=12)){
                                                        if(d>=1&&d<=YearMonth.of(y, m).lengthOfMonth()){
                                                            LocalDate fecha = LocalDate.of(y, m, d);
                                                            if(fecha.isAfter(DiaHoy)){
                                                                Productos.get(indiceProd).setCaducidad(y, m, d);
                                                                Existe=true;
                                                            }else{
                                                                System.out.println("No puedes registrar fechas vencidas");
                                                            }
                                                        }else{
                                                            System.out.println("Fecha Invalida");
                                                        }
                                                    }else{
                                                        System.out.println("Fecha Invalida");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 9:
                                                System.out.println("Ingrese el codigo de barras");
                                                codBar = leer.nextLong();
                                                Productos.get(indiceProd).setCodigoBarras(0);
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
                                                System.out.println("Oferta Activada para "+Productos.get(indiceProd).getNombre());
                                                Productos.get(indiceProd).ActivarOferta();
                                                break;
                                            case 12:
                                                System.out.println("Oferta desactivada para: "+Productos.get(indiceProd).getNombre());
                                                Productos.get(indiceProd).DesactivarOferta();
                                                break;
                                            case 13:
                                                System.out.println("Cambiar Proveedor");
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingresa el ID del Nuevo Proveedor para "+Productos.get(indiceProd).getNombre());
                                                    id = leer.nextInt();
                                                    leer.nextInt();
                                                    for(int i=0;i<Proveedores.size()&&!Existe;i++){
                                                        if(Proveedores.get(i).getId()==id){
                                                            Existe=true;
                                                            Productos.get(indiceProd).setProveedor(Proveedores.get(i));
                                                            System.out.println("El Proveedor "+Proveedores.get(i).getNombre()+" se Asigno a "+Productos.get(indiceProd).getNombre());
                                                        }
                                                    }
                                                    if(!Existe){
                                                        System.out.println("ID no registrado Intente Nuevamente");
                                                    }
                                                }while(!Existe);
                                                break;
                                            case 14:
                                                System.out.println("Operacion Finalizada");
                                                break;
                                            default:
                                                System.out.println("Opcion invalida");
                                                
                                        }
                                    }while(modif!=14);
                                }else{
                                    System.out.println("ID no registrado");
                                }
                            }else{
                                System.out.println("No hay Productos Registrados");
                            }
                            
                            break;
                        case 5:
                            System.out.println("Registrar Clientes");
                            id = IDCliente+1;
                            System.out.println("Ingresa el Nombre: ");
                            nombre = leer.nextLine();
                            do{
                                do{
                                    System.out.println("Ingrese Telefono:");
                                    tel = leer.nextLine();
                                    if(!(tel.length()==10)){
                                        System.out.println("Telefono invalido");
                                    }
                                }while(!(tel.length()==10) && (!tel.matches("^\\\\d+$")));
                                Existe=false;
                                for(int i=0;i<Clientes.size()&&!Existe;i++){
                                    if(Clientes.get(i).getTelefono().equals(tel)){
                                        Existe=true;
                                    }
                                }
                                if(Existe){
                                    System.out.println("Telefono Asignado a alguien mas\nIntente Otra Vez");
                                }
                            }while(Existe);
                            do{
                                Existe=false;
                                System.out.println("Ingrese el correo: ");
                                correo = leer.nextLine();
                                for(int i=0;i<Clientes.size()&&!Existe;i++){
                                    if(Clientes.get(i).getCorreo().equals(correo)){
                                        Existe=true;
                                    }
                                }
                                if(Existe){
                                    System.out.println("Correo Asiganado a alguien mas\nIntente Otra Vez");
                                }
                            }while(Existe);
                            do{
                                Existe=false;
                                System.out.println("Ingrese la Direccion:");
                                direccion = leer.nextLine();
                                for(int i=0;i<Clientes.size()&&!Existe;i++){
                                    if(Clientes.get(i).getDireccion().equals(direccion)){
                                        Existe=true;
                                    }
                                }
                                if(Existe){
                                    System.out.println("Direccion Asiganada a alguien mas\nintente Otra Vez");
                                }
                            }while(Existe);
                            
                                Cliente clien = new Cliente(id,nombre,tel,correo);
                                clien.setDireccion(direccion);
                                clien.setFechaR(DiaHoy);
                                Clientes.add(clien);
                                System.out.println("Cliente Registrado Exitosamente!");
                                    
                            break;
                        case 6:
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
                                            case 2://agregar verificacion
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese el Nuevo Correo:");
                                                    correo = leer.nextLine();
                                                    Clientes.get(indiceCliente).setCorreo("");
                                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                                        if(Clientes.get(i).getCorreo().equals(correo)){
                                                            Existe=true;
                                                        }
                                                    }
                                                    if(Existe){
                                                        System.out.println("Correo Asignado a Alguien mas\nIntente nuevamente");
                                                    }else{
                                                        Clientes.get(indiceCliente).setCorreo(correo);
                                                        System.out.println("Modificacion Exitosa!");
                                                    }
                                                }while(Existe=false);
                                                break;
                                            case 3:
                                                do{
                                                    Existe=false;
                                                    do{
                                                        System.out.println("Ingrese Telefono:");
                                                        tel = leer.nextLine();
                                                        if(!(tel.length()==10)){
                                                            System.out.println("Telefono invalido");
                                                        }
                                                    }while(!(tel.length()==10) && (!tel.matches("^\\\\d+$")));
                                                    Clientes.get(indiceCliente).setTelefono("");
                                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                                        if(Clientes.get(i).getTelefono().equals(tel)){
                                                            Existe=true;
                                                        }
                                                    }
                                                    if(Existe){
                                                        System.out.println("Telefono Asignado a Alguien mas\nIntente nuevamente");
                                                    }else{
                                                        Clientes.get(indiceCliente).setTelefono(tel);
                                                        System.out.println("Modificacion Exitosa!");
                                                    }
                                                }while(Existe=false);
                                                break;
                                            case 4:
                                                do{
                                                    Existe=false;
                                                    System.out.println("Ingrese la Nueva Direccion:");
                                                    direccion = leer.nextLine();
                                                    Clientes.get(indiceCliente).setDireccion("");
                                                    for(int i=0;i<Clientes.size()&&!Existe;i++){
                                                        if(Clientes.get(i).getDireccion().equals(direccion)){
                                                            Existe=true;
                                                        }
                                                    }
                                                    if(Existe){
                                                        System.out.println("Direccion Asignada a Alguien mas\nIntente nuevamente");
                                                    }else{
                                                        Clientes.get(indiceCliente).setDireccion(direccion);
                                                        System.out.println("Modificacion Exitosa!");
                                                    }
                                                }while(Existe);
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
                        case 7://buscar y mostrar
                            System.out.println("Consultar Producto");
                                if(!Productos.isEmpty()){
                                    for(Producto producto:Productos)
                                        producto.MostrarInfoProd();
                                }else{
                                    System.out.println("No hay productos Registrados");
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
                                    Proveedores.get(indiceProveedor).MostrarInfo();
                                    System.out.println("Productos que Surte: ");
                                    Proveedores.get(indiceProveedor).getProductos();
                                   
                                    
                                }else{
                                    System.out.println("ID no registrado");
                                }
                                
                            }else{
                                System.out.println("No hay Proveedores Registrados");
                            }
                            
                            break;
                        case 9:
                            System.out.println("Sesion Cerrada");
                            break;
                            
                        case 10:
                            System.out.println("Adios");
                            CerrarPrograma=true;
                        break;
                        
                        default:
                            System.out.println("Opcion Invalida");
                    }
                }while(opc!=9 && opc!= 10);
            }
           }while(!CerrarPrograma);
           
           
    }
}
