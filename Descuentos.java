package practica5;

public abstract class Descuentos {
		private float valor;	
		
			
		
		
		public Descuentos(float valor) {
			
			this.valor = valor;
		}
		
		public float getValorDesc() {
		return valor;
		}
		public void setValorDesc(float valor) {
		this.valor = valor;
		}
		public abstract float valorFinal(float valorInicial);

}
