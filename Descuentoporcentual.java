package practica5;

public class Descuentoporcentual extends Descuentos{

	public Descuentoporcentual(float valor) {
		super(valor);
		
	}

	@Override
	public float valorFinal(float valorInicial) {
		
		return valorInicial- (valorInicial* super.getValorDesc());
	}
	
	
	
	
	

}
