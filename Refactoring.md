### ** PROVISORIO** 

# Ejercicio 1
## Ejercicio 1.1 - Protocolo de Cliente
La clase Cliente tiene el siguiente protocolo. ¿Cómo puede mejorarlo? 
```java
/** 
* Retorna el límite de crédito del cliente
*/
protected double lmtCrdt() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtFcE(LocalDate f1, LocalDate f2) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtCbE(LocalDate f1, LocalDate f2) {...
```
Malos olores:
* los nombres de los métodos no describen fácilmente su comportamiento o qué se espera de cada uno
* los parámetrs LocalDate f1, f2 deben ser más descriptivos: ejemplo "desde-hasta" o "fechaInicio-fechaFin"

## Ejercicio 1.2
Diseño inicial (figura 1) -> para qué tiene el ID si lo chequea así
Diseño revisado (figura 2) -> Parecería estar bien (o mejor que el anterior). Ahora bien, una persona podría conocer los proyectos en los que está involucrado (por ejemplo, una lista de Proyecto)
Hay envidia de atributos y la modificación es apropiada, ya que en el diseño inicial estaba delegando a cada persona una verificación realizable desde el Proyecto (pues, el proyecto conoce quién participa)

## Ejercicio 1.3
Analice el código que se muestra a continuación. Indique qué code smells encuentra y cómo pueden corregirse.	
```java
public void imprimirValores() {
	int totalEdades = 0;
	double promedioEdades = 0;
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
		totalSalarios = totalSalarios + empleado.getSalario();
	}
	promedioEdades = totalEdades / personal.size();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
			
}
```
Code smells:
* Método largo -> si y no, te alarma que algo para pero no es el problema si
* Falta modularización, p.e. agregar método calcularPromedio(), agregar toString(), etc

# Ejercicio 2
Para cada una de las siguientes situaciones, realice en forma iterativa los siguientes pasos:
(i) indique el mal olor,
(ii) indique el refactoring que lo corrige, 
(iii) aplique el refactoring, mostrando el resultado final (código y/o diseño según corresponda). 
Si vuelve a encontrar un mal olor, retorne al paso (i). 

## Ejercicio 2.1
```java
public class EmpleadoTemporario {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    public double sueldo() {
	return this.sueldoBasico
		+(this.horasTrabajadas * 500) 
		+(this.cantidadHijos * 1000) 
		-(this.sueldoBasico * 0.13);
    }
}

public class EmpleadoPlanta {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
	+ (this.cantidadHijos * 2000)
	- (this.sueldoBasico * 0.13);
    }
}

public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
```

### Inciso i
Bad smells:
* Falta herencia (clase Empleado)
* Atributos públicos
* Código duplicado

### Inciso 2
* Herencia y código duplicado -> Template Method
* Privatizar atributos

### Inciso 3
Clase Empleado
```java
public abstract class Empleado {
	private String nombre;
	private String apellido;
	private double sueldoBasico;

	static double deducciones = 0.13;

	public Empleado(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasico = 0;
	}

	public double sueldo(){
		return this.sueldoBasico - (this.sueldoBasico * deducciones);
	}

public class EmpleadoPasante extends Empleado {

	public EmpleadoPasante(String nombre, String apellido){
		super(nombre,apellido);
	}
}

public abstract class EmpleadoConHijos extends Empleado{
	private int cantidadHijos;

	static double adicionalPorHijo = 1000;

	public EmpleadoConHijos(String nombre, String apellido){
		super(nombre,apellido);
		this.cantidadHijos = 0;
	}

	public double sueldo(){
		return super().sueldo() + this.cantidadHijos * adicionalPorHijo;
	}
}

public class EmpleadoPlanta extends EmpleadoConHijos {

	public EmpleadoPlanta(String nombre, String apellido){
		super(nombre,apellido);
	}
}

public class EmpleadoTemporario extends EmpleadoConHijos {
	private double horasTrabajadas;

	static double bonusPorHora = 500;

	public EmpleadoTemporario(String nombre, String apellido){
		super(nombre,apellido);
		this.horasTrabajadas = 0;
	}

	public double sueldo(){
		return super().sueldo() + this.horasTrabajadas * bonusPorHora;
	}
}
```

## Ejercicio 2.2

```java
public class Juego {
    // ......
    public void incrementar(Jugador j) {
        j.puntuacion = j.puntuacion + 100;
    }
    public void decrementar(Jugador j) {
        j.puntuacion = j.puntuacion - 50;
    }

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
}
}

```
### Inciso i
Bad smells:
* Feature envy
* Clase de datos (data class)


### Inciso 2
* Feature envy y clase de datos -> Move method

### Inciso 3
```java
public class Juego {
    private Jugador jugador; //disfrutar
	//....
}

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;

    public void incrementar() {
        this.puntuacion = this.puntuacion + 100;
    }
    public void decrementar() {
        this.puntuacion = this.puntuacion - 50;
    }
}
```

## Ejercicio 2.3

```java
/**
* Retorna los últimos N posts que no pertenecen al usuario user
*/
public List<Post> ultimosPosts(Usuario user, int cantidad) {
        
    List<Post> postsOtrosUsuarios = new ArrayList<Post>();
    for (Post post : this.posts) {
        if (!post.getUsuario().equals(user)) {
            postsOtrosUsuarios.add(post);
        }
    }
        
   // ordena los posts por fecha
   for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
       int masNuevo = i;
       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
           if (postsOtrosUsuarios.get(j).getFecha().isAfter(
     postsOtrosUsuarios.get(masNuevo).getFecha())) {
              masNuevo = j;
           }    
       }
      Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
      postsOtrosUsuarios.set(masNuevo, unPost);    
   }
        
    List<Post> ultimosPosts = new ArrayList<Post>();
    int index = 0;
    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
    while (postIterator.hasNext() &&  index < cantidad) {
        ultimosPosts.add(postIterator.next());
    }
    return ultimosPosts;
}


```
### inciso i
Bad smells:
* Reinventar la rueda
* Metodo largo

### inciso 2
* Reinventar la rueda -> usar stream 
* Metodo largo -> extract method

### inciso 3
* Consultar, esta bien asi o podriamos utilizar extract method para separar cada etapa?

```
java

public List<Post> ultimosPosts(Usuario user, int cantidad) {
    return this.posts.stream()
                .filter(post -> post.getUsuario() !== user)
                .sorted((p1,p2) -> p2.getFecha().compareTo(p1.getFecha()))
                .limit(cantidad)
                .collect(Collectors.toList());
}

```

## Ejercicio 2.4
```java
public class Producto {
    private String nombre;
    private double precio;
    
    public double getPrecio() {
        return this.precio;
    }
}

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

}

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
return this.items.stream().mapToDouble(item -> item.getProducto().getPrecio() * item.getCantidad()).sum();
    }
}
```
### Inciso i
Bad smell:
* Feature envy
* Clase de datos (ItemCarrito)

### Inciso ii
consultar cómo llamar la solución

### Inciso iii
```java
public class Producto {
    private String nombre;
    private double precio;
    
    public double getPrecio() {
        return this.precio;
    }
}

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

	public double total() {
		return this.producto.getPrecio() * this.cantidad;
	}

}

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
return this.items.stream().mapToDouble(item -> item.total()).sum();
    }
}
```
## Ejercicio 2.5
```java
public class Supermercado {
   public void notificarPedido(long nroPedido, Cliente cliente) {
     String notificacion = MessageFormat.format(“Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}”, new Object[] { nroPedido, cliente.getDireccionFormateada() });

     // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
    System.out.println(notificacion);
  }
}

public class Cliente {
   public String getDireccionFormateada() {
	return 
		this.direccion.getLocalidad() + “, ” +
		this.direccion.getCalle() + “, ” +
		this.direccion.getNumero() + “, ” +
		this.direccion.getDepartamento()
      ;
}
```
### Inciso i
Bad smells:
* Feature envy? -> la dirección debe formatearse, no el cliente
* Clase de datos (Dirección)
No falta una conexión con Supermercado?

### Inciso ii
* Move method

### Inciso iii
```java
public class Supermercado {
   public void notificarPedido(long nroPedido, Cliente cliente) {
     String notificacion = MessageFormat.format(“Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}”, new Object[] { nroPedido, cliente.getDireccionFormateada() });

     // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
    System.out.println(notificacion);
  }
}

public class Direccion {
   public String getDireccionFormateada() {
	return 
		this.direccion.getLocalidad() + “, ” +
		this.direccion.getCalle() + “, ” +
		this.direccion.getNumero() + “, ” +
		this.direccion.getDepartamento()
      ;
}
```
## Ejercicio 2.6
```java
public class Usuario {
    String tipoSubscripcion;
    // ...

    public void setTipoSubscripcion(String unTipo) {
   	 this.tipoSubscripcion = unTipo;
    }
    
    public double calcularCostoPelicula(Pelicula pelicula) {
   	 double costo = 0;
   	 if (tipoSubscripcion=="Basico") {
   		 costo = pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
   	 }
   	 else if (tipoSubscripcion== "Familia") {
   		 costo = (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
   	 }
   	 else if (tipoSubscripcion=="Plus") {
   		 costo = pelicula.getCosto();
   	 }
   	 else if (tipoSubscripcion=="Premium") {
   		 costo = pelicula.getCosto() * 0.75;
   	 }
   	 return costo;
    }
}
public class Pelicula {
    LocalDate fechaEstreno;
    // ...

    public double getCosto() {
   	 return this.costo;
    }
    
    public double calcularCargoExtraPorEstreno(){
	// Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
   	return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
    }
}

```
### Inciso i
Bad smell = Switch statement

### Inciso ii
Replace conditional with polyporphism (switch statement), move method?

### Inciso iii
```java
public abstract class Usuario {
    // ...
	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto();
	}

   	 else if (tipoSubscripcion=="Plus") {
   		 costo = pelicula.getCosto();
   	 }
   	 else if (tipoSubscripcion=="Premium") {
   		 costo = pelicula.getCosto() * 0.75;
   	 }
   	 return costo;
    }
}
public class UsuarioBasico extends Usuario {
	public double calcularCostoPelicula(Pelicula pelicula) {
		return super().calcularCostoPeliciula(pelicula) + pelicula.calcularCargoExtraPorEstreno();
	}
}
public class UsuarioFamilia extends Usuario { // vale la pena hacer una jerarquía por copiar y pegar?
	static double descuento = 0.90;	
	public double calcularCostoPelicula(Pelicula pelicula) {
		return super().calcularCostoPeliciula(pelicula) + pelicula.calcularCargoExtraPorEstreno() * descuento;
	}
}
public class UsuarioPlus extends Usuario {
	public double calcularCostoPelicula(Pelicula pelicula) {
		return super().calcularCostoPeliciula(pelicula);
	}
}
public class UsuarioPremium extends Usuario {
	static double descuento = 0.75;
	public double calcularCostoPelicula(Pelicula pelicula) {
		return super().calcularCostoPeliciula(pelicula) * descuento;
	}
}


public class Pelicula {
    LocalDate fechaEstreno;
    // ...

    public double getCosto() {
   	 return this.costo;
    }
    
    public double calcularCargoExtraPorEstreno(){
	// Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
   	return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
    }
}

```

# Consultas
* Cómo levantamos como incorrecto algo que decimos que se puede resolver con streams? o de manera más simple? -> Es el famoso caso de "reinventar la rueda": sugerir que existe una librería en java que ya lo hace.
* En qué caso levanto mal una "clase de datos"? Porque a veces es real el smell pero la necesito para poder identificar correctamente un objeto -> casi siempre este bad smell viene atado a la envidia de atributos
* Es mas facil que patrones? -> No se, pero, al final del día, el objetivo del refactoring es preservar el comportamiento del sistema antes y después de la intervención, dando una mejora a cómo estaba antes
* Es un bad smell que ya me inicialicen en la declaración de la variable el valor?
* Es un bad smell que no declaren magic numbers?
