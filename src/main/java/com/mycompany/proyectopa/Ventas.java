/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopa;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
/**
 *
 * @author dylan
 */
public class Ventas {
    private int ID;
    private LocalDateTime Fecha = LocalDateTime.now();
    private String hora;
    private double TotalVenta;
    private int DescuentoAplicado;
    private double Pago;
    private double cambio;
    private Empleado empleado;
    private Cliente cliente;
    private Producto producto;
    private ArrayList<ItemVenta> items = new ArrayList<>();
   
    public double CalcularSubtotal(){
        double subtotal=0;
            for(int i=0; i<items.size();i++){
                subtotal+=items.get(i).CalcularSubTotal();
            
            }
            return subtotal;
            
    }
    
    
    public double CalcularTotal(){
        double subtotal=CalcularSubtotal();
        double descuento=CalcularDescuento();
        
        if(cliente.getDescuento()>0){
            TotalVenta=subtotal-descuento;
        }else{
            TotalVenta=subtotal;
        }
        return TotalVenta;
            
    }
    
    public void MostrarResumen(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fecha = formato.format(Fecha);
        
        System.out.println("Venta: "+ID);
        System.out.println("Fecha y hora: " + fecha);
        System.out.println("ID del cliente: "+cliente.getId());
        System.out.println("ID del empleado: "+empleado.getId());
        System.out.println("--------------PRODUCTOS-------------");
        
        for(ItemVenta item:items){
            Producto producto = item.getProducto();
            System.out.println(producto.getID()+". "+producto.getNombre());
            System.out.println("Cantidad: "+item.getCantidad());
            
            if((producto.getIncOfer()!=null)&&(producto.getIncOfer().isAfter(LocalDate.now())) && (producto.getFinOfer()!=null)&&(producto.getFinOfer().isBefore(LocalDate.now())) )
                System.out.println("Precio unitario: $"+producto.getOfertaPrecio());
            else
                System.out.println("Precio unitario: $"+producto.getNormalPrecio());
            
            System.out.println("Subtotal: $"+item.CalcularSubTotal());
            
        }
        
        
        System.out.println("--------------------------------------");
        if(cliente.getDescuento()>0 && cliente.getDescuento() == Descuentos()){
            System.out.println("Subtotal de venta: $"+CalcularSubtotal());
            System.out.println("Descuento aplicado: "+cliente.getDescuento()+"%");
        }else{ 
            System.out.println("Sin descuento");
        }
        System.out.println("Total de la venta: $"+CalcularTotal());
        System.out.println("Pago recibido: $"+Pago);
        System.out.println("Cambio: $"+CalcularCambio());
        }
        
        
    
    public double CalcularDescuento(){

        double sub = CalcularSubtotal();
        int porcentaje = Descuentos();
        double descuento;
        
        descuento = sub*(porcentaje/100.00);
        
        return descuento;
    }
    
    public int Descuentos(){
                //en base a 2000 pesos en adelante
        if(cliente.getTotalC()>=2000 && cliente.getTotalC()<7000){
            DescuentoAplicado = 5;
        }else if(cliente.getTotalC()>=7000 && cliente.getTotalC()<20000){
            DescuentoAplicado = 10;
        }else if(cliente.getTotalC()>=20000){
            DescuentoAplicado = 15;
        }
        
        return DescuentoAplicado;
    }
    
    
    public void AgregarItem(ItemVenta item){

        items.add(item);
    }
            
            
    public void setID(int ID){
        this.ID = ID;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setEmpleado(Empleado empleado){
        this.empleado = empleado;
    }
    
    public void setPago(Double Pago){
        this.Pago = Pago;
    }
    public void setCambio(){
        this.cambio = CalcularCambio();
    }
    
    
    
    public double getPago(){
        return Pago;
    }
    public double getCambio(){
        return cambio;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public Empleado getEmpleado(){
        return empleado;
    }
    
    public double CalcularCambio(){
        
        if (Pago>TotalVenta)
            cambio = Pago-TotalVenta;
        return cambio;
    }
    
}
