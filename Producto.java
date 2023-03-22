package practica5;

public class Producto {
	String nombre;
	String codigo;
	float precio;
	float costofinal;
	
	public Producto(String nombre, String codigo, float precio) {
		
		this.nombre= nombre;
		this.codigo= codigo;
		this.precio= precio;
		
				
	}
	public String getnombre() {
		
		return this.nombre;
	}
	public void setnombre(String nuevonombre) {
		this.nombre= nuevonombre;
		
	}
	public String getcodigo() {
		
		return this.codigo;
	}
	public void setcodigo(String nuevocodigo) {
		this.codigo= nuevocodigo;
				
	}
	
		
		
	public void setprecio(float nuevoprecio) {
		this.precio= nuevoprecio;
		
	}
	public float costofinal() {
		
		return this.precio;
	}
	
		
		
	}


