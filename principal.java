package practica5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class principal {
	public static void main(String[] args) {
		String archivodeentrada= "compras.txt"; 
		
		try {
			List<String> lista= Files.readAllLines(Paths.get(archivodeentrada));
			
			String[] linea1= lista.get(1).split(" ");
			String[] linea2= lista.get(2).split(" ");
			String[] linea3= lista.get(3).split(" ");
			Producto producto1= new Producto( linea1[1], linea1[2], Float.parseFloat(linea1[0]));
			Producto producto2= new Producto( linea2[1], linea2[2], Float.parseFloat(linea2[0]));
			Producto producto3= new Producto( linea3[1], linea3[2], Float.parseFloat(linea3[0]));
			
			Carrito carrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-02-12T11:12:00"));
			Persona persona1= new Persona("Jose","Lopez", LocalDateTime.parse("1968-06-09T12:00:00"),54 , carrito);
							
					
			Carrito micarrito= persona1.getcarrito();
			
			Descuentos desfijo= new Descuentofijo(3990);
			Descuentos desporcentaje= new Descuentoporcentual(0.50F);
			Descuentos desporcentajeconTope= new DescuentoporcentajeconTope(0.30F);
			
			desporcentajeconTope.setValorDesc(0.20F);
			
			float resultado= micarrito.costofinal(desporcentajeconTope);
			System.out.println("costo-final-es :" + resultado);
			
		}catch(IOException e) {
			System.out.println("Error-en-la-Operacion" + e);
		}
	}

}
