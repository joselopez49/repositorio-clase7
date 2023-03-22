package practica5;

import java.time.LocalDateTime;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDateTime fechadenacimiento;
	private int edad;
	private Carrito carrito;
	
	public Persona(String nombre, String apellido, LocalDateTime fechadenacimiento, int edad, Carrito carrito) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.fechadenacimiento= fechadenacimiento;
		this.edad= edad;
		this.carrito=carrito;
	}
	public String getNombre() {
		return this.nombre;
		
	}
	public void setNombre(String nuevonombre) {
		this.nombre= nuevonombre;
				
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String nuevoapellido) {
		this.apellido= nuevoapellido;
		
	}
	public LocalDateTime getfechadenacimiento() {
		return this.fechadenacimiento;
		
	}
	public void setfechadenacimiento(LocalDateTime nuevofechadenacimiento) {
		this.fechadenacimiento= nuevofechadenacimiento;
		
	}
	public int getEdad() {
		return this.edad ;
	}
	public void setEdad(int nuevoedad) {
		this.edad= nuevoedad;
		
	}
	public Carrito getcarrito() {
		return this.carrito;
		
	}
	public void setcarrito(Carrito nuevocarrito) {
		this.carrito= nuevocarrito;
	}

}
