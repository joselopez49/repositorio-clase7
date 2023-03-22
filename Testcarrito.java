package practica5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class Testcarrito {

	@Test
	void testCostoFinalDescuentoFijo() {
		Producto producto1= new Producto( "Arroz","32t4", 2000);
		Producto producto2= new Producto( "Atun", "32y7",200);
		Producto producto3= new Producto( "sal", "32e5",200);
		
		Carrito micarrito = new Carrito (producto1, producto2, producto3, LocalDateTime.parse("2023-02-12T11:12:00"));
		Descuentos desfijo= new Descuentofijo(4000);
		float valorFinal= micarrito.costofinal(desfijo);
		assertEqual(valorFinal,4000);
	}
	private void assertEqual(float valorFinal, int i) {
		// TODO Auto-generated
		
	}
	@Test
	void testCostoFinalDescuentoporcentual() {
		Producto producto1= new Producto( "Arroz","32t4", 4000);
		Producto producto2= new Producto( "Atun", "32y7",4000);
		Producto producto3= new Producto( "sal", "32e5",2000);
		
		Carrito micarrito = new Carrito (producto1, producto2, producto3, LocalDateTime.parse("2023-02-12T11:12:00"));
		Descuentos desfijo= new Descuentoporcentual(0.5F);
		float valorFinal= micarrito.costofinal(desfijo);
		assertEqual(valorFinal,4000);
		
	}
	@Test
	void testCostoFinalDescuentoporcentajeconTope() {
		Producto producto1= new Producto( "Arroz","32t4", 4000);
		Producto producto2= new Producto( "Atun", "32y7",4000);
		Producto producto3= new Producto( "sal", "32e5",2000);
		
		Carrito micarrito = new Carrito (producto1, producto2, producto3, LocalDateTime.parse("2023-02-12T11:12:00"));
		Descuentos desporcentaje= new DescuentoporcentajeconTope(0.5F);
		
		desporcentaje.setValorDesc(0.20F);
		
		float valorFinal= micarrito.costofinal(desporcentaje);
		assertEqual(valorFinal,8000);
		
	}

}
