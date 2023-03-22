package practica5;

import java.time.LocalDateTime;

public class Carrito {
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private LocalDateTime fechadecompra;
	
	
	public  Carrito (Producto producto1, Producto producto2, Producto producto3, LocalDateTime fechadecompra) {
		this.producto1=producto1;
		this.producto2=producto2;
		this.producto3=producto3;
		this.fechadecompra=fechadecompra;
		
			
				
	}
	public Producto getProducto1() {
		return this.producto1;
		
	}
	public void setProducto1(Producto nuevoproducto1) {
		this.producto1= nuevoproducto1;
		
	}
	public Producto getProducto2() {
		return this.producto2;
	}
	public void setProducto2(Producto nuevoproducto2) {
		this.producto2= nuevoproducto2;
		
	}
	public Producto getProducto3() {
		return this.producto3;
		
	}
	public void setProducto3(Producto nuevoproducto3) {
		this.producto3= nuevoproducto3;
				
	}
	public LocalDateTime getFechadecompra() {
		return this.fechadecompra;
	}
	public void setFechadecompra(LocalDateTime nuevofechadecompra) {
		this.fechadecompra= nuevofechadecompra;		
		
	}
	public float costofinal(Descuentos desc) {
	float total= desc.valorFinal(producto1.costofinal()+ this.producto2.costofinal()+ this.producto3.costofinal());
		return  total;
	}
	
	
		
	}


