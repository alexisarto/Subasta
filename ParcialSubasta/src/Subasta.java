import java.util.ArrayList;

public class Subasta {
	private String nombreProducto;
	private Usuario usuarioPropietario;
	private Boolean estado=true;
	private ArrayList<Puja> listadePujas;
	private Puja pujaMayor;
	
	public Subasta(String nP,Usuario uP) {
		this.nombreProducto= nP;
		this.usuarioPropietario= uP;
		this.listadePujas= new ArrayList<Puja>();
		this.pujaMayor= null;
	}
	
	
	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public Usuario getUsuarioPropietario() {
		return usuarioPropietario;
	}


	public void setUsuarioPropietario(Usuario usuarioPropietario) {
		this.usuarioPropietario = usuarioPropietario;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	public ArrayList<Puja> getListadePujas() {
		return listadePujas;
	}


	public void setListadePujas(ArrayList<Puja> listadePujas) {
		this.listadePujas = listadePujas;
	}


	public Puja getPujaMayor() {
		return pujaMayor;
	}


	public void setPujaMayor(Puja pujaMayor) {
		this.pujaMayor = pujaMayor;
	}


	public boolean Pujar(Usuario u, Integer s,Subasta su) {
		if(su.getEstado()==true && u.getCredito()>= s && u != this.usuarioPropietario && pujaMayor==null) {
			Puja pActual= new Puja(u,s);
			pujaMayor= pActual;
			listadePujas.add(pActual);
			return true;
		}else if(su.getEstado()==true && u.getCredito()>= s && u != this.usuarioPropietario && s>pujaMayor.getSuma()) {
			Puja pActual= new Puja(u,s);
			pujaMayor= pActual;
			listadePujas.add(pActual);
			return true;
		}else if(su.getEstado()==false) {
			System.out.println("La subasta esta cerrada");
			return false;
		}else {
			return false;
		}
	}
	
	public boolean PujarMinimo(Usuario u) {
		if(this.estado=true && u != this.usuarioPropietario && pujaMayor!=null) {
			Puja pActual= new Puja(u,pujaMayor.getSuma()+1);
			pujaMayor= pActual;
			listadePujas.add(pActual);
			return true;
	}else if(this.estado=true && u != this.usuarioPropietario && pujaMayor==null) {
			Puja pActual= new Puja(u,1);
			return true;
	}else{
		return false;}
	}

		
	public boolean Ejecutar(Subasta s) {
		if(this.estado=true && listadePujas!= null && pujaMayor!=null) {
			pujaMayor.getUsuario().setCredito(pujaMayor.getUsuario().getCredito()-pujaMayor.getSuma());
			usuarioPropietario.setCredito(usuarioPropietario.getCredito()+pujaMayor.getSuma());
			s.setEstado(false);
			System.out.println("la subasta se ha cerrado");
			return true;
		}else{
			return false;
			}
		}
}
		

