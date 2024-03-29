package br.ufrn.imd.material.controladores;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.material.dominio.Material;
import br.ufrn.imd.material.repositorios.MaterialRepositorio;

@Named("materialMBean")
@SessionScoped
public class MaterialMBean implements Serializable {
	
	private Material material;	
	private DataModel<Material> materiaisDataModel;
	
	@Inject
	private UsuarioMBean usuarioMBean;
	
	public MaterialMBean() {
		material = new Material();
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public DataModel<Material> getMateriaisDataModel() {
		return materiaisDataModel;
	}

	public void setMateriaisDataModel(DataModel<Material> materiaisDataModel) {
		this.materiaisDataModel = materiaisDataModel;
	}

	public UsuarioMBean getUsuarioMBean() {
		return usuarioMBean;
	}

	public void setUsuarioMBean(UsuarioMBean usuarioMBean) {
		this.usuarioMBean = usuarioMBean;
	}
	
	public String novoMaterial() {
		material = new Material();
		return "/pages/material/form.jsf";
	}
	
	public String listarMateriais() {
		materiaisDataModel = new ListDataModel<Material>(MaterialRepositorio.listar());
		return "/pages/material/list.jsf";
	}
	
	public String cadastrarMaterial() {
		material.setUsuarioCadastro(usuarioMBean.getUsuarioLogado());
		MaterialRepositorio.adicionar(material);
		material = new Material();
		return "/pages/material/form.jsf";
	}
	
	public String removerMaterial() {
		Material materialRemover = materiaisDataModel.getRowData();
		MaterialRepositorio.remover(materialRemover);
		return listarMateriais();
	}
}
