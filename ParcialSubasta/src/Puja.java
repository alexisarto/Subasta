//Defina la clase Puja de la aplicación de subastas. Una puja representa la cantidad de dinero que ofrece un usuario por el producto de una subasta. Las propiedades que caracterizan a una Puja son el usuario que la realiza y la cantidad de dinero que ofrece.
//Las pujas se construyen estableciendo las dos propiedades que caracterizan a la clase.
//Por último, la clase no proporciona más funcionalidad que la consulta de las propiedades.




public class Puja {
	private Usuario Usuario;
	private Integer suma;
	
	public Puja(Usuario u, Integer s) {
		this.Usuario= u;
		this.suma= s;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public Integer getSuma() {
		return suma;
	}

	
	

}
