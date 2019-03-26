package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TAB_ITEM_TESTE")
@SequenceGenerator(name="item",sequenceName="SQ_TB_ITEM", allocationSize = 1)
public class Item {	
	
	@Id
	@GeneratedValue(generator="item",strategy=GenerationType.SEQUENCE)
	@Column(name="cod_item_teste")
	private int codigo;	
	
	@Column(name="desc_item_teste")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="cod_caso")
	private Caso caso;
	
	@ManyToMany
	@JoinTable(name="T_ITEM_USUARIO",
	joinColumns= @JoinColumn(name="cod_item")
	, inverseJoinColumns= @JoinColumn(name="cod_usuario"))
	private List<Usuario> usuarios = new ArrayList<>();

}
