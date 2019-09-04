package br.ufrn.imd.almoxarifado.controladores;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.ufrn.imd.almoxarifado.repositorios.UsuarioRepositorio;
import br.ufrn.imd.almoxarifado.dominio.Usuario;

@Named("usuarioMBean")
@SessionScoped
public class UsuarioMBean implements Serializable {
	
	private Usuario usuario;
	private Usuario usuarioLogado;
	
	public UsuarioMBean() {
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	
	public String logar() {
		Usuario usuarioDB = UsuarioRepositorio.getUsuario(usuario.getNomeUsuario(), usuario.getSenha());
		
		if(usuarioDB != null) {
			usuarioLogado = usuarioDB;
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioLogado", usuarioLogado);
			
			return "/pages/index.jsf";
		} else {
			FacesMessage msg = new FacesMessage("Usuario nao encontrado.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("", msg);
			
			return null;
		}
	}
}
