package practica5;

public class DescuentoporcentajeconTope extends Descuentoporcentual{
	private float tope;

	public DescuentoporcentajeconTope(float tope) {
		super(0);
		this.tope=tope;
		
	}
	public float getTope() {
		return this. tope;
	}
	public void setTope(float nuevovalor) {
		this.tope= nuevovalor;
	}
	@Override
	public void setValorDesc(float valor) {
		if(valor>this.tope) {
			super.setValorDesc(0);
			System.out.println("El-valor-esta-por-encima-del-Tope");
		}else {
			super.setValorDesc(valor);
		}
	}
	

}
