package practica5;

public class Descuentofijo extends Descuentos{
	
	
	public Descuentofijo(float valor) {
		super(valor);
	}

	@Override
	public float valorFinal(float valorInicial) {
		
		return valorInicial- super.getValorDesc();
	}
	
	

}
