package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.Usuario;

public class UsuarioRepositorio {
	
	public static List<Usuario> usuarios;
	
	public static Usuario getUsuario(String nomeUsuario, String senha) {
		
		if(usuarios == null) {
			usuarios = new ArrayList<Usuario>();
			Usuario usuario = new Usuario("edivania", "epo");
			usuario.setNome("Edivania Pontes");
			usuarios.add(usuario);
		}
		
		for(Usuario u : usuarios) {
			if(u.getNomeUsuario().equals(nomeUsuario) && u.getSenha().contentEquals(senha)) {
				return u;
			}
		}
		
		return null;
	}
}
