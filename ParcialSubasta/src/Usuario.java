//Defina la clase Usuario de la aplicación de subastas. Un usuario se caracteriza por dos propiedades: nombre y crédito. El crédito corresponde al dinero disponible para poder pujar en las subastas.
//Un usuario se construye obligatoriamente estableciendo el nombre. Opcionalmente se puede establecer el crédito inicial.
//La funcionalidad de la clase es:
//- incrementar crédito: incrementa el crédito del usuario en una cantidad.
//- decrementar crédito: decrementar el crédito del usuario en una cantidad. 



public class Usuario {
	private String nombre;
	private Integer credito;
	
	public Usuario(String n,Integer c) {
		nombre= n;
		if(c==null) {
			this.credito=0;
		}else {
			this.credito=c;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCredito() {
		return credito;
	}

	public void setCredito(Integer credito) {
		this.credito = credito;
	}
	
	public Integer incrementaCredito(Integer aumento) {
		this.credito+= aumento;
		return credito;
	}
	
	public Integer decrementAumento(Integer aumento) {
		this.credito-= aumento;
		return credito;
	}
	

}
