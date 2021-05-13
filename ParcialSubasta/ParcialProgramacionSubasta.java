import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Usuario Juan= new Usuario("Juan",100);
		Usuario Pedro= new Usuario("Pedro",150);
		Usuario Enrique= new Usuario("Enrique",300);
		Subasta SubastaTel=new Subasta("Telefono movil",Juan);
		Subasta SubastaImp= new Subasta("Impresora láser",Pedro);
		ArrayList<Usuario> listaUsuarios= new ArrayList<Usuario>();
		ArrayList<Subasta> listaSubastas= new ArrayList<Subasta>();
		listaSubastas.add(SubastaTel);
		listaSubastas.add(SubastaImp);
		listaUsuarios.add(Juan);
		listaUsuarios.add(Pedro);
		listaUsuarios.add(Enrique);
		
		SubastaTel.Pujar(Pedro, 100,SubastaTel);
		System.out.println("La puja mayor es de: "+ SubastaTel.getPujaMayor().getUsuario().getNombre()+ " con una cantidad de: "+ SubastaTel.getPujaMayor().getSuma());
		if(SubastaTel.Pujar(Enrique, 50,SubastaTel)==false) {
			System.out.println("No supera la anterior puja mayor");
		}
		SubastaTel.Ejecutar(SubastaTel);
		SubastaTel.Pujar(Enrique, 200,SubastaTel);
		SubastaImp.PujarMinimo(Enrique);
		SubastaImp.Ejecutar(SubastaImp);
		
		for(Usuario usuario: listaUsuarios) {
			System.out.println("El usuario: "+usuario.getNombre()+" tiene:"+usuario.getCredito()+" creditos");
		}
		for(Subasta subasta: listaSubastas) {
			System.out.println("La subasta de: "+ subasta.getNombreProducto()+" pertenece a "+subasta.getUsuarioPropietario().getNombre());
		}
	
		
	}
	
	
	

}
