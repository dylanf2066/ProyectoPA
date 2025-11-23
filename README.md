# ProyectoPA


CLASES:

	1.Persona(Clase Padre):
		·ID
		·Nombre
		·Telefono
		·Correo
	
	2. Cliente:
		·Dirreccion
		·MontoT acumulado de compras
		·Descuento dispo(si aplica)
		·Fecha de registro
		
	3. Empleado: 
		·Usuario de acceso
		·Contraseña
		·Puesto
	
	4.Proveedor:
		·Nombre de empresa
		·Dirreccion
		·Tipo de producto
		
	5.Productos:
		·ID
		·Nombre
		·Descripcion
		·Precio(normal y en oferta(si aplica))
		·Fecha(inicio y fin de oferta)
		·Stock
		·Fecha de caducidad
		·Categoria
		·ID del proveedor	
		·Proveedor
		·Codigo barras
		
	6.Ventas: 
		·ID venta
		·Fecha y hora
		·Nombre Cliente(o ID)
		·Nombre empleado(o ID)
		·Lista de productos
			~ID producto
			~Cantidad
			~Precio unitario
			~subtotal por producto
		·Total venta
		·Descuento aplicado (si hay)
		·Pago (recibido y cambio)
		
		
FUNCIONES (OBVIAS y GENERALES):
	
	1. registrar clientes
	2. registrar empleados
	3. registrar productos
	4. Realizar ventas
	
	
FUNCIONES ESPECIFICAS:
	
	1.PRODUCTOS:
		·Crear productos (en oferta)
		·Activar y Desactivar ofertas
		·Mostrar cambios de precio(al momento de la venta)
		·Consultar info
		·Reducir Stock
		·Consultar
		
	2.EMPLEADOS:
		·"Inciar sesion/validar"
		
	3.CLIENTES:
		·Obtener descuento
	
	4.PROVEEDORES:
		·Consultar
RELACIONES:
   
    1.Venta -> Producto
	2.Cliente -> Venta
	3.Empleado(vendedor) -> Venta
	4.Proveedor -- Producto
